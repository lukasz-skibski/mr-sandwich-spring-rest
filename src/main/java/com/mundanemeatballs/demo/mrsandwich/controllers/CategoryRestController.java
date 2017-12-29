package com.mundanemeatballs.demo.mrsandwich.controllers;

import com.mundanemeatballs.demo.mrsandwich.dao.CategoryDao;
import com.mundanemeatballs.demo.mrsandwich.model.CategoryDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class CategoryRestController {

    @Autowired
    private CategoryDao categoryDao;

    private ModelMapper modelMapper = new ModelMapper();

    @RequestMapping(value = "/category")
    public Map getAllCategories() {

        Map response = new HashMap<>();
        response.put("list", categoryDao.findAll()
                .stream().map(e -> modelMapper.map(e, CategoryDto.class))
                .collect(Collectors.toList()));

        return response;
    }
}
package com.mundanemeatballs.demo.mrsandwich.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Product
 */
@Document
@Getter
@Setter
public class Product {
    @Id
    private String id;

    private String name;

    private Double price;

    @DBRef
    private List<Category> categories;
}

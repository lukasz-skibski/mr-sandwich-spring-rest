package com.mundanemeatballs.demo.mrsandwich.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Company
 */
@Document
public class Company {
    @Id
    private String id;

    private String name;

    @DBRef
    private List<Product> products;
}

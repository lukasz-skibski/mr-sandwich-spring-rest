package com.mundanemeatballs.demo.mrsandwich.repositories;

import com.mundanemeatballs.demo.mrsandwich.model.Category;
import com.mundanemeatballs.demo.mrsandwich.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * ProductRepository
 */
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends MongoRepository<Product, String> {
    Product findOneByCategories(Category category);
}

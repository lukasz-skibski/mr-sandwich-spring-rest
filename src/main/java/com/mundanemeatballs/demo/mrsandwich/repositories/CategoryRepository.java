package com.mundanemeatballs.demo.mrsandwich.repositories;

import com.mundanemeatballs.demo.mrsandwich.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * CategoryRepository
 */
@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")
public interface CategoryRepository extends MongoRepository<Category, String> {
}

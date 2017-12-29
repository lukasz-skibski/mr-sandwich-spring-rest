package com.mundanemeatballs.demo.mrsandwich.dao;

import com.mundanemeatballs.demo.mrsandwich.model.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository<CategoryEntity, Long> {
}

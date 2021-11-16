package com.laxit.cakeworld.repository;

import com.laxit.cakeworld.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

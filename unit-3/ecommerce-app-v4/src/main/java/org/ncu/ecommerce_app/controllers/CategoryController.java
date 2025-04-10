package org.ncu.ecommerce_app.controllers;

import org.ncu.ecommerce_app.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@RestController
@RequestMapping(value = "/ecommerce-app")
public class CategoryController {
	 @PersistenceContext
	    private EntityManager entityManager;

	    @GetMapping("/category/{id}")
	    public ResponseEntity<Category> getCategory(@PathVariable int id) {
	        Category category = entityManager.find(Category.class, id);
	        return ResponseEntity.ok(category);
	    }
}

package com.storeonline.service;

import com.storeonline.entity.Category;
import com.storeonline.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by elevitchi on 7/26/2017.
 */
@Transactional
@Component
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findCategory (long Id){
        return categoryRepository.findOne(Id);
    }

    public void save(Category category){
        categoryRepository.save(category);
    }

    public void delete(Category category){
        categoryRepository.delete(category);
    }
}

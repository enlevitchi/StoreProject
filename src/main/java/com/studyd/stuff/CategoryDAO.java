package com.studyd.stuff;

import com.storeonline.entity.Category;

import java.util.List;

/**
 * Created by elevitchi on 6/6/2017.
 */
public interface CategoryDAO {
    public List<Category> listCategory();
    public Category getCategoryById(Long categoryId);
}

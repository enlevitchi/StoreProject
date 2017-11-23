package com.studyd.stuff;

import com.storeonline.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by elevitchi on 6/6/2017.
 */
//@Service
//@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    public List<Category> listCategory() {
        return this.categoryDAO.listCategory();
    }
}

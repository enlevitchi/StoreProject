package com.storeonline.controller;

import com.storeonline.entity.Category;
import com.storeonline.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by elevitchi on 6/6/2017.
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("category")
    public Category construct(){
        return new Category();
    }

    @RequestMapping(value = "/")
    public String index() {
        return "category";
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String listCategory(Model model) {
        model.addAttribute("listCategory", this.categoryService.findAll());
        return "category";
    }

    @RequestMapping(value = "/category{id}", method = RequestMethod.GET)
    public String findCategory(@PathVariable long id, Model model){
       model.addAttribute(categoryService.findCategory(id));
        return "category";
       }
    @RequestMapping(value="/category/add", method = RequestMethod.GET)
    public String addCategoryForm(){

        return "addCategory";
    }

    @RequestMapping(value="/category/add", method = RequestMethod.POST)
    public String addCategory(@ModelAttribute("category") Category category){
        categoryService.save(category);
        return "redirect:/category";
    }








}

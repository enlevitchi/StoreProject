package com.storeonline.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by elevitchi on 6/6/2017.
 */

@Entity
@Table(name="category")
public class Category {

    @Id
    @Column(name="categoryid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    @Column(name="categoryname")
    private String categoryname;

    @Column(name="description")
    private String description;

    @OneToMany(mappedBy ="category")
    private List<Product> products;

    public Category(){
        // hibernate only
    }

    public Long getcategoryid() {
        return categoryId;
    }

    public void setcategoryid(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getcategoryname() {
        return categoryname;
    }

    public void setcategoryname(String categoryName) {
        this.categoryname = categoryName;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public List<Product> getproducts() {
        return products;
    }

    public void setproducts(List<Product> products) {
        this.products = products;
    }
}

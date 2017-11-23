package com.storeonline.entity;

import javax.persistence.*;

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
    private String CategoryName;

    @Column(name="description")
    private String Description;

    protected Category(){
        // hibernate only
    }

    public Category(String categoryName, String description) {
        CategoryName = categoryName;
        Description = description;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Long getcategoryId() {

        return categoryId;
    }

    public void setcategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryId != null ? !categoryId.equals(category.categoryId) : category.categoryId != null) return false;
        if (CategoryName != null ? !CategoryName.equals(category.CategoryName) : category.CategoryName != null)
            return false;
        return Description != null ? Description.equals(category.Description) : category.Description == null;

    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (CategoryName != null ? CategoryName.hashCode() : 0);
        result = 31 * result + (Description != null ? Description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", CategoryName='" + CategoryName + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

}

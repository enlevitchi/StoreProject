package com.storeonline.entity;

import javax.persistence.*;

/**
 * Created by elevitchi on 11/24/2017.
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name="productid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @ManyToOne
    @JoinColumn(name ="categoryId")
    private Category category;

    @Column(name="productName")
    private String productName;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Column(name="productDescription")
    private String productDescription;

    @Column(name="productColor")
    private String productColor;

    @Column(name="quantity")
    private Long quantity;





    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductColor() {
        return productColor;
    }

   public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Product(){
        //hibernate only
    }


}

package com.geeksforless.tfedorenko.supplier.dto;



public class DrugQuantityDto {

    private String article;
    private Integer quantity;

    public DrugQuantityDto(String article, Integer quantity) {
        this.article = article;
        this.quantity = quantity;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

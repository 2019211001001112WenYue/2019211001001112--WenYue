package com.wenyue.model;

public class Item {
    private Product product;
    private int quantity;
    public Item(){
        super();
    }
    public Item(Product product,int quantity){
        super();
        this.product = product;
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

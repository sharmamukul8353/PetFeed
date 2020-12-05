package com.recipes.petfeed;

public class FoodData {

    private String itemName;
    private String itemDescription;
    private String itemImage;

    public FoodData(){

    }

    public FoodData(String itemName, String itemDescription, String itemImage) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }
}

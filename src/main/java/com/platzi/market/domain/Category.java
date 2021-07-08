package com.platzi.market.domain;

public class Category   {

    private int categoryId;
    private String categor;
    private boolean active;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return categor;
    }

    public void setCategory(String categor) {
        this.categor = categor;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

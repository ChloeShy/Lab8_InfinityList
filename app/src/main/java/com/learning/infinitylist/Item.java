package com.learning.infinitylist;

public class Item {
    private String title;
    private String description;

    public Item(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }
}

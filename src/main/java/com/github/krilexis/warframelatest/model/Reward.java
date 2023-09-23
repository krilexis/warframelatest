package com.github.krilexis.warframelatest.model;

import java.util.List;

public class Reward {
    private Integer credits;
    private List<String> items;
    private List<CountedItem> countedItems;

    public Integer getCredits() {
        return credits;
    }
    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    public List<String> getItems() {
        return items;
    }
    public void setItems(List<String> items) {
        this.items = items;
    }
    public List<CountedItem> getCountedItems() {
        return countedItems;
    }
    public void setCountedItems(List<CountedItem> countedItems) {
        this.countedItems = countedItems;
    }

    
    
}

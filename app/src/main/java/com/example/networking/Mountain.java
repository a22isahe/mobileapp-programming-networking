package com.example.networking;

public class Mountain {

    private String name;

    private String type;

    private String company;
    private String category;
    private int size;
    private int cost;
    private String ID;


    public Mountain(String ID, String name, String type,String company, String category, int size, int cost) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.company = company;
        this.category = category;
        this.size = size;
        this.cost = cost;
    }


    public Mountain(String name) {
        this.name = name;
    }
    //Getters and setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                ", ID='" + ID + '\'' +
                '}';
    }
}
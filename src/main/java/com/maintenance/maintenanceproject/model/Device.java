package com.maintenance.maintenanceproject.model;

public class Device {
    //azonosító, név, helyszín, kategóriába sorolás

    private Long id;
    private String name;
    private String location;
    private String category;

    public Device(Long id, String name, String location, String category) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.category = category;
    }
    
    public Long getId() {
        return id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Long id) {
        this.id = id;
    }


    
}

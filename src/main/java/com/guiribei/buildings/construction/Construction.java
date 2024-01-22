package com.guiribei.buildings.construction;

import java.time.YearMonth;

public class Construction {
    private Long id;
    private String name;
    private String address;
    private String documentation;

    public Construction() {
    }

    public Construction(Long id, String name, String address, String documentation) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.documentation = documentation;
    }

    public Construction(String name, String address, String documentation) {
        this.name = name;
        this.address = address;
        this.documentation = documentation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    @Override
    public String toString() {
        return "Construction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", documentation='" + documentation + '\'' +
                '}';
    }
}

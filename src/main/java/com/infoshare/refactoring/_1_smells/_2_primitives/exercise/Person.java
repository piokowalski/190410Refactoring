package com.infoshare.refactoring._1_smells._2_primitives.exercise;

import java.util.List;

public class Person {

    private String name;
    private Boolean isFromPoland;
    private List<Documents> documents;

    public Person(String name, Boolean isFromPoland, List<Documents> documents) {
        this.name = name;
        this.isFromPoland = isFromPoland;
        this.documents = documents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFromPoland() {
        return isFromPoland;
    }

    public void setFromPoland(Boolean fromPoland) {
        isFromPoland = fromPoland;
    }

    public List<Documents> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Documents> documents) {
        this.documents = documents;
    }
}

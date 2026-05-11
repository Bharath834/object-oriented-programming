package com.java.oop.abstraction;

public class Certificate {
    int id;
    String name;
    String issuedBy;
    String issuedTo;
    String issuedDate;

    public Certificate(int id, String name, String issuedBy, String issuedDate, String issuedTo) {
        this.id = id;
        this.name = name;
        this.issuedBy = issuedBy;
        this.issuedDate = issuedDate;
        this.issuedTo = issuedTo;
    }
}

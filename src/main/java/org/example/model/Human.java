package org.example.model;

public class Human {
    String el1;
    String el2;
    String el3;
    String el4;
    public Human(String el1, String el2, String el3, String el4) {
        this.el1 = el1;
        this.el2 = el2;
        this.el3 = el3;
        this.el4 = el4;
    }

    public Human() {}

    public String getEl1() {
        return el1;
    }

    public void setEl1(String el1) {
        this.el1 = el1;
    }

    public String getEl2() {
        return el2;
    }

    public void setEl2(String el2) {
        this.el2 = el2;
    }

    public String getEl3() {
        return el3;
    }

    public void setEl3(String el3) {
        this.el3 = el3;
    }

    public String getEl4() {
        return el4;
    }

    public void setEl4(String el4) {
        this.el4 = el4;
    }

    @Override
    public String toString() {
        return "Human{" +
                 el1 + '\'' +
                el2 + '\'' +
                el3 + '\'' +
                el4 + '\'' +
                '}';
    }
}

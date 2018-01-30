package com.donepudi.examples.spring.core;

public class StudentBean {

    private String className;
    private String section;
    private int marks;

    /**
     * Default Constructor
     */
    public StudentBean() {

    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "className='" + className + '\'' +
                ", section='" + section + '\'' +
                ", marks=" + marks +
                '}';
    }
}

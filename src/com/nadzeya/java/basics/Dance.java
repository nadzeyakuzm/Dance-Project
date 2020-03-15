package com.nadzeya.java.basics;

public class Dance {

    private int id;
    private String Style;
    private String FirstName;
    private String LastName;

    public Dance(int id, String Style, String FirstName, String LastName){
        this.id = id;
        this.Style = Style;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Style='" + Style +
                ", FirstName=" + FirstName +
                ", LastName=" + LastName +
                '}';
    }
}

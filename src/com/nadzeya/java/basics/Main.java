package com.nadzeya.java.basics;
public class Main {
    public static void main(String[] args) {
        DBManager manager = new DBManager();

        manager.executeCommand(1, "Jazz");

        manager.executeCommand(2, "Nadzeya");

        manager.executeCommand(3, "2");


    }
}

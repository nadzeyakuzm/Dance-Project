package com.nadzeya.java.basics;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        String type = "9";

        DBManager manager = new DBManager();

        while(Integer.parseInt(type) != 0) {

            System.out.println("Введите 1, чтобы найти всех, кто занимается определенным стилем. \nВведите 2, чтобы посмотреть информацию человека по имени. \nВведите 3, чтобы удалить человека по ID.\nВведите 0 чтобы выйти.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                type = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            String data = "";

            if (Integer.parseInt(type) == 1) {
                System.out.println("Please, enter style:");
                data = reader.readLine();
                manager.executeCommand(Integer.parseInt(type), data);
            } else {
                if (Integer.parseInt(type) == 2) {
                    System.out.println("Please, enter First Name:");
                    data = reader.readLine();
                    manager.executeCommand(Integer.parseInt(type), data);
                } else {
                    if (Integer.parseInt(type) == 3) {
                        System.out.println("Please, enter ID:");
                        data = reader.readLine();
                        manager.executeCommand(Integer.parseInt(type), data);
                    }
                }
            }
        }
    }
}



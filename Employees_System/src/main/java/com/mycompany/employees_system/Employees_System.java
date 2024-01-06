package com.mycompany.employees_system;

import java.io.File;

public class Employees_System {
    public static void main(String[] args) {
        File dataFile = new File("data.bat");
        System.out.println("Dosya Yolu: " + dataFile.getAbsolutePath());
    }
}

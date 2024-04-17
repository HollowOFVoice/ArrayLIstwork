package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    ImplSamovar samovar = new ImplSamovar();
    samovar.add("Alenka");
        samovar.add("Alenka2");
        samovar.add("Alenka3");
        samovar.add(0,"Sardinka");
        System.out.println(samovar.contains(""));
    }
}
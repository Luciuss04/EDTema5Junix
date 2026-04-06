package com.luciuss04.tema05tests;

public class EsBisiesto {

    public static boolean esBisiesto(int anyo) {
        if (anyo % 400 == 0) {
            return true;
        } else if (anyo % 100 == 0) {
            return false;
        } else if (anyo % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

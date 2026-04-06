package com.luciuss04.tema05tests;

public class EvaluarContrasenya {

    public static String evaluarPassword(String password) {
        int puntos = 0;

        if (password.length() >= 8) {
            puntos++;
        }
        if (password.chars().anyMatch(Character::isUpperCase)) {
            puntos++;
        }
        if (password.chars().anyMatch(Character::isLowerCase)) {
            puntos++;
        }
        if (password.chars().anyMatch(Character::isDigit)) {
            puntos++;
        }
        if (password.chars().anyMatch(c -> !Character.isLetterOrDigit(c))) {
            puntos++;
        }

        if (puntos <= 2) {
            return "DEBIL";
        } else if (puntos <= 4) {
            return "MEDIA";
        } else {
            return "FUERTE";
        }
    }
}
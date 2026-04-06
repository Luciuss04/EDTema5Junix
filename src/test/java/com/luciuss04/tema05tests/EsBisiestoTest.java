package com.luciuss04.tema05tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EsBisiestoTest {

    // Divisible por 4 y no por 100 → bisiesto
    @Test
    public void divisiblePor4NoPor100_esBisiesto() {
        assertTrue(EsBisiesto.esBisiesto(2024));
    }

    //  Divisible por 100 y no por 400 → no bisiesto
    @Test
    public void divisiblePor100NoPor400_noEsBisiesto() {
        assertFalse(EsBisiesto.esBisiesto(1900));
    }

    //  Divisible por 400 → bisiesto
    @Test
    public void divisiblePor400_esBisiesto() {
        assertTrue(EsBisiesto.esBisiesto(2000));
    }

    // No divisible por 4 → no bisiesto
    @Test
    public void noDivisiblePor4_noEsBisiesto() {
        assertFalse(EsBisiesto.esBisiesto(2023));
    }
}
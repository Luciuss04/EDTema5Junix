package com.luciuss04.tema05tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClasificarEdadTest {

    //  - Edad negativa → debe lanzar excepción
    @Test
    public void edadNegativa_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> ClasificarEdad.clasificarEdad(-1));
    }

    //  Infancia
    @Test
    public void edadInfancia_devuelveInfancia() {
        assertEquals("Infancia", ClasificarEdad.clasificarEdad(3));
    }

    //  Niñez
    @Test
    public void edadNinez_devuelveNinez() {
        assertEquals("Niñez", ClasificarEdad.clasificarEdad(8));
    }

    //  Adolescencia
    @Test
    public void edadAdolescencia_devuelveAdolescencia() {
        assertEquals("Adolescencia", ClasificarEdad.clasificarEdad(15));
    }

    //  Juventud
    @Test
    public void edadJuventud_devuelveJuventud() {
        assertEquals("Juventud", ClasificarEdad.clasificarEdad(20));
    }

    //  Adultez
    @Test
    public void edadAdultez_devuelveAdultez() {
        assertEquals("Adultez", ClasificarEdad.clasificarEdad(40));
    }

    //  Vejez
    @Test
    public void edadVejez_devuelveVejez() {
        assertEquals("Vejez", ClasificarEdad.clasificarEdad(65));
    }

    //  Límite inferior Infancia
    @Test
    public void edadCero_devuelveInfancia() {
        assertEquals("Infancia", ClasificarEdad.clasificarEdad(0));
    }

    //  Límite inferior Niñez
    @Test
    public void edadSeis_devuelveNinez() {
        assertEquals("Niñez", ClasificarEdad.clasificarEdad(6));
    }

    //  Límite inferior Adolescencia
    @Test
    public void edadDoce_devuelveAdolescencia() {
        assertEquals("Adolescencia", ClasificarEdad.clasificarEdad(12));
    }

    //  Límite inferior Juventud
    @Test
    public void edadDieciocho_devuelveJuventud() {
        assertEquals("Juventud", ClasificarEdad.clasificarEdad(18));
    }

    // Límite inferior Adultez
    @Test
    public void edadVeinticinco_devuelveAdultez() {
        assertEquals("Adultez", ClasificarEdad.clasificarEdad(25));
    }

    //  Límite inferior Vejez
    @Test
    public void edadSesenta_devuelveVejez() {
        assertEquals("Vejez", ClasificarEdad.clasificarEdad(60));
    }
}

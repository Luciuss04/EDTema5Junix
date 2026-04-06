package com.luciuss04.tema05tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalificacionTest {

    //  Nota negativa → debe lanzar excepción
    @Test
    public void notaNegativa_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Calificacion.calificacion(-1));
    }

   // Nota mayor de 10 → debe lanzar excepción
    @Test
    public void notaMayorDiez_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Calificacion.calificacion(11));
    }

    //  Suspenso
    @Test
    public void nota3_devuelveSuspenso() {
        assertEquals("SUSPENSO", Calificacion.calificacion(3));
    }

    // Suficiente
    @Test
    public void nota5_devuelveSuficiente() {
        assertEquals("SUFICIENTE", Calificacion.calificacion(5));
    }

    //  Bien
    @Test
    public void nota6_devuelveBien() {
        assertEquals("BIEN", Calificacion.calificacion(6));
    }

    //  Notable
    @Test
    public void nota7_devuelveNotable() {
        assertEquals("NOTABLE", Calificacion.calificacion(7));
    }

    //  Sobresaliente
    @Test
    public void nota9_devuelveSobresaliente() {
        assertEquals("SOBRESALIENTE", Calificacion.calificacion(9));
    }
}
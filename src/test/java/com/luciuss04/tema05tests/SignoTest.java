package com.luciuss04.tema05tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignoTest {

   // Número positivo → debe devolver 1
    @Test
    public void signoPositivo_devuelve1() {
        assertEquals(1, Signo.signo(5));
    }

    // Número negativo → debe devolver -1
    @Test
    public void signoNegativo_devuelveMenos1() {
        assertEquals(-1, Signo.signo(-3));
    }

    //  Cero → debe devolver 0
    @Test
    public void signoCero_devuelve0() {
        assertEquals(0, Signo.signo(0));
    }

}


package com.luciuss04.tema05tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContarPositivosTest {

    //  Array vacío → debe devolver 0
    @Test
    public void arrayVacio_devuelveCero() {
        assertEquals(0, ContarPositivos.contarPositivos(new int[]{}));
    }

    //Todos negativos y ceros → debe devolver 0
    @Test
    public void todosNegativosYCeros_devuelveCero() {
        assertEquals(0, ContarPositivos.contarPositivos(new int[]{-1, -5, 0}));
    }

    // Mezcla de positivos, negativos y ceros → debe devolver 2
    @Test
    public void mezcla_devuelveConteoCorrect() {
        assertEquals(2, ContarPositivos.contarPositivos(new int[]{1, -2, 0, 3}));
    }
}
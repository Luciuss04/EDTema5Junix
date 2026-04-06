package com.luciuss04.tema05tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvaluarContrasenyaTest {

    //  Solo minúsculas corta → 1 punto → DEBIL
    @Test
    public void soloMinusculasCorta_esDebil() {
        assertEquals("DEBIL", EvaluarContrasenya.evaluarPassword("abc"));
    }

    //  Solo minúsculas larga → 2 puntos → DEBIL
    @Test
    public void soloMinusculasLarga_esDebil() {
        assertEquals("DEBIL", EvaluarContrasenya.evaluarPassword("abcdefgh"));
    }

    // Minúsculas + mayúsculas + larga → 3 puntos → MEDIA
    @Test
    public void minusculasMayusculasLarga_esMedia() {
        assertEquals("MEDIA", EvaluarContrasenya.evaluarPassword("Abcdefgh"));
    }

    //  Minúsculas + mayúsculas + números + larga → 4 puntos → MEDIA
    @Test
    public void minusculasMayusculasNumerosLarga_esMedia() {
        assertEquals("MEDIA", EvaluarContrasenya.evaluarPassword("Abcdefg1"));
    }

    //  Todo → 5 puntos → FUERTE
    @Test
    public void todosLosCriterios_esFuerte() {
        assertEquals("FUERTE", EvaluarContrasenya.evaluarPassword("Abcdefg1@"));
    }
}
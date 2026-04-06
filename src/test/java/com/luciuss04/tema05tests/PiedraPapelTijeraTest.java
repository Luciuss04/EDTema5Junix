package com.luciuss04.tema05tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PiedraPapelTijeraTest {

    //  Jugada inválida jugador 1 → debe lanzar excepción
    @Test
    public void jugadaInvalidaJugador1_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> PiedraPapelTijera.jugar("ROCA", "PIEDRA"));
    }

    //  Jugada inválida jugador 2 → debe lanzar excepción
    @Test
    public void jugadaInvalidaJugador2_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> PiedraPapelTijera.jugar("PIEDRA", "ROCA"));
    }

    //  Empate
    @Test
    public void piedraVsPiedra_esEmpate() {
        assertEquals("EMPATE", PiedraPapelTijera.jugar("PIEDRA", "PIEDRA"));
    }

    //  Piedra gana a tijera
    @Test
    public void piedraVsTijera_ganaJugador1() {
        assertEquals("JUGADOR 1", PiedraPapelTijera.jugar("PIEDRA", "TIJERA"));
    }

    //  Tijera gana a papel
    @Test
    public void tijeraVsPapel_ganaJugador1() {
        assertEquals("JUGADOR 1", PiedraPapelTijera.jugar("TIJERA", "PAPEL"));
    }

    //  Papel gana a piedra
    @Test
    public void papelVsPiedra_ganaJugador1() {
        assertEquals("JUGADOR 1", PiedraPapelTijera.jugar("PAPEL", "PIEDRA"));
    }

    //  Tijera pierde con piedra
    @Test
    public void tijeraVsPiedra_ganaJugador2() {
        assertEquals("JUGADOR 2", PiedraPapelTijera.jugar("TIJERA", "PIEDRA"));
    }

    //  Papel pierde con tijera
    @Test
    public void papelVsTijera_ganaJugador2() {
        assertEquals("JUGADOR 2", PiedraPapelTijera.jugar("PAPEL", "TIJERA"));
    }

    //  Piedra pierde con papel
    @Test
    public void piedraVsPapel_ganaJugador2() {
        assertEquals("JUGADOR 2", PiedraPapelTijera.jugar("PIEDRA", "PAPEL"));
    }
}
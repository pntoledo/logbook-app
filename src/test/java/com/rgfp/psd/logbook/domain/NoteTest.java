package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteTest {
    @Test
    public void tieneResumenNota() {

        // Arrange
        String nota = "esta es una nota que tiene mas de 240 caracteres, pero solo voy a mostrar los primeros 240, " +
        "porque eso me estan pidiendo y quiero saber si me sale bien y si resulta sere my feliz como Paola" +
        " y seguramente ella se reira de mi, porque hare mi baile de la victoria y se va a sorprender";

        // Act
        Note note = new Note();
        note.setContent(nota);
        String result = note.getSummary();
        Integer largo = result.length();
        // Assert
        assertEquals(new Integer(240), largo);


    }
    @Test
    public void NotieneResumenNota() {

        // Arrange
        String nota = "esta es una nota";

        // Act
        Note note = new Note();
        note.setContent(nota);
        String result = note.getSummary();
        Integer largo = result.length();
        // Assert
        assertEquals(new Integer(16), largo);


    }
}
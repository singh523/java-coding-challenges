package org.example.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PanagramTest {

    private Panagram panagram;

    @BeforeEach
    public void setup(){
        panagram = new Panagram();
    }

    @Test
    public void testPanagramForTrue(){
        String sentence = "The quick brown fox jumps over the lazy dog";
        assertTrue(panagram.isPanagram(sentence));
    }
    @Test
    public void testPanagramForFalse(){
        String sentence = "The quik brown fox jumps over the lazy dog";
        assertFalse(panagram.isPanagram(sentence));
    }
}

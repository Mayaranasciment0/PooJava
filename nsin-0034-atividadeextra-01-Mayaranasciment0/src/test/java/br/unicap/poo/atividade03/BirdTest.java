package br.unicap.poo.atividade03;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BirdTest {

    @Test
    public void testBirdSound() {
        Animal bird = new Bird(5, "Tweety", 1, 0.5);
        assertEquals("piu", bird.sound());
    }

    @Test
    public void testBirdAbility() {
        Animal bird = new Bird(6, "Tweety", 1, 0.5);
        assertEquals("Tweety can fly", bird.performAbility("fly"));
        assertEquals("Tweety can't sniff", bird.performAbility("sniff"));
    }
}

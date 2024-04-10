package br.unicap.poo.atividade03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DogTest {

    @Test
    public void testDogSound() {
        Animal dog = new Dog(3, "Buddy", 3, 25.0);
        assertEquals("au", dog.sound());
    }

    @Test
    public void testDogAbility() {
        Animal dog = new Dog(4, "Buddy", 3, 25.0);
        assertEquals("Buddy can sniff", dog.performAbility("sniff"));
        assertEquals("Buddy can't agility", dog.performAbility("agility"));
    }
}

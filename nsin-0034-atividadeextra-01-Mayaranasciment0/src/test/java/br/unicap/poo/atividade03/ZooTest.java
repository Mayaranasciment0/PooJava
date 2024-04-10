package br.unicap.poo.atividade03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZooTest {

    private Zoo zoo;
    private Dog dog;
    private Cat cat;
    private Bird bird;

    @BeforeEach
    public void setUp() {
        zoo = new Zoo();
        dog = new Dog(7, "Buddy", 3, 25.0);
        cat = new Cat(8, "Whiskers", 2, 5.0);
        bird = new Bird(9, "Tweety", 1, 0.5);
        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        zoo.addAnimal(bird);
    }

    @Test
    public void testAddAnimal() {
        assertEquals(3, zoo.listAnimals().size());
    }

    @Test
    public void testListAnimals() {
        assertTrue(zoo.listAnimals().contains(dog));
        assertTrue(zoo.listAnimals().contains(cat));
        assertTrue(zoo.listAnimals().contains(bird));
    }

    @Test
    public void testRemoveAnimal() {
        assertTrue(zoo.removeAnimal(dog.getId()));
        assertEquals(2, zoo.listAnimals().size());
        assertFalse(zoo.listAnimals().contains(dog));
    }

    @Test
    public void testRemoveAnimalNotFound() {
        assertFalse(zoo.removeAnimal(100));
        assertEquals(3, zoo.listAnimals().size());
    }
}

package br.unicap.poo.atividade03;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CatTest {

    @Test
    public void testCatSound() {
        Animal cat = new Cat(1, "Whiskers", 2, 5.0);
        assertEquals("meow", cat.sound());
    }

    @Test
    public void testCatAbility() {
        Animal cat = new Cat(2, "Whiskers", 2, 5.0);
        assertEquals("Whiskers can agility", cat.performAbility("agility"));
        assertEquals("Whiskers can't fly", cat.performAbility("fly"));
    }
}

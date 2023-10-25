package ua.edu.ucu.apps.lab7flower;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.lab7flower.flowers.flower.Flower;
import ua.edu.ucu.apps.lab7flower.flowers.flower.FlowerColor;
import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    @Test
    void testGetPrice() {
        Flower flower = new Flower(10.0, 5.0, FlowerColor.RED);
        double price = flower.getPrice();
        assertEquals(10.0, price, 0.01);
    }

    @Test
    void testGetColor() {
        Flower flower = new Flower(12.5, 6.0, FlowerColor.BLUE);
        String color = flower.getColor();
        assertEquals("BLUE", color);
    }

    @Test
    void testSetColor() {
        Flower flower = new Flower(15.0, 7.0, FlowerColor.BLUE);
        flower.setColor(FlowerColor.GREEN);
        assertEquals("GREEN", flower.getColor());
    }
}


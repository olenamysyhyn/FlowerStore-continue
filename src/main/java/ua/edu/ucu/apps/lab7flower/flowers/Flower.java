package ua.edu.ucu.apps.lab7flower.flowers;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Flower {
    private double price;
    private double sepalLength;
    private FlowerColor color;

    public String getColor() {
        return color.toString();
    }

    public double getPrice() {
        return price;
    }
}

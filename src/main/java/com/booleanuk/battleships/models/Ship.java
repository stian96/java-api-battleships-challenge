package com.booleanuk.battleships.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Ship {
    private String type;
    private int size;
    private int hits;
    private List<Coordinate> coordinates;

    public Ship(String type, int size, List<Coordinate> coordinates) {
        this.type = type;
        this.size = size;
        this.hits = 0;
        setCoordinates(coordinates);
    }

    public void hit() {
        this.hits++;
    }

    public boolean isSunk() {
        return this.hits >= this.size;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        for (Coordinate cord: coordinates) {

            if (cord.getX() < 0 || cord.getX() >= 10) {
                throw new IllegalArgumentException("X coordinate is outside the grid!");
            }
            else if (cord.getY() < 0 || cord.getY() >= 10) {
                throw new IllegalArgumentException(("Y coordinate is outside the grid!"));
            }
        }
        this.coordinates = coordinates;
    }
}

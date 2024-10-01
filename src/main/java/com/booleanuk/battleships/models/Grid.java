package com.booleanuk.battleships.models;
import lombok.Getter;

import java.util.List;

@Getter
public class Grid {
    private static final int GRID_SIZE = 10;
    private Cell[][] cells;

    public Grid() {
        this.cells = new Cell[GRID_SIZE][GRID_SIZE];

        // Fill the grid with empty values.
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                this.cells[i][j] = new Cell();
            }
        }
    }

    // Adds a ship to the grid by specifying the ships coordinates and size.
    public void placeShip(Ship ship, List<Coordinate> coordinates) {
        for (Coordinate coordinate : coordinates) {
            cells[coordinate.getX()][coordinate.getY()].setShip(ship);
        }
    }

    // Method to register an attack on the grid.
    public boolean attack(int x, int y) {
        if (cells[x][y].hasShip()) {
            cells[x][y].hit();
            return true;
        }
        else {
            cells[x][y].miss();
            return false;
        }
    }
}

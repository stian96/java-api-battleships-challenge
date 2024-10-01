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

    // TODO: Handle edge case where player tries to place a ship on another.
    // TODO: Write unit test for method.
    public void placeShip(Ship ship, List<Coordinate> coordinates) {
        for (Coordinate coordinate : coordinates) {
            cells[coordinate.getX()][coordinate.getY()].setShip(ship);
        }
    }

    // TODO: Handle case where player tries to attack the same cell multiple times.
    // TODO: Write unit test for method.
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

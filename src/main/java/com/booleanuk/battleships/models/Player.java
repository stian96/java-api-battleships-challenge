package com.booleanuk.battleships.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Player {
    private Grid oceanGrid;
    private Grid targetGrid;
    private List<Ship> ships;
    private boolean isTurn;

    public Player() {
        this.oceanGrid = new Grid();
        this.targetGrid = new Grid();
        this.ships = new ArrayList<>();
        this.isTurn = false;
    }

    // TODO: Write unit test for method.
    public boolean allShipsSunk() {
        for (Ship ship : this.ships) {
            if (!ship.isSunk()) {
                return false;
            }
        }
        return true;
    }
}

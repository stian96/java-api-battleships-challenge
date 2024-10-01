package com.booleanuk.battleships.services;

import com.booleanuk.battleships.models.Coordinate;
import com.booleanuk.battleships.models.Ship;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipService {

    public boolean isShipSunk(Ship ship) {
        return ship.isSunk();
    }

    public void placeShip(Ship ship, List<Coordinate> coordinates) {
        ship.setCoordinates(coordinates);
    }
}

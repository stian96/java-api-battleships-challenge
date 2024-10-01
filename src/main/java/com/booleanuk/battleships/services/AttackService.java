package com.booleanuk.battleships.services;

import com.booleanuk.battleships.models.Coordinate;
import com.booleanuk.battleships.models.Player;
import com.booleanuk.battleships.models.Ship;
import org.springframework.stereotype.Service;

@Service
public class AttackService {

    public boolean executeAttack(Player defendingPlayer, int x, int y) {
        boolean hit = defendingPlayer.getOceanGrid().attack(x, y);

        if (hit) {
            // Update the ships state, if hit.
            for (Ship ship : defendingPlayer.getShips()) {
                if (ship.getCoordinates().contains(new Coordinate(x, y))) {
                    ship.hit();
                }
            }
        }
        return hit;
    }

    public boolean validateAttack(int x, int y) {
        return x >= 0 && x < 10 || y >= 0 && y < 10;
    }
}

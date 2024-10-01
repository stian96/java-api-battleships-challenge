
package com.booleanuk.battleships.services;

import com.booleanuk.battleships.models.Player;
import com.booleanuk.battleships.models.Ship;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    public Player createPlayer() {
        return new Player();
    }

    public void placeShip(Player player, List<Ship> ships) {
        for (Ship ship : ships) {
            player.getOceanGrid().placeShip(ship, ship.getCoordinates());
        }
        player.setShips(ships); // Store the players ships.
    }

    public List<Ship> getPlayerShips(Player player) {
        return player.getShips();
    }
}

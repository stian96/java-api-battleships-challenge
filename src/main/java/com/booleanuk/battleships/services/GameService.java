package com.booleanuk.battleships.services;

import com.booleanuk.battleships.models.Game;
import com.booleanuk.battleships.models.Player;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private Game currentGame;

    public Game createGame(Player player1, Player player2) {
        this.currentGame = new Game(player1, player2);
        return currentGame;
    }

    public boolean takeTurn(int x, int y) {
        Player currentPlayer = currentGame.getCurrentPlayer();
        boolean hit = currentPlayer.getTargetGrid().attack(x, y);
        if (currentGame.checkWinner()) {
            return true;
        }
        currentGame.switchTurn();
        return hit;
    }

    public void resetGame() {
        this.currentGame = null;
    }

    public Game getCurrentGame() {
        return this.currentGame;
    }
}

package com.booleanuk.battleships.models;

import lombok.Getter;

@Getter
public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Player winner;
    private boolean isOnGoing;


    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.isOnGoing = true;
    }

    public void switchTurn() {
        this.currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public boolean checkWinner() {
        if (player1.allShipsSunk()) {
            this.winner = player2;
            this.isOnGoing = false;
            return true;
        }
        else if (player2.allShipsSunk()) {
            this.winner = player1;
            this.isOnGoing = false;
            return true;
        }
        return false;
    }

    // TODO: Implement method that checks if the game is over, (i.e. no more actions can be made).
}

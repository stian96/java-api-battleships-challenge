package com.booleanuk.battleships.models;

public class Cell {
    private boolean hasShip;
    private boolean isHit;

    public Cell() {
        this.hasShip = false;
        this.isHit = false;
    }

    public boolean hasShip() {
        return hasShip;
    }

    public void setShip(Ship ship) {
        this.hasShip = true;
    }

    public boolean hit() {
        this.isHit = true;
        return this.hasShip();
    }

    public boolean miss() {
        this.isHit = false;
        return false;
    }

    public boolean isHit() {
        return isHit;
    }
}


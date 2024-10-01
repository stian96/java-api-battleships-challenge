package com.booleanuk.battleships.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coordinate {
    private int y;
    private int x;

    public Coordinate(int y, int x) {
        this.y = y;
        this.x = x;
    }
}

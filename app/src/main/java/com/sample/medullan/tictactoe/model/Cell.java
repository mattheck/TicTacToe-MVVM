package com.sample.medullan.tictactoe.model;


import com.sample.medullan.tictactoe.utilities.StringUtility;

public class Cell {

    public Player player;


    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null || StringUtility.isNullOrEmpty(player.value);
    }
}

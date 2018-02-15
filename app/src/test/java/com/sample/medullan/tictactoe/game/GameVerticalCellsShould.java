package com.sample.medullan.tictactoe.game;


import com.sample.medullan.tictactoe.model.Cell;
import com.sample.medullan.tictactoe.model.Game;
import com.sample.medullan.tictactoe.model.Player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameVerticalCellsShould {


    private Game game;
    private Player player;
    private Player anotherPlayer;


    @Before
    public void setUp() throws Exception {
        game = new Game();
        player = new Player("Matt", "x");
        anotherPlayer = new Player("Abdul", "o");
    }


    @Test
    public void returnTrueIfHasThreeSameVerticalCellsAtColumn1() throws Exception {
        Cell cell = new Cell(player);
        game.cells[0][0] = cell;
        game.cells[1][0] = cell;
        game.cells[2][0] = cell;
        boolean hasThreeSameVerticalCells = game.hasThreeSameVerticalCells();
        assertEquals(true, hasThreeSameVerticalCells);
    }


    @Test
    public void returnTrueIfHasThreeSameVerticalCellsAtColumn2() throws Exception {
        Cell cell = new Cell(player);
        game.cells[0][1] = cell;
        game.cells[1][1] = cell;
        game.cells[2][1] = cell;
        boolean hasThreeSameVerticalCells = game.hasThreeSameVerticalCells();
        assertEquals(true, hasThreeSameVerticalCells);
    }


    @Test
    public void returnTrueIfHasThreeSameVerticalCellsAtColumn3() throws Exception {
        Cell cell = new Cell(player);
        game.cells[0][2] = cell;
        game.cells[1][2] = cell;
        game.cells[2][2] = cell;
        boolean hasThreeSameVerticalCells = game.hasThreeSameVerticalCells();
        assertEquals(true, hasThreeSameVerticalCells);
    }


    @Test
    public void returnFalseIfDoesNotHaveThreeSameVerticalCells() throws Exception {
        Cell cell = new Cell(player);
        Cell anotherCell = new Cell(anotherPlayer);
        game.cells[0][0] = cell;
        game.cells[1][0] = cell;
        game.cells[2][0] = anotherCell;
        boolean hasThreeSameVerticalCells = game.hasThreeSameVerticalCells();
        assertEquals(false, hasThreeSameVerticalCells);
    }
}

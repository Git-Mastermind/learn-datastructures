package com.datastructures.BattleshipGame;

import java.util.List;
import java.util.ArrayList;

public class GameManager {

    List<Battleships> battleships = new ArrayList<>();

    public GameManager() {
        Battleships battleship1 = new Battleships("Aircraft Carrier", 5);
    }

}

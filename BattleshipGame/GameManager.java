package com.datastructures.BattleshipGame;

import java.util.List;
import java.util.ArrayList;

public class GameManager {

    List<Battleships> battleships = new ArrayList<>();

    public GameManager() {
        Battleships battleship1 = new Battleships("Aircraft Carrier", 5);
        battleships.add(battleship1);

        Battleships battleship2 = new Battleships("Destroyer", 3);
        battleships.add(battleship2);

        Battleships battleship3 = new Battleships("Boat", 2);
        battleships.add(battleship3);

        
    }

}

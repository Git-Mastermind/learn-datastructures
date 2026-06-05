package com.datastructures.BattleshipGame;

import java.util.List;
import java.util.ArrayList;

public class Battleships {
    String name;
    int length;
    List<String> position = new ArrayList<>();
    private static final String STRING_POSITION_OPTIONS = "abcdef";
    private static final int INTEGER_POSITION_OPTIONS = 12345;

    public Battleships(String battleshipName, int battleshipLength) {
        this.name = battleshipName;
        this.length = battleshipLength;
    }

    
}

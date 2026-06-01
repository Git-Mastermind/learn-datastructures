package com.datastructures.SinkTheStartup;

import java.util.ArrayList;
import java.util.Random;

public class GameInitializerAndRunner {
    public ArrayList<Startup> startups = new ArrayList<>();
    public ArrayList<String> positionForStartup1 = new ArrayList<>();
    public ArrayList<String> positionForStartup2 = new ArrayList<>();
    public ArrayList<String> positionForStartup3 = new ArrayList<>();
    public ArrayList<String> startupPlacementOptions = new ArrayList<>();
    public Startup startup1;
    public Startup startup2;
    public Startup startup3;
    Random random = new Random();

    public GameInitializerAndRunner() {
        startupPlacementOptions.add("A1");
        startupPlacementOptions.add("B1");
        startupPlacementOptions.add("C1");
        startupPlacementOptions.add("A2");
        startupPlacementOptions.add("B2");
        startupPlacementOptions.add("C2");
        startupPlacementOptions.add("A3");
        startupPlacementOptions.add("B3");
        startupPlacementOptions.add("C3");

    }

    public void randomPositionPicker(int numberOfStartups) {

    }

    public void setUpGame() {

    }
}

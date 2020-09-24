package fr.umontpellier.iut.partie2;

import java.util.ArrayList;

public interface JeuPuzzle<JeuPuzzle>{
    boolean estGagnant();
    ArrayList<JeuPuzzle> genererFils();
}
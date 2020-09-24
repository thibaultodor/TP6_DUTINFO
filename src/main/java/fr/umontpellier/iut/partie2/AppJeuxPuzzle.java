package fr.umontpellier.iut.partie2;

public class AppJeuxPuzzle {
    public static void main(String[] args) {
        Hanoi h = new Hanoi(5);
        System.out.println(h.toString());
        Contexte contexte = new Contexte(h);
        contexte.resoudre();
        System.out.println(contexte.toString());
    }
}

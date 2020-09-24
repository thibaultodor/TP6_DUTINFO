package fr.umontpellier.iut.partie1;

import java.util.ArrayList;

@SuppressWarnings("Duplicates")
public class Contexte {

    private Taquin taquinInitial;
    private ArrayList<Taquin> solution;

    public Contexte(Taquin taquinInitial) {
        this.taquinInitial = taquinInitial;
        solution = new ArrayList<>();
    }

    public void resoudre() {
        Couple couple = new Couple(taquinInitial,null);
        ArrayList<Couple> frontiere = new ArrayList<>();
        ArrayList<Taquin> dejasvu = new ArrayList<>();
        couple.mettreAJour(frontiere,dejasvu);
        solution = new ArrayList<>();
        while(!frontiere.isEmpty()){
            System.out.println(couple.getTaquin()); //Afin de savoir si on est dans une boucle infini ou pas
            if (couple.getTaquin().estGagnant()){
                solution = couple.getListeDeMouvements();
                break;
            }
            couple = frontiere.remove(0);
            couple.mettreAJour(frontiere,dejasvu);
        }
    }

    public ArrayList<Taquin> getSolution() {
        return solution;
    }

    @Override
    public String toString() {
        String res = "Solution :\n\n";
        for(int i=0;i<solution.size();i++){
            res = res + solution.get(i).toString();
            res = res + "\n";
        }
        return res;
    }
}

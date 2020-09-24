package fr.umontpellier.iut.partie1;

import java.util.ArrayList;

@SuppressWarnings("Duplicates")
public class Couple {

    private Taquin taquin;
    private Couple predecesseur;

    public Couple(Taquin taquin, Couple predecesseur) {
        this.taquin = taquin;
        this.predecesseur = predecesseur;
    }

    public void mettreAJour(ArrayList<Couple> frontiere, ArrayList<Taquin> dejaVus) {
        ArrayList<Taquin> fils = this.taquin.genererFils();
        dejaVus.add(this.taquin);
        for (int i = 0;i<fils.size();i++){
            if(!dejaVus.contains(fils.get(i))){
                Couple tmp = new Couple(fils.get(i),this);
                frontiere.add(tmp);
            }
        }
    }

    public ArrayList<Taquin> getListeDeMouvements() {
        ArrayList<Taquin> liste = new ArrayList<>();
        if(predecesseur==null){
            liste.add(taquin);
            return liste;
        }
        liste = predecesseur.getListeDeMouvements();
        liste.add(taquin);
        return liste;
    }

    public Taquin getTaquin() {
        return taquin;
    }
}

package fr.umontpellier.iut.partie1;

public class App {
    public static void main(String[] args) {
        int[][] tvrai = {{ 1, 2, 3 } ,{ 4, 5, 6} ,{ 7, 8, 0}};
        int[][] tfaux = {{ 1, 2, 3 } ,{ 4, 0, 6} ,{ 7, 8, 5}};
        Taquin toc = new Taquin(tvrai);
        System.out.println("Tableau\n"+toc.toString()+"gagnant ? : "+toc.estGagnant()+"\n");
        Taquin tic = new Taquin(tfaux);
        System.out.println("Tableau\n"+tic.toString()+"gagnant ? : "+tic.estGagnant()+"\n");

        int[][] t = {{ 4, 0, 5} ,{ 1, 2, 3}};
        Taquin tinitial = new Taquin(t);
        System.out.println("Tableau :\n\n"+tinitial.toString()+"\n");
        Contexte contexte = new Contexte(tinitial);
        contexte.resoudre();
        System.out.println(contexte.toString());
    }
}

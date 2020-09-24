 ##  Partie 1
 #### Exercice 3
 ##### Question 2
 
Dans mon code j'utilise la façon de gérer ma frontiere qui utilise le principe de **la file** (en largeur).
 
A partir du taquin initial je verifie si les frontiere sont solution.

Cette methode permet d'obtenir la solution qui utilise le moins de mouvement et de la maniere la plus rapide pour un taquin de taille modeste. 
 

La méthode **en pile** (en profondeur) permet d'obtenir une solution mais elle ne sera pas celle qui utilise le moins de mouvement.

Elle peut etre trés efficace dans le cas d'un taquin de grande taille et si le nombre de mouvement pour obtenir la solution est négligable.

Par contre elle peut etre trés lente si la solution se trouve "loin dans l'arbre de solution" car elle teste branche par branche.

**En conclusion:**

Si on veut réellement une solution pour un taquin de grande taille **la pile** est la meilleur methode.

Si on souhaite avoir la solution avec le moins de mouvement et que l'on est pas regardeant sur le temps d'execution **la file** est la meilleur methode.

 #### Question 4
 
 Afin de savoir que l'on est pas dans une boucle infini il suffit de print dans la console l'état actuel des solutions.
 
 ##  Partie 2
 ##### Question 2
 
Fonctions essentielles de la classe Taquin :
 
`boolean estGagnant()`

`ArrayList<Taquin> genererFils()`

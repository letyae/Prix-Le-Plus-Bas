
//{
package com.egaetan;
//}

/*******
* Lire les donnees depuis System.in
* Utilise System.out.println pour afficher le resultat
* Utilise System.err.println pour afficher des donnees de debug
* ***/
import java.util.*;



public class PrixLePlusBas {
	
	public void main() {
		Scanner sc = new Scanner(System.in);

        int minimun= Integer.MAX_VALUE, prix;

        int nombreProduits = sc.nextInt();
        sc.nextLine();

        String nomProduit = sc.nextLine();

        String produit, line;

        while(sc.hasNextLine()){
            line = sc.nextLine();
            produit = line.split(" ")[0];
            prix = Integer.parseInt(line.split(" ")[1]);

            if(produit.equals(nomProduit) && prix<minimun)
              minimun=prix;

        }

          System.out.println(minimun);
	    
	}
		


	/* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/


}




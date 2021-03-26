package valeurMaxMinTableau;

import java.util.Iterator;
import java.util.Scanner;

public class TableauMaxMin {

	public static void main(String[] args) {
		
		int [] tab= new int[5];
		System.out.println("veuillez saisr  des valeurs ");
		Scanner scan= new Scanner(System.in);
		for (int i = 0; i < tab.length; i++) {
			tab[i]=scan.nextInt();
			
			
		}
		int min=tab[0];
		int max=tab[0];
	for (int i = 0; i < tab.length; i++) {
		
		if (tab[i]<min) 
			min=tab[i];
		if (tab[i]>max)
			max=tab[i];
	}
System.out.println("la valeur max du tableau est: "+max );
System.out.println("la valeur main du tableau est: "+min);
//On cherche à savoir si une  une valeur precise est presente dans notre tableau
//combien fois cette que cette valeur elle y'est ?
	
System.out.println("entrez la valeur que vous cherchez");
//Scanner scan= new Scanner(System.in);

int count =0;
int valeurRecherche= scan.nextInt();
for (int i= 0; i< tab.length; i++) {
	


	if (valeurRecherche==tab[i]) {
		count++;
		
	}

	}
if (count!=0) {
System.out.println("la valeur " +valeurRecherche+" est bien presente dans le tableau");
System.out.print(valeurRecherche +" est présente "+count++  +" fois dans le tableau");
}else 
System.out.println("la valeur " +valeurRecherche+" est introuvable dans le tableau");
System.out.print(valeurRecherche +" est "+count++  +" fois dans le tableau");
	}
}


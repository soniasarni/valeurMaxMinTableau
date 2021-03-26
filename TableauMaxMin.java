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
	}

}

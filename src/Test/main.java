package Test;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("jour:") ;
		int jour = sc.nextInt() ;
		System.out.println ("mois:") ;
		int mois = sc.nextInt() ;
		System.out.println ("annee:") ;
		int annee = sc.nextInt() ;
		
		MaDate d1=new MaDate(jour,mois,annee);
		MaDate d2=new MaDate(jour,mois,annee);
		MaDate d3=new MaDate(annee);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		if((d1.getJour()==d2.getJour())&&(d1.getMois()==d2.getMois())&&(d1.getAnnee()==d2.getAnnee()))
		{
			System.out.println("d1 et d2 sont identiques");
		}
		else
			System.out.println("d1 et d2 ne sont pas identiques");
		System.out.println("choisir 1:Ajout d’un jour,2:ajout de plusieurs jours,3:Ajout d’un mois,4:Ajout d’une année");
		int n=sc.nextInt();
		if(n==1)
			d1.ajouterUnJour();
		else if(n==2)
			d1.ajouterPluseursJours(5);
		else if(n==3)
			d1.ajouterUnMois();
		else
			d1.ajouterUnAn();
		System.out.println(d1);
	}

}

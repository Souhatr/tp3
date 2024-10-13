package Test;

public class MaDate {
	private int jour;
	private int mois;
	private int annee;
	public MaDate(int jour, int mois,int annee)
	{
		this.jour=jour;
		this.mois=mois;
		this.annee=annee;
	}
	public MaDate(int annee)
	{
		this.annee=annee;
	}
	public String toString() {
        return jour + "/" + mois + "/" + annee;
    }
	
	int getJour()
	{
		return this.jour;
	}
	int getMois()
	{
		return this.mois;
	}
	int getAnnee()
	{
		return this.annee;
	}
	void setJour(int j)
	{
		jour=j;
	}
	void setMois(int m)
	{
		mois=m;
	}
	void setAnne(int a)
	{
		annee=a;
	}
	private boolean bissextile() {
	    return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
	}
	public void ajouterUnJour()
	{
		int[] jours={31, (bissextile() ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(jour==jours[mois-1]) {
			jour=1;
			ajouterUnMois();
		}
		else
			jour++;
	}
	public void ajouterPluseursJours(int n)
	{
		for( int i=0;i<n;i++)
		{
			ajouterUnJour();
		}  
	}
	public void ajouterUnMois()
	{
		if(mois==12)
			mois=1;
		ajouterUnAn();
	}
	public void ajouterUnAn()
	{
		annee++;
	}

}

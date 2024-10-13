package Test;

public class Point {
	/*private char id ;
	private double abs ;
	public Point (char c, double x) {
	id = c ;
	abs = x ;
	}
	public void affiche ()
	{ System.out.println("Point identifie par"+id+" d'abcsisse"+abs);}
	public void translate (double dx)
	{ abs+=dx ; }
	*/
	private String nom;
	private int abs;
	private int ord;
	public Point(String ch,int x,int y)
	{
		nom=ch;
		abs=x;
		ord=y;
	}
	public Point(int x,int y)
	{
		abs=x;
		ord=y;
	}
	public Point(String ch)
	{
		nom=ch;
		abs=0;
		ord=0;
	}
	void Affiche() {
		System.out.println(nom+"("+abs+","+ord+")");
		
	}
	void TranslHoriz (int a)
	{
		abs+=a;
	}
	void TranslVert (int a)
	{
		ord+=a;
	}
	void Translation (int a,int b)
	{
		abs+=a;
		ord+=b;
	}
	boolean Coincide (Point p)
	{
		if(abs==p.getAbscisse() && ord==p.getOrdonnées())
		{
			return true;
		}
		else
			return false;
	}
	String getNom() {  
		return nom;
	}
	int getAbscisse()
	{
		return abs;
	}
	int getOrdonnées()
	{
		return ord;
	}
	void setNom(String ch)
	{
			this.nom=ch;
	}
	void setAbscisse(int a)
	{
		this.abs=a;
	}
	void setOrdonnée(int a)
	{
		this.ord=a;
	}
}

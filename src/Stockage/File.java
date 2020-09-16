package Stockage;

import Visiteur.VisiteurAbs;

public class File extends ElementStockage{
	protected String contenu ; // possède un contenu
	
	public File(String nom){
		super(nom,0) ;
		this.contenu="" ;
	}
	
	public File(String nom,String contenu){
		super(nom,0) ;
		this.contenu=contenu ;
	}
	
	public int size(){
		return (contenu.length());
	}
	
	public void cat(){
		System.out.println(contenu) ;
	}
	
	public boolean contains(String sub){
		return (contenu.indexOf(sub) != -1);
	}
	
	public void setContents(String c)
	//change le contenu du fichier. Le contenu devient c
	{
		contenu = c ;
	}

	@Override
	public void accept(VisiteurAbs v) {
		v.visit(this);
		
	}
}

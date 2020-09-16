package Visiteur;

import java.util.ArrayList;
import java.util.Collection;

import Stockage.Directory;

public class FindVisiteur extends VisiteurAbs{
	private ArrayList<String> collection;
	private String name;
	
	public FindVisiteur(String name) {
		collection = new ArrayList<String>();
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Collection<String> find(){
		return this.collection;
		}
	
	public void visit(Directory d) {
		//this.collection = d.find(this.name);
		for(String str : d.find(this.name)) {
			this.collection.add(str);
		}
		
	}

	
}

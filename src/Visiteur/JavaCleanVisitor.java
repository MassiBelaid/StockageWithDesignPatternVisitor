package Visiteur;

import java.util.ArrayList;
import java.util.List;

import Stockage.Directory;
import Stockage.File;

public class JavaCleanVisitor extends VisiteurAbs{
	List<File> toRemove;
	
	public JavaCleanVisitor() {
		this.toRemove = new ArrayList<File>();
	}
	
	

	
	public void visit(File f) {
		
		if(f.getName().endsWith(".class")) {
			this.toRemove.add(f);
		}
		
	}
	
	public void dropf() {
		for(File file : this.toRemove) {
			Directory dir = file.getParent();
			dir.remove(file);
		}
	}
}

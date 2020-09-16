package Visiteur;

import Stockage.Directory;
import Stockage.File;
import Stockage.Link;
import Stockage.Symlink;

public abstract class VisiteurAbs {
	
	public void visit(Directory d) {
		//System.out.println(d.toString());
		
	}

	
	public void visit(File f) {
		//System.out.println(f.toString());
	}

	
	public void visit(Link l) {
		//System.out.println(l.toString());
		
	}

	
	public void visit(Symlink s) {
		//System.out.println(s.toString());
	}
}

package Visiteur;

import Stockage.Directory;
import Stockage.File;
import Stockage.Link;
import Stockage.Symlink;

public class RazVisiteur extends VisiteurAbs{

	/*@Override
	public void visit(Directory d) {
		System.out.println(d.toString());
		
	}*/

	@Override
	public void visit(File f) {
		f.setContents("");
	}

	/*@Override
	public void visit(Link l) {
		System.out.println(l.toString());
		
	}

	@Override
	public void visit(Symlink s) {
		System.out.println(s.toString());
	}*/

}

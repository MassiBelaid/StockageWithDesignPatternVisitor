package Visiteur;

import Stockage.Directory;
import Stockage.File;
import Stockage.Link;
import Stockage.Symlink;

public class CountVisitor extends VisiteurAbs{
	
	private int count;
	
	public CountVisitor() {
		count = 0;
	}

	public int getCount() {
		return this.count;
	}
	
	

	@Override
	public void visit(File f) {
		if(f.size() > 10) {
			count ++;
		}
	}


}

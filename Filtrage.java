package tp3;

import java.util.Iterator;
import java.util.Set;

public class Filtrage {
	public static int compterSi(Set<Forme> s, Condition c) {
		int compte = 0;
		for (Forme f : s)
			if (c.verif(f))
				compte++;
		return compte;
	}
	
	public static boolean SupprimerSi(Set<Forme> s, Condition c) {
		int compte = 0;
		for (Iterator<Forme> i = s.iterator(); i.hasNext();)
			if (c.verif(i.next())) {
				compte++;
				i.remove();
			}
		return compte > 0 ? true : false;
	}
}

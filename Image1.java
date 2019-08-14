package tp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Image1 {
	private HashSet<Forme> hset;
	
	// constructeur par defaut
	public Image1() {
		hset = new HashSet<Forme>();
	}
	
	public HashSet<Forme> getHset() {
		return hset;
	}
	
	// ajouter une forme a la set
	public void add(Forme f) {
		// pas besoin de checker si le set contient
		// deja f, car cela se fait automatiqument
		// en appelant la methode add() en bas
		hset.add(f);
	}
		
	public void remove(Forme f) {
		// pas besoin de checker si le set contient f,
		// car cela se fait automatiqument en appelant
		// la methode remove() en bas
		hset.remove(f);
	}



	@Override
	public String toString() {
		String str = new String();
		for (Forme f : hset)
			str += f + "\n";
		return str;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hset == null) ? 0 : hset.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image1 other = (Image1) obj;
		if (hset == null)
			return other.hset == null ? true : false;
		if (other.hset == null)
			return false;
		for (Forme f : hset)
			if (!other.hset.contains(f))
				return false;
		return true;
	}
	
	// trier les formes en fonction de leurs perimetres,
	// affiche-les apres le tri
	public void trierSelonPerimetre() {
		ArrayList<Forme> l = new ArrayList<Forme>();
		l.addAll(hset);
		Collections.sort(l, new Comparator<Forme>() {
		    public int compare(Forme f1, Forme f2) {
		        return Double.compare(f1.perimetre(), f2.perimetre());
		    }
		});
		for (Forme f : l)
		System.out.println(f);
	}
	
	// trier les formes en fonction de leurs aires,
	// affiche-les apres le tri
	public void trierSelonSurface() {
		List<Forme> l = new ArrayList<Forme>();
		l.addAll(hset);
		Collections.sort(l, new Comparator<Forme>() {
		    public int compare(Forme f1, Forme f2) {
		        return Double.compare(f1.surface(), f2.surface());
		    }
		});
		for (Forme f : l)
		System.out.println(f);
	}
}

package tp3;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Image2 {
	// inner class
	private static class FormeComparateur implements Comparator<Forme> {
		@Override
		public int compare(Forme o1, Forme o2) {
			if(o1.perimetre() < o2.perimetre()) return -1;
			if(o1.perimetre() > o2.perimetre()) return 1;
			return 0;
		}
	}
	
	private SortedSet<Forme> set;
	
	// constructeur par defaut
	public Image2() {
		set = new TreeSet<Forme>(new FormeComparateur());
	}
	
	public SortedSet<Forme> getSet() {
		return set;
	}

	public void add(Forme f) {
		// pas besoin de checker si le set contient
		// deja f, car cela se fait automatiqument
		// en appelant la methode add() en bas
		set.add(f);
	}
	
	public void remove(Forme f) {
		// pas besoin de checker si le set contient f,
		// car cela se fait automatiqument en appelant
		// la methode remove() en bas
		set.remove(f);
	}
	
	@Override
	public String toString() {
		String str = new String();
		for (Forme f : set)
			str += f + "\n";
		return str;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((set == null) ? 0 : set.hashCode());
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
		Image2 other = (Image2) obj;
		if (set == null)
			return other.set == null ? true : false;
		if (other.set == null)
			return false;
		for (Forme f : set)
			if (!other.set.contains(f))
				return false;
		return true;
	}
}

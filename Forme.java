package tp3;

public abstract class Forme {
	protected Point centre;
	public static final Point origine = new Point(0, 0);

	// constructeur par defaut
	public Forme() {
		centre = origine.clone();
	}
	
	// constructeur prenant les coordonnes du point central
	public Forme(double x, double y) {
		this(new Point(x, y));
	}

	// constructeur prenant le point central en parametre
	public Forme(Point p) {
		centre = p.clone();
	}
	
	public abstract double surface();
	public abstract double perimetre();
	
	@Override
	public String toString() {
		return "Forme [centre=" + centre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centre == null) ? 0 : centre.hashCode());
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
		Forme other = (Forme) obj;
		if (centre == null) {
			if (other.centre != null)
				return false;
		} else if (!centre.equals(other.centre))
			return false;
		return true;
	}
	
	// la distance entre l'origine et le centre de la forme
	public double distanceOrigine() {
		return origine.distance(centre);
	}
}

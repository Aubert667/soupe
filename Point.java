package tp3;

public class Point implements Cloneable{
	private double x;
	private double y;

	// constructeur par defaut
	public Point() {
		// pas besoin d'initialiser x et y ici
		// car cela se fait automatiquement après
		// l'appel implicit de super(), et donc
		// x et y prend la valeur par defaut de
		// double --> 0.0
	}

	// constructeur prenant les coordonnees d'un point
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public Point clone() {
		try {
			return (Point)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point (x=" + x + ", y=" + y + ")";
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	// calculer la distace entre deux points
	public double distance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)-(y-p.y)*(y-p.y));
	}
}

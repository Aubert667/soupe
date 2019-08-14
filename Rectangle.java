package tp3;

public class Rectangle extends Forme{
	protected double longueur;
	protected double largeur;
	
	// constructeur par defaut
	public Rectangle(double longueur, double largeur, Point centre) {
		super(centre);
		assert (longueur > 0) : "saisi invalide";
		assert (largeur > 0) : "saisi invalide";
		this.longueur = longueur > largeur ? longueur : largeur;
		this.largeur = largeur < longueur ? largeur : longueur;
	}
	public Rectangle(double longueur, double largeur, double x, double y) {
		this(longueur, largeur, new Point(x, y));
	}
	
	@Override
	public double surface() {
		return longueur * largeur;
	}
	
	@Override
	public double perimetre() {
		return 2 * (longueur + largeur);
	}
	
	public double getLongueur() {
		return longueur;
	}
	
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	public double getLargeur() {
		return largeur;
	}
	
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	@Override
	public String toString() {
		return "(Rectangle: centre=(" + centre.getX() + ", "+ centre.getY() + "), " +
				"largeur=" + largeur + ", " + "longueur=" + longueur + ", " + 
				"surface=" + surface() + ", " +
				"perimetre=" + perimetre() + ", " + 
				"distanceOrigine=" + String.format("%.1f", distanceOrigine()).replaceAll(",", "\\.") + ")";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(largeur);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longueur);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(largeur) != Double.doubleToLongBits(other.largeur))
			return false;
		if (Double.doubleToLongBits(longueur) != Double.doubleToLongBits(other.longueur))
			return false;
		return true;
	}
}

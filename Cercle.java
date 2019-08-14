package tp3;

public class Cercle extends Forme {
	private double rayon;
	
	public Cercle(double rayon, Point centre) {
		super(centre);
		this.rayon = rayon;
	}
	public Cercle(double rayon, double x, double y) {
		this(rayon, new Point(x, y));
	}
	
	public double getRayon() {
		return rayon;
	}
	
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public double surface() {
		return Math.PI * rayon * rayon;
	}
	
	@Override
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}
	
	@Override
	public String toString() {
		return "(cercle: centre=(" + centre.getX() + ", " +
				centre.getY() + "), rayon=" + rayon + ", " +
				"surface=" + String.format("%.1f", surface()).replaceAll(",", "\\.") + ", " +
				"perimetre=" + String.format("%.1f", perimetre()).replaceAll(",", "\\.") + ", " +
				"distanceOrigine=" + String.format("%.1f", distanceOrigine()).replaceAll(",", "\\.") + ")";
				
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(rayon);
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
		Cercle other = (Cercle) obj;
		if (Double.doubleToLongBits(rayon) != Double.doubleToLongBits(other.rayon))
			return false;
		return true;
	}
}

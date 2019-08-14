package tp3;

public class Carre extends Rectangle{
	public Carre(double cote, Point centre) {
		super(cote, cote, centre);
	}
	public Carre(double cote, double x, double y) {
		super(cote, cote, x, y);
	}
	
	public double getCote() {
		return getLongueur();
	}
	
	@Override
	public String toString() {
		return "(Carre: centre=(" + centre.getX() + ", " +
				centre.getY() + "), cote=" + getCote() + ", " +
				"surface=" + surface() + ", " +
				"perimetre=" + perimetre() + ", " +
				"distanceOrigine=" + String.format("%.1f", distanceOrigine()).replaceAll(",", "\\.") + ")";
	}
	
	// pas besoin de redefinir equals ou hashcode,
	// car la version heritee de la classe mere
	// suffit largement
}

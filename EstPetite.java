package tp3;

public class EstPetite implements Condition{

	private double seuil;
	
	public EstPetite(double seuil) {
		this.seuil = seuil;
	}
	
	@Override
	public boolean verif(Forme f) {
		return f.surface() < seuil ? true : false;
	}

}

package tp3;

public class Main {

	private static void separer() {
		System.out.println("\n\n**************************************************************\n");
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(15, 20, new Point(3, 4));
		Rectangle r2 = new Rectangle(5, 6, new Point(30, 40));
		Carre c1 = new Carre(5, new Point(7, 8));
		Carre c2 = new Carre(7, new Point(8, 9));
		Cercle ce1 = new Cercle(3, new Point(45, 56));
		Cercle ce2 = new Cercle(2, new Point(34, 32));
		
		// tester Image1
		Image1 i1 = new Image1();
		i1.add(r1);
		i1.add(r2);
		i1.add(c1);
		i1.add(c2);
		i1.add(ce1);
		i1.add(ce2);
		System.out.println("\ttest Image1: les formes de l'image avant de retirer quelques formes");
		System.out.println(i1);
		i1.remove(r1);
		i1.remove(c2);
		separer();
		System.out.println("\ttest Image1: tles formes de l'image apres la suppression de quelques formes");
		System.out.println(i1);
		separer();
		System.out.println("\ttest Image1: trier selon perimetre");
		i1.trierSelonPerimetre();
		separer();
		System.out.println("\ttest Image1: trier selon surface");
		i1.trierSelonSurface();
		
		// tester Image2
		Image2 i2 = new Image2();
		i2.add(r1);
		i2.add(r2);
		i2.add(c1);
		i2.add(c2);
		i2.add(ce1);
		i2.add(ce2);
		separer();
		separer();
		System.out.println("\ttest Image2: les formes de l'image avant de retirer quelques formes");
		System.out.println(i2);
		i2.remove(c2);
		i2.remove(ce1);
		System.out.println("\ttest Image2: les formes de l'image apres la suppression de quelques formes");
		System.out.println(i2);
		
		// tester Filtrage
		
		Rectangle r3 = new Rectangle(20, 56, new Point(3, 4));
		Rectangle r4 = new Rectangle(30, 33, new Point(30, 40));
		Carre c3 = new Carre(33, new Point(33, 33));
		Carre c4 = new Carre(22, new Point(22, 9));
		Cercle ce3 = new Cercle(22, new Point(45, 56));
		
		Image2 i3 = new Image2();
		i3.add(r3);
		i3.add(r4);
		i3.add(c3);
		i3.add(c4);
		i3.add(ce3);
		separer();
		separer();
		System.out.println("\ttest Filtrage");
		System.out.println(i3);
		separer();
		EstPetite cond = new EstPetite(1000);
		int compte = Filtrage.compterSi(i3.getSet(), cond);
		System.out.println("nombre de formes dont l'aire < 1000: " + compte);
		Filtrage.SupprimerSi(i3.getSet(), cond);
		separer();
		System.out.println("\tapres l'appel de supprimerSi, les formes sont");
		System.out.println(i3);
	}

}

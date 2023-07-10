package aula08;

public class Lutas {
	public static void main(String[] args) {
	 Lutadores lutador[] = new Lutadores [6];
			 lutador[0] = new Lutadores ("Daniel", "Brasil", 30, 1.74f, 74.0f, 10, 1, 3);
			 lutador[0].status();
			 
			 lutador[1] = new Lutadores ("Marquin DJ", "Jamaica", 85, 1.96f, 80.7f, 6,7,9);
			 lutador[1].status();

			 lutador[2] = new Lutadores ("Ozorio", "Camboja", 85, 1.96f, 80.7f, 6,7,9);
			 lutador[2].status();
			 
			 lutador[3] = new Lutadores ("Roger", "Madagascar", 85, 1.96f, 80.7f, 6,7,9);
			 lutador[3].status();
			 
			 lutador[4] = new Lutadores ("Roverto", "Servia", 85, 1.96f, 80.7f, 6,7,9);
			 lutador[4].status();
			 
			 lutador[5] = new Lutadores ("estrogonof", "russia", 85, 1.96f, 80.7f, 6,7,9);
			 lutador[5].status();
			 
			 lutador[3].setPeso(50);
			 lutador[3].status();
	}

}

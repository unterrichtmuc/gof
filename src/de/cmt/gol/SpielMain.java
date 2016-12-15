package de.cmt.gol;

public class SpielMain {

	public static void main(String[] args) {
		Spiel spiel = new Spiel(13, 23, 20);
		spiel.print();
		
		for (int i = 0; i < 20; i++)
		{
			System.out.println("--------------------");
			spiel.weiterentwickeln();
			spiel.print();
		}
	}

}

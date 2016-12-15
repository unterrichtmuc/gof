package de.cmt.gol;

public class Spiel {
	private Spielfeld spielfeld;
	private Zelle[] zellen;
	

	public Spiel(int laenge, int breite, int anzahl) {
		super();
		init(laenge, breite, anzahl);
	}

	public void init(int laenge, int breite, int anzahl) {
		this.spielfeld = new Spielfeld(laenge, breite);
		
		for (int i = 0; i < this.spielfeld.getLaenge(); i++) {
			for (int j = 0; j < spielfeld.getBreite(); j++) {

				this.spielfeld.getVektor()[i][j] = new Zelle(i, j);	
				
				if (Math.random() > 0.61) {				
					this.spielfeld.getVektor()[i][j].setLebend(false);
				}
			}
		}
	}
	
	public void print(){
		for (int i = 0; i < this.spielfeld.getLaenge(); i++) {
			for (int j = 0; j < spielfeld.getBreite(); j++) {
				
				if (spielfeld.getVektor()[i][j] != null && spielfeld.getVektor()[i][j].isLebend()) {					
					System.out.print("x");
				}else{
					System.out.print(" ");
				}
			}			
			System.out.println();
		}
	}
	public void weiterentwickeln (){
		for (int i = 0; i < this.spielfeld.getLaenge(); i++) {
			for (int j = 0; j < spielfeld.getBreite(); j++) {
				Zelle zelle = spielfeld.getVektor()[i][j];
				if (zelle != null) {
					int count = this.countNachbarn(zelle);
					
					// Einsamkeit
					if (count < 2) {
						zelle.setLebend(false);
					}
					
					// Alles gut
					if (count == 2 && zelle.isLebend() == true)
					{
						zelle.setLebend(true);
					}
					
					// Alles gut
					if (count == 3)
					{
						zelle.setLebend(true);
					}
					
					// Überbevölkerung
					if (count > 3) {
						zelle.setLebend(false);
					}
				}
			}			
		
		}
	}
	
	public int countNachbarn(Zelle zelle) {
		int x = zelle.getX();
		int y = zelle.getY();
		
		int count = 0;
		
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				if (i == 0 && j == 0) {
					
				}
				
				try
				{
					if (i == 0 && j == 0)
					{
					}
					else 
					{						
						
						if (this.spielfeld.getVektor()[x + i][y + j] != null 
								&& this.spielfeld.getVektor()[x + i][y + j].isLebend()) {
							count++;
						}
					}
					
					
				} catch (Exception e) {
				}				
			}
		}
			
		
		return count;
	}
}

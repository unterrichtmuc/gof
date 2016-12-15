package de.cmt.gol;

public class Spielfeld {
	private int laenge;
	private int breite;
	private Zelle[][] vektor;
	
	public Spielfeld(int laenge, int breite) {
		super();
		this.laenge = laenge;
		this.breite = breite;
		this.vektor = new Zelle[laenge][breite];
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public Zelle[][] getVektor() {
		return vektor;
	}

	public void setVektor(Zelle[][] vektor) {
		this.vektor = vektor;
	}
	
	public void setZelle(Zelle zelle) {
		
	}
	
}

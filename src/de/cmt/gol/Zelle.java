package de.cmt.gol;

public class Zelle {
	private int x;
	private int y;
	private boolean lebend;
	public Zelle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.lebend = true;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isLebend() {
		return lebend;
	}
	public void setLebend(boolean lebend) {
		this.lebend = lebend;
	}
	
	

}

package edu.sumdu.monopoly;

public abstract class OwnedCell extends Cell {

	private boolean available = true;
	protected Player owner;

	public OwnedCell() {
		super();
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Player getPlayer() {
		return owner;
	}

	public void setPlayer(Player player) {
		this.owner = player;
	}

}
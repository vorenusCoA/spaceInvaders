package main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemy implements Parameters {

	private Image ship;
	private int positionX;
	private int positionY;
	private int velX;

	public Image getShip() {
		return ship;
	}
	public void setShip(Image ship) {
		this.ship = ship;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	public int getVelX() {
		return velX;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}

	public Enemy(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.velX = ENEMY_INIT_VEL_X;

		try {
			this.ship = ImageIO.read(new File(ENEMY_SHIP));
		} catch (IOException e) {
			System.out.println("Enemy image not found: " + e.getMessage());
		}
	}
}

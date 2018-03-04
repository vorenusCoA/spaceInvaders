package main;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player implements KeyListener, Parameters {

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

	public Player() {
		this.positionX = PLAYER_INIT_POSITION_X;
		this.positionY = PLAYER_INIT_POSITION_Y;

		try {
			this.ship = ImageIO.read(this.getClass().getResource(PLAYER_SHIP));
		} catch (IOException e) {
			System.out.println("Player image not found: " + e.getMessage());
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.velX = -PLAYER_INCREASE_VEL_X;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.velX = PLAYER_INCREASE_VEL_X;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		this.velX = 0;
	}

}

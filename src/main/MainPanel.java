package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel implements ActionListener, Parameters {

	private static final long serialVersionUID = 1L;

	private Player player;
	private List<Enemy> enemies = new ArrayList<Enemy>();
	private Timer timer;

	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public List<Enemy> getEnemies() {
		return enemies;
	}
	public void setEnemies(List<Enemy> enemies) {
		this.enemies = enemies;
	}
	public Timer getTimer() {
		return timer;
	}
	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public MainPanel() {
		this.timer = new Timer(5, this);
		this.player = new Player();

		for (int positionX = ENEMY_INIT_POSITION_X; positionX < 550; positionX += 50) {
			for (int positionY = ENEMY_INIT_POSITION_X; positionY < 200; positionY += 50) {
				this.enemies.add(new Enemy(positionX, positionY));
			}
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;

		for (Enemy enemy : this.enemies) {
			g2D.drawImage(enemy.getShip(), enemy.getPositionX(), enemy.getPositionY(), null);
		}

		g2D.drawImage(this.player.getShip(), this.player.getPositionX(), this.player.getPositionY(), null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		boolean changeDirection = false;
		for (Enemy enemy : this.enemies) {
			if (enemy.getPositionX() < 0 || enemy.getPositionX() > 550) {
				changeDirection = true;
				break;
			}
		}

		for (Enemy enemy : this.enemies) {
			if (changeDirection) {
				enemy.setVelX(-enemy.getVelX());
				enemy.setPositionY(enemy.getPositionY() + 2);
			}
			enemy.setPositionX(enemy.getPositionX() + enemy.getVelX());
		}
		
		if (this.player.getPositionX() < 0) {
			this.player.setVelX(0);
			this.player.setPositionX(0);
		}
		if (this.player.getPositionX() > 550) {
			this.player.setVelX(0);
			this.player.setPositionX(550);
		}		
		this.player.setPositionX(this.player.getPositionX() + this.player.getVelX());

		repaint();
		
	}
}

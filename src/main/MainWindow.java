package main;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainWindow extends JFrame implements Parameters {

	private static final long serialVersionUID = 1L;

    public MainWindow() {

        // The program stops when the frame is closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Location and dimensions of the board
        this.setBounds(BOARD_POSITION_X, BOARD_POSITION_Y, BOARD_WIDTH, BOARD_HEIGHT);
        this.setResizable(false);

        this.setTitle(BOARD_TITLE);

        // Game icon
		try {
			Image icon = ImageIO.read(this.getClass().getResource(BOARD_ICON));
			this.setIconImage(icon);
		} catch (IOException e) {
			System.out.println("Icon image not found: " + e.getMessage());
		}
    }

}

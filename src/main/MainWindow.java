package main;

import java.awt.Image;
import java.awt.Toolkit;

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
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image icon = toolkit.getImage(BOARD_ICON);
        this.setIconImage(icon);
    }

}

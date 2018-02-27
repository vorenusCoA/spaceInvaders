package main;

public class Main {

	public static void main(String[] args) {
		MainWindow mainWindow = new MainWindow();
		MainPanel mainPanel = new MainPanel();
		mainPanel.getTimer().start();
		mainWindow.setFocusable(true);
		mainWindow.setFocusTraversalKeysEnabled(false);
		mainWindow.addKeyListener(mainPanel.getPlayer());
		mainWindow.add(mainPanel);
		mainWindow.setVisible(true);
	}

}

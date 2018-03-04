package main;

public interface Parameters {

	// Board
	public static final String BOARD_TITLE = "Space Invaders!";
	public static final String BOARD_ICON = "/imgs/icon.png";
	public static final int BOARD_POSITION_X = 100;
    public static final int BOARD_POSITION_Y = 100;
    public static final int BOARD_WIDTH = 600;
    public static final int BOARD_HEIGHT = 600;

    // Player
    public static final String PLAYER_SHIP = "/imgs/playerShip.png";
    public static final int PLAYER_INCREASE_VEL_X = 2;
    public static final int PLAYER_INIT_POSITION_X = 275;
    public static final int PLAYER_INIT_POSITION_Y = 500;

    // Enemy
    public static final String ENEMY_SHIP = "/imgs/enemyShip.png";
    public static final int ENEMY_INIT_POSITION_X = 50;
    public static final int ENEMY_INIT_POSITION_Y = 50;
    public static final int ENEMY_INIT_VEL_X = 1;
    public static final int ENEMY_INCREASE_POSITION_Y = 2;

    // Timer
    public static final int TIMER_DELAY = 15;

}

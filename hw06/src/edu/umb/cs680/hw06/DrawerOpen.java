package edu.umb.cs680.hw06;

public class DrawerOpen implements State {
	private DrawerOpen() {
	}

	private static DrawerOpen instance = null;

	public static DrawerOpen getInstance() {
		if (instance == null)
			instance = new DrawerOpen();
		return instance;
	}

	public void openCloseButtonPushed() {
		dvdPlayer.close();
		dvdPlayer.changeState(DrawerClosedNotPlaying.getInstance());
	}

	public void playButtonPushed() {
		dvdPlayer.close();
		dvdPlayer.changeState(DrawerClosedPlaying.getInstance());
	}

	public void stopButtonPushed() {
		System.out.println("Stoping DVD....");
	}
	
	public static void main(String[] args) {
		System.out.println("The DrawerOpen has run completely");
	}

}

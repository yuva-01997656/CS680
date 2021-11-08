package edu.umb.cs680.hw06;

public class DrawerClosedPlaying implements State {
	private DrawerClosedPlaying() {
	}

	private static DrawerClosedPlaying instance = null;

	public static DrawerClosedPlaying getInstance() {
		if (instance == null)
			instance = new DrawerClosedPlaying();
		return instance;
	}

	public void openCloseButtonPushed() {
		dvdPlayer.stop();
		dvdPlayer.open();
		dvdPlayer.changeState(DrawerOpen.getInstance());
	}

	public void playButtonPushed() {
		System.out.println("Now Playing DVD...");
	}

	public void stopButtonPushed() {
		dvdPlayer.stop();
		dvdPlayer.changeState(DrawerClosedNotPlaying.getInstance());
	}
	public static void main(String[] args) {
		System.out.println("The class DrawerClosedPlaying has run completely");
	}
}

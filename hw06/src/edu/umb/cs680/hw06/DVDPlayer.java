package edu.umb.cs680.hw06;

public class DVDPlayer {
	private static DVDPlayer instance = null;
	private static State state;

	private DVDPlayer(State s) {
		state = s;
	}

	public static DVDPlayer getInstance() {
		if (instance == null) {
			State s = DrawerClosedNotPlaying.getInstance();
			instance = new DVDPlayer(s);
		}
		return instance;
	}

	public void changeState(State s) {
		state = s;
	}

	public void openCloseButtonPushed() {
		state.openCloseButtonPushed();
	}

	public void playButtonPushed() {
		state.playButtonPushed();
	}

	public void stopButtonPushed() {
		state.stopButtonPushed();
	}

	public void open() {
		System.out.println("Please Wait Opening Drawer...");
	}

	public void close() {
		System.out.println("Please Wais Closing Drawer...");
	}

	public void play() {
		System.out.println("Now Playing DVD.");
	}

	public void stop() {
		System.out.println("Stoping..");
	}

	public static void main(String args[]) {
		DVDPlayer dvdPlayer = DVDPlayer.getInstance();
		dvdPlayer.openCloseButtonPushed();
		dvdPlayer.playButtonPushed();
		dvdPlayer.stopButtonPushed();
	}

	public Object getCurrentState() {
		return state;
	}

}

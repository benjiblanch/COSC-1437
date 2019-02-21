package MicrowaveControl;


public class FrozenBurrito {
	public static void main(String[] args) {
		MicrowaveControl me = new MicrowaveControl();
		me.moreTime();
		me.powerUp();
		me.start();
		
		System.out.println("\nYou put the burrito back in to let it cool.\n");
		me.moreTime();
		me.powerUp();
		me.reset();
		me.start();
	}
}
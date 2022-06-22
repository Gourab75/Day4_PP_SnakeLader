package javapackage;

public class SnakeLader {
	//declaring instance variable
	int playerPosition=0;
	
	//method to display player position
		public void showPosition() {
	        System.out.println("Player Position: " + playerPosition);
	    }
	
	public static void main(String[] args) {
		// Displaying welcome message
        System.out.println("Welcome to Snake and Ladder Simulation");
        // Creating object for Player
        SnakeLader player = new SnakeLader();
        player.showPosition();
	}

}

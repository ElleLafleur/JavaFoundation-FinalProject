import java.util.Scanner;

public class Player {
    String playerName;
    int playerPoints;


    public Player() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter players name: ");
        this.playerName = in.nextLine();

    }

    public void addPoints(int num){
        playerPoints = playerPoints + num;
        System.out.println("Congratulations " + playerName + " you have received " + num + " points!");
    }



}

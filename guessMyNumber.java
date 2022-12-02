import java.util.Scanner;
import java.util.Random;

class GameLogic{
    public String name;
    GameLogic(String nm){
        name = nm;
    }
    public String startEngine(int num, int comp){
        if(num < comp){
            return "Guess More than that.";
        }
        else if(num > comp){
            return "Guess Less than that";
        }
        else{
            return "You Got It :)";
        }
    }
}
public class guessMyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        GameLogic player = new GameLogic("Anindya");
        int num;

        System.out.println("Hi " + player.name + ", Welcome to Guess My Number game...");
        System.out.println("*** Please guess a number between 0 to 99 ***");
        int comp = rand.nextInt(100);
        int i= 0;
//        System.out.println(comp);
        do {
            num = sc.nextInt();
            String result = player.startEngine(num,comp);
            System.out.println(result);
            i++;
        }
        while(num != comp);
        System.out.println("You guessed it in " + i + "th attempts..");
    }
}

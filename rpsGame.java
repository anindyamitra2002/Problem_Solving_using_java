import java.util.Scanner;
import java.util.Random;
class GameEngine{
   public String name;
//    0 - rock
//    1- Paper
//    2 - Scissor
    GameEngine(String n){
        name = n;
    }
   public String Check(int userInput, int comp){
       if(userInput == comp){
           return "Match Draw...";
       }
       else if (userInput == 0 && comp == 2 || userInput == 1 && comp == 0 || userInput == 2 && comp == 1){
           return "You Win...";
       }
       else{
           return "You Lose...";
       }
   }
    public void Wish(String name){
        System.out.println("Hi " + name + ", Welcome to Rock-Paper-Scissor Game!...");
    }
}
public class rpsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        GameEngine player = new GameEngine("Anindya");
        while(true) {
            player.Wish(player.name);
            int user = sc.nextInt();
            int com = rnd.nextInt(3);
            String result = player.Check(user, com);
            System.out.println(com);
            System.out.println(result);
        }
    }
}

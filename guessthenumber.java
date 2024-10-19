import java.util.Scanner;
import java.util.Random;
class Game
{
    private int noofguesses;
    private int compchoice,userchoice;
    public Game(){
        Random rand=new Random();
        compchoice=rand.nextInt(1,101);
        //System.out.println(compchoice);
    }
    public void userinput(int num)
    {
        userchoice=num;
    }
    public boolean iscorrect()
    {
        noofguesses++;
        if(userchoice>compchoice)
        {
        System.out.println("You have chosen bigger number");
        System.out.println("Try again...");
        return false;
        }
        else if(userchoice<compchoice)
        {
            System.out.println("You have chosen smaller number");
            System.out.println("Try again...");
            return false;
        }
        else
        {
        System.out.println("Correct guess");
        return true;
        }
    }
    public void setnoofguesses()
    {
        noofguesses=0;
    }
    public int getnoofguesses()
    {
        return noofguesses;
    }

}
    public class guessthenumber {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Game game=new Game();
        boolean ch;
        System.out.println("\"GUESS THE NUMBER\"");
        System.out.println();
        game.setnoofguesses();
        do
        {
            System.out.print("Guess the number between 1 to 100=");
            int num=sc.nextInt();
            game.userinput(num);
           ch=game.iscorrect();
        }while(!ch);
        int guesses=game.getnoofguesses();
        System.out.println("The no of guesses you taken to guess the number="+guesses);
        System.out.println("Your score of 100="+ (100-guesses));
        if(guesses<=10)
        System.out.println("You are a pro guesser...");
        else if(guesses>10&&guesses<=20)
        System.out.println("You are a good guesser...");
        else
        System.out.println("You played well...");
        sc.close();
        }
}

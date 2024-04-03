import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LotteryProgram {
    public static final int NUMBER=6;
    public static final int MAX_NUMBERS=40;
    public static final int PRIZE=100;
    /*
    * randomly generate a winning lottery ticket
    * prompt the player to enter lotto numbers from 1 to 40
    * depending on how many numbers match, the player wins various prizes.*/
    public static void main(String[] args) {

        //3. getting winning number and tickets sets
        Set<Integer>  winning=createWinningNumbers();
        Set<Integer>  ticket=getTickets();

        System.out.println();
        //4. keeping only winning numbers from user's ticket
        //using retainall()  to remove non matches
        Set<Integer>  matches=new TreeSet<>(ticket);
        matches.retainAll(winning);

        //5. calculating prize
        System.out.println("Your ticket was: "+ticket);
        System.out.println("Winning numbers: "+winning);

        if(matches.size()>0){
            double prize=PRIZE* Math.pow(2,matches.size());
            System.out.println("Matched numbers: "+matches);
            System.out.printf("Your prize is $%.2f\n",prize);
        }


    }

    //1. generate a set of the winning lotto numbers
    public static Set<Integer> createWinningNumbers(){
        Set<Integer> winning=new TreeSet<>();
        Random random=new Random();
        while(winning.size()<NUMBER){
            int number=random.nextInt(MAX_NUMBERS)+1;

            winning.add(number);
        }
        return winning;
    }

    //2. reading the play's lottery ticket from the console
    public static Set<Integer> getTickets(){
        Set<Integer> tickets=new TreeSet<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter "+NUMBER+" lotto numbers");
        while(tickets.size()<NUMBER){
            int number=scanner.nextInt();
            if(number<=MAX_NUMBERS){
                tickets.add(number);
            }

        }
        return tickets;
    }
}

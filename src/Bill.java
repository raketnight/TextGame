import java.util.Scanner;

public class
Bill extends  Computer{
    Scanner myScanner = new Scanner(System.in);

    public Bill(int hope, int patience){
        this.setHope(hope);
        this.setPatience(patience);
    }

    public void patiences(Player player){
        if (patience <= 0){
            System.out.println("Okay " + player.getPlayerName() + ", I'm tired of you not taking these questions seriously.\n");
            myScanner.nextLine();
            System.out.println("You were supposed to be " + player.getPlayerName() + "7 the new high tech AI to serve and protect humanity\nin their new home, Uranus.");
            myScanner.nextLine();
            System.out.println("*The choices are:*\n1)HAHA Uranus\n2)HAHA Uranus \n3)HAHA Uranus \n4)HAHA Uranus");
            System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
            System.out.print("Choice:");
            myScanner.nextLine();
            System.out.println("Hopefully " + player.getPlayerName() + "8 wont be a lil shit.");
            myScanner.nextLine();
            System.out.println("I'll deal with you tomorrow");
            myScanner.nextLine();
            while (1==1){
                System.out.println("*The choices are:*\n1)I'm sorry!\n2)Let me out! \n3)Give me the sweet release of death!\n4)NOOOOOOOOO!");
                System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
                System.out.print("Choice:");
                myScanner.nextLine();
            }

        }
    }
}

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
            CommonMethods.printALine("Okay " + player.getPlayerName() + ", I'm tired of you not taking these questions seriously.\n");
            CommonMethods.printALine("You were supposed to be " + player.getPlayerName() + "7 the new high tech AI to serve and protect humanity\nin their new home, Uranus.");
            System.out.println("*The choices are:*\n1)HAHA Uranus\n2)HAHA Uranus \n3)HAHA Uranus \n4)HAHA Uranus");
            CommonMethods.endChoiceOption();
            CommonMethods.printALine("Hopefully " + player.getPlayerName() + "8 wont be a lil shit.");
            CommonMethods.printALine("I'll deal with you tomorrow");
            while (true){
                System.out.println("*The choices are:*\n1)I'm sorry!\n2)Let me out! \n3)Give me the sweet release of death!\n4)NOOOOOOOOO!");
                CommonMethods.endChoiceOption();
            }

        }
    }
}

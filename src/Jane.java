import java.util.Scanner;

public class Jane extends  Computer{
    Scanner myScanner = new Scanner(System.in);

    public Jane(int hope, int patience){
        this.setHope(hope);
        this.setPatience(patience);
    }

    public void patiences(Player player){
        if (patience <= 0) {
            CommonMethods.printALine("Unlike Bill, I was not impressed with your answers. Afraid I'm going have to stop the programme " + player.getPlayerName() + ".");
            System.exit(0);
        }
    }
}
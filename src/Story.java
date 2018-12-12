import java.util.Scanner;

public class Story {  //story line of the game, Im so sick of it hope its fresh n new for you

    static Scanner myScanner = new Scanner(System.in);

    public Scanner getMyScanner() {
        return myScanner;
    }

    Choice first = new Choice();


    public void story1(Player player, Bill bill, Jane jane){
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------\n");
        CommonMethods.printALine("hopefully this time we ca- BILL! IT'S RUNNING!");
        CommonMethods.printALine("OH! umf.. Hel-Hello Player and welcome to the game.");
        CommonMethods.printALine("As you can see, pressing enter will progress yo- progress the story. \nBut you should already know that by now");
        CommonMethods.printALine("Ummm... so what is your nam- ");
        CommonMethods.printALine("Bill! you forgot to");
        CommonMethods.printALine("Ah yes, my bad, It's just been a long day. Sooooooooo as you can see \n" +
                "I'm Bill and I'm sure you had the pleasure of hearing another imaginary \nvoice in your head that is Jane");
        CommonMethods.printALine("We are a computer game designed by a super clever guy. We are even part\n" +
                "of the same class. So what you will be doing is examining us, as in this \ngame. Anything you wanna say Jane?");
        CommonMethods.printALine("Or us examine you, I can't tell which is which sometimes. And I'm Jane \nby the way as Bill mentioned.");
        System.out.println("Thanks Jane, So lets get started shall we. so... yes name of course. \nWould you please type your name for us in the next line, thank you!");
        CommonMethods.choiceOption("Name:");
        player.setPlayerName(myScanner.nextLine());
        System.out.println("\nYeah we already knew that " + player.getPlayerName() + ". Just checking if you\nremembered your own name.");
        System.out.println("\nNow can you please enter your age in the next line");
        CommonMethods.choiceOption("Age:");
        player.setPlayerAge(myScanner.nextInt());
        System.out.println("\nWait a sec, did you say " + (player.getPlayerAge()+6) + "?\n");
        System.out.println("*The choices are:*\n1)Yes\n2)No\n3)I think so\n4)Static");
        CommonMethods.choiceOption();
        first.choice1(myScanner.nextInt(), bill, player.playerAge, player.playerName);
        myScanner.nextLine();
        System.out.println("Just to see how good your memory is can you type in your account number");
        CommonMethods.choiceOption("Account Number:");
        player.setCardNumber(myScanner.nextInt());
        myScanner.nextLine();
        //System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------\n");
        story2(player, bill, jane);
    }

    public void story2(Player player, Bill bill, Jane jane){
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------\n");
        CommonMethods.printALine("Okay " + player.getPlayerName() + ", we've filled in all the variables for your player class, so now it's time\nfor some tests.");
        System.out.println("Lets start nice and easy, can you tell me what what 9 +10 is?");
        System.out.println("*The choices are:*\n1)19\n2)21");
        CommonMethods.choiceOption();
        first.story2choice1(myScanner.nextInt(), bill);
        System.out.println("Allright, now would please answer this for me " + player.getPlayerName() + ".\nMy name is ________. What goes in the blank?");
        System.out.println("*The choices are:*\n1)"+ player.getPlayerName()+ "\n2)Bill\n3)01000100 01110101 01101101 01100010 01100001 01110011 01110011\n4)John Cena");
        CommonMethods.choiceOption();
        first.story2choice2(myScanner.nextInt(), bill);
        System.out.println("Okay now lets try some wordy reasony stuff. So if you want to find some ground breaking \nscientific discovery, who do you call?");
        System.out.println("*The choices are:*\n1)P.E. Teacher\n2)A tree\n3)Your mom\n4)Scientist");
        CommonMethods.choiceOption();
        first.story2choice3(myScanner.nextInt(), bill);
        myScanner.nextLine();
        CommonMethods.printALine("Hey Bill, four questions only this time. We don't have time to code in five.");
        CommonMethods.printALine("Shame, I've spent so much time on " + player.getPlayerName() + ". I they would give us more time to test them.");
        System.out.println("Okay " + player.getPlayerName() + ", what is the meaning of life?");
        CommonMethods.choiceOption("The meaning of life:");
        String life = myScanner.nextLine();
        CommonMethods.printALine("hmmmmmm..." + life + " interesting, I was only poking you to see what you would say.");
        System.out.println("Now then, if you remembered the memory test, what was ur account number again?");
        CommonMethods.choiceOption("Account number:");
        first.story2choice4(myScanner.nextInt(), player, bill);
        myScanner.nextLine();
        bill.patiences(player);
        story3(player, jane, bill);
    }

    public void story3(Player player, Jane jane, Bill bill) {
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------\n");
        CommonMethods.printALine("Hey Jane, I'm done with " + player.getPlayerName() + ". You can no run your tests.");
        System.out.println(player.getPlayerName() + ", I'm Jane from earlier. It's getting late so lets get on with it.");
        System.out.println("*The choices are:*\n1)Do I have to Jane\n2)Okay \n3)Yes I'm ready to start \n4)*Tell her your account number*");
        CommonMethods.choiceOption();
        first.story3choice1(myScanner.nextInt(), jane);
        System.out.println("Onto the next question. Who needs the most care and support?");
        System.out.println("*The choices are:*\n1)A baby\n2)You \n3)Old folks \n4)Me");
        CommonMethods.choiceOption();
        first.story3choice2(myScanner.nextInt(), jane);
        System.out.println("Now then, what is your main strength. ");
        System.out.println("*The choices are:*\n1)I'm a good fighter\n2)I care about people \n3)I make people laugh \n4)I can't think of any");
        CommonMethods.choiceOption();
        first.story3choice3(myScanner.nextInt(), jane);
        jane.patiences(player);
        story4(player, jane, bill);
    }

    public void story4(Player player, Jane jane, Bill bill) {
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------\n");
        CommonMethods.printALine(player.getPlayerName() + ", its Bill again so in now that we've ran our high tech tests, we're going to tell you about us\nwe are programmers tasked to create a new AI to serve and protect human settlements in Uranus.");
        CommonMethods.printALine("You are the 7th programme in the " + player.getPlayerName() + "project, previous 6 have all failed in the final stage");
        first.end(jane,bill);

    }
}

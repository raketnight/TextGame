import java.util.Scanner;

public class Choice { //called in the story class it gives modifies the hope and patience for bill and jane the computer subclasses
    Ending end = new Ending();
    Scanner myScanner = new Scanner(System.in);

    public void choice1(int chosen, Computer cpu, int age, String name){
        if (chosen == 1){
            System.out.println("\nHmmm... Okay\n");
            cpu.setHope(cpu.getHope() - 2);
            cpu.setPatience(cpu.getPatience() -2);
        }
        else if (chosen == 2){
            System.out.println("\nAh yes there was an error in the i5 core processor," + age + " is your age.\n");
            cpu.setHope(cpu.getHope() + 2);
        }
        else if (chosen == 3){
            System.out.println("\nmmmmmm....\n");
            cpu.setHope(cpu.getHope() -1);
            cpu.setPatience(cpu.getPatience() -1);
        }
        else if (chosen == 4){
            end.staticEnding(name);
        }
    }

    public void story2choice1(int chosen, Computer cpu){
        if (chosen == 1){
            System.out.println("\nWow, look at you go. You can do primary school Maths.");
            cpu.setHope(cpu.getHope() + 1);
        }
        else if (chosen == 2){
            System.out.println("\nOkay, I find adding tricky too sometimes and I am a 'computer programme'.");
            cpu.setHope(cpu.getHope() - 1);
            cpu.setPatience(cpu.getPatience() -1);
        }
    }

    public void story2choice2(int chosen, Computer cpu){
        if (chosen == 1){
            System.out.println("Yes, that is your name indeed.");
            cpu.setHope(cpu.getHope() + 1);
        }
        else if (chosen == 2){
            System.out.println("Yes, I am indeed Bill.");
            cpu.setHope(cpu.getHope() + 1);
        }
        else if (chosen == 3){
            end.binaryEnding();
        }
        else if (chosen == 4){
            System.out.println("I cant see why that is the case.");
            cpu.setHope(cpu.getHope() - 1);
            cpu.setPatience(cpu.getPatience() - 1);
        }
    }

    public void story2choice3(int chosen, Computer cpu){
        if (chosen == 1){
            System.out.println("Not what i had in mind but I guess the wording of the question was a bit off. I only have\n7 hours to do this anyways.");
            cpu.setHope(cpu.getHope() - 1);
        }
        else if (chosen == 2){
            System.out.println("Unless that tree is from Lord of the rings, I don't think this answer is right.");
            cpu.setHope(cpu.getHope() - 1);
            cpu.setPatience(cpu.getPatience() - 2);
        }
        else if (chosen == 3){
            System.out.println("Hahaha,that's quite good.");
            cpu.setHope(cpu.getHope() + 1);
            cpu.setPatience(cpu.getPatience() - 1);
        }
        else if (chosen == 4){
            System.out.println("That is what I had hope you would say!");
            cpu.setHope(cpu.getHope() +1 );
            cpu.setPatience(cpu.getPatience() +1 );
        }
        myScanner.nextLine();
    }
    public void story2choice4(int chosen, Player player, Computer cpu){
        if (chosen == player.getCardNumber()){
            System.out.println("Very good great to see your memory is working well.");
            cpu.setHope(cpu.getHope() + 2);
        }
        else if (chosen != player.getCardNumber()){
            System.out.println("That is very disappointing, I had high hopes for you 7 err I mean " + player.playerName + ".");
            cpu.setHope(cpu.getHope() - 1);
            cpu.setPatience(cpu.getPatience() - 2);
        }
        myScanner.nextLine();
    }
    public void story3choice1(int chosen, Computer cpu){
        if (chosen == 1){
            System.out.println("Yes you have to, I don't want to be here but we're only doing our jobs.");
            cpu.setHope(cpu.getHope() - 1);
        }
        else if (chosen == 2){
            cpu.setHope(cpu.getHope() + 1);
        }
        else if (chosen == 3){

            cpu.setHope(cpu.getHope() + 2);
            cpu.setPatience(cpu.getPatience() + 1);

        }
        else if (chosen == 4){
            System.out.println("That is your account number not what i wanted at this time.");
            cpu.setHope(cpu.getHope() - 1);
            cpu.setPatience(cpu.getPatience() - 1);
        }
        myScanner.nextLine();
    }
    public void story3choice2(int chosen, Computer cpu){
        if (chosen == 1){
            System.out.println("Yeah I think a baby does too.");
            cpu.setHope(cpu.getHope() + 2);
            cpu.setPatience(cpu.getPatience() + 1);
        }
        else if (chosen == 2){
            System.out.println("Whats that supposed to mean?");
            cpu.setHope(cpu.getHope() - 1);
            cpu.setPatience(cpu.getPatience() - 1);
        }
        else if (chosen == 3){
            System.out.println("Yeah I somewhat agree.");
            cpu.setHope(cpu.getHope() + 1);
        }
        else if (chosen == 4){
            System.out.println("ummm.. what?");
            cpu.setHope(cpu.getHope() - 1);
            cpu.setPatience(cpu.getPatience() - 1);
        }
        myScanner.nextLine();
    }
    public void story3choice3(int chosen, Computer cpu){
        if (chosen == 1){
            System.out.println("That is not really the skill we are looking for.");
            cpu.setHope(cpu.getHope() - 2);
            cpu.setPatience(cpu.getPatience() - 1);
        }
        else if (chosen == 2){
            System.out.println("Promising");
            cpu.setHope(cpu.getHope() + 2);
            cpu.setPatience(cpu.getPatience() + 2);
        }
        else if (chosen == 3){
            System.out.println("We can work with that.");
            cpu.setHope(cpu.getHope() + 1);
        }
        else if (chosen == 4){
            System.out.println("That is somewhat unfortunate.");
            cpu.setHope(cpu.getHope() - 1);
            cpu.setPatience(cpu.getPatience() - 1);
        }
        myScanner.nextLine();
    }
    public void end(Computer jane, Computer bill){
        end.ending(jane, bill);
    }
}

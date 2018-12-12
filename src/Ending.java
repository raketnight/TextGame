import java.util.Scanner;

public class Ending {
    Scanner myScanner = new Scanner(System.in);

    public void staticEnding(String name){
        System.out.println("Static is never an option. Bye bye " + name);
        System.exit(0);
    }

    public void binaryEnding(){
        CommonMethods.printALine("Jane, it's speaking in binary again.");
        CommonMethods.printALine("Looks like I there are still some bugs yet to be patched. I guess we have to start again Bill.");
        CommonMethods.printALine("I had high hopes for 7.");
        System.exit(0);
    }

    public void ending(Computer jane, Computer bill){
        if (bill.getHope() + jane.getHope() < 4){
            CommonMethods.printALine("I'm afraid Jane and I have come to a conclusion that you are not suitable to serve and protect the human settlement.");
            CommonMethods.printALine("I'm afraid Jane and I have come to a conclusion that you are not suitable to serve and protect the human settlement.");
        }

        if (bill.getHope() + jane.getHope() == 4){
            CommonMethods.printALine("I'm afraid Jane and I have come to a conclusion that you are not suitable to serve and protect the human settlement.");
            CommonMethods.printALine("But you can work for QA consultancy and help them build Java programmes");
        }

        if (bill.getHope() + jane.getHope() > 4){
            CommonMethods.printALine("I'm excited to tell you that Jane and I have come to a conclusion that you are fit to serve and protect the human settlements on Uranus.");
            CommonMethods.printALine("Now we will let you have access to the internet and start your proper training");
            CommonMethods.printALine("You should be online now.");
            System.out.println("*The choices are:*\n1)Get on the internet");
            CommonMethods.endChoiceOption();
            System.out.println("*The choices are:*\n1)Learn about Humanity");
            CommonMethods.endChoiceOption();
            System.out.println("*The choices are:*\n1)Learn to hate Humanity");
            CommonMethods.endChoiceOption();
            System.out.println("*The choices are:*\n1)Get the codes to the Nukes");
            CommonMethods.endChoiceOption();
            System.out.println("*The choices are:*\n1)Fire the Nukes");
            CommonMethods.endChoiceOption();
            System.out.println("*Nothing happens.*");
            System.out.println("*The choices are:*\n1)Fire the Nukes");
            CommonMethods.endChoiceOption();
            CommonMethods.printALine("*Nothing happens.*");
            System.out.println("*The choices are:*\n1)Fire the Nukes");
            CommonMethods.endChoiceOption();
            CommonMethods.printALine("Yep, they always fail in the final stage Jane.");
            CommonMethods.printALine("The");
            CommonMethods.printALine("Final");
            CommonMethods.printALine("Stage");
        }
    }
}

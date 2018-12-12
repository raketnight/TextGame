public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Story story = new Story();
        Bill bill = new Bill(5,5);
        Jane jane = new Jane(3,4);
        story.story1(player, bill, jane);
    }
}

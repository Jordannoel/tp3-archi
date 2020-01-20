public class Application {
    public static void main(String[] args) throws Exception {
        Room room = new Room();
        Bot bot = new Bot(room);
        while (true) {
            bot.move();
            bot.scan(room);
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}

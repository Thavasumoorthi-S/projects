package example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Coordinates{
    private static final Logger LOGGER = Logger.getLogger("global");
    int x;
    int y;
    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Coordinates(Coordinates obj) {
        x=obj.x;
        y=obj.y;
    }
    public String equals(Coordinates c3) {
        String result;
        result = this.x == c3.x && this.y == c3.y ? "true" : "false";
        return result;
    }
    public static void execute()
    {
        Scanner sc=new Scanner(System.in);
        String result;
        LOGGER.log(Level.INFO, "Enter the value x:");
        int x = sc.nextInt();
        LOGGER.log(Level.INFO, "Enter the value y:");
        int y = sc.nextInt();
        Coordinates c = new Coordinates(x, y);
        Coordinates c2 = new Coordinates(c);
        String s = c.equals(c2);
        result = "Orginal object and clonable object is Same ?: " + s;
        LOGGER.info(result);
        LOGGER.log(Level.INFO, "Enter the value x:");
        x = sc.nextInt();
        LOGGER.log(Level.INFO, "Enter the value y:");
        y = sc.nextInt();
        Coordinates c3 = new Coordinates(x, y);
        String s2 = c.equals(c3);
        result = "Orginal object and new object is Same ?:" + s2;
        LOGGER.info(result);
        LOGGER.info(s2);
    }
}

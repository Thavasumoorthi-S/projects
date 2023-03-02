package example;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arraylist {

    private Arraylist()
    {

    }
    public static void execute()
    {
        Logger logger = Logger.getLogger("com-api-jar");
        ArrayList<String> list = new ArrayList<>();
        list.add("Maruti");
        list.add("Hyundai");
        list.add("Mahindra");
        list.add("Toyota");
        list.add("Chevrolet");
        list.add("Ford");
        list.add("Nissan");
        logger.info(list.get(0));
        logger.log(Level.INFO, () -> "" + list.clone());
        logger.log(Level.INFO, () -> "" + list.hashCode());
        logger.log(Level.INFO, () -> "" + list.remove(6));
        list.add("BMW");
        list.add("Tesla");
        logger.log(Level.INFO, () -> "" + list.clone());
        logger.log(Level.INFO, () -> "" + list.remove(0));
        logger.log(Level.INFO, () -> "" + list.isEmpty());
        logger.log(Level.INFO, () -> "" + list.size());
        list.clear();
        logger.log(Level.INFO, () -> "" + list.isEmpty());
    }
}

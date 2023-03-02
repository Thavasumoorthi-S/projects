package example;

import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Treeset {

    private Treeset()
    {

    }
    public static void execute()
    {
        Logger logger = Logger.getLogger("com-api-jar");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Tamil");
        treeSet.add("English");
        treeSet.add("Maths");
        treeSet.add("Science");
        treeSet.add("computerscience");
        logger.log(Level.INFO, () -> "" + treeSet.clone());
        logger.log(Level.INFO, () -> "" + treeSet.first());
        logger.log(Level.INFO, () -> "" + treeSet.last());
        logger.log(Level.INFO, () -> "" + treeSet.size());
        logger.log(Level.INFO, () -> "" + treeSet.isEmpty());
        treeSet.clear();
    }
}

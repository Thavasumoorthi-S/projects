package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fileopds
{
    private  Fileopds()
    {

    }
public static void execute() throws IOException {
    Logger logger = Logger.getLogger("com-api-jar");
    String read;
    int count = 0;
    HashMap<String, Integer> hmap = new HashMap<String, Integer>();
    Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((a, b) -> {
        return b.getValue() - a.getValue();
    });
    FileReader fr = new FileReader("C:\\Users\\Tringapps-User8\\IdeaProjects\\Fileopds\\src\\main\\java\\org\\example\\student.txt");
    BufferedReader br = new BufferedReader(fr);
    while ((read = br.readLine()) != null) {
        String[] cont = read.split(" ");
        count = count + cont.length;
        for (String s : cont) {
            if (hmap.containsKey(s)) {
                hmap.put(s, hmap.get(s) + 1);
            } else {
                hmap.put(s, 1);
            }
        }
    }
    logger.log(Level.INFO, () -> "" + hmap.clone());
    logger.info("Total number of words in the file :");
    logger.log(Level.INFO, Integer.toString(count), count);
    queue.addAll(hmap.entrySet());
    for (Map.Entry<String, Integer> que : queue) {
        logger.info(que.getKey() + " =>" + que.getValue() + " \n");
    }
}
}

package example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Hashset {
    String name;
    int id;
    Logger logger=Logger.getLogger("com-api-jar");
    Hashset(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString()
    {
        String result;
        result="name :"+this.name+" ,id :"+this.id;
        return result;
    }
    public void studentdetails()
    {
        String ans="StudentName :"+this.name+"; StudentId :"+this.id;
        logger.log(Level.INFO,()->""+ans);
    }
    @Override
    public boolean equals(Object o) {
        Hashset hashing = (Hashset) o;
        boolean result;
        result=id==hashing.id;
        return result;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void excute() {
        Logger logger = Logger.getLogger("com-api-jar");
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            logger.info("\n1)Hashset\n2)Treeset\n3)Hashmap\n4)Exit");
            logger.info("Choose any one of the option in the above ");
            choice = sc.nextInt();
            if (choice == 1) {
                HashSet<Hashset> hset = new HashSet<>();
                Hashset h1 = new Hashset("thavasu", 34);
                Hashset h2 = new Hashset("moorthi", 35);
                Hashset h3 = new Hashset("vaasan", 36);
                Hashset h4 = new Hashset("kannan", 37);
                Hashset h5 = new Hashset("moorthi", 34);
                Hashset h6 = new Hashset("rajesh", 37);
                logger.log(Level.INFO, () -> "" + h1);
                logger.log(Level.INFO, () -> "" + h2);
                hset.add(h1);
                hset.add(h2);
                hset.add(h3);
                hset.add(h4);
                hset.add(h5);
                hset.add(h6);
                logger.log(Level.INFO, () -> "" + hset);
                for (Hashset hashing : hset) {
                    hashing.studentdetails();
                }
            } else if (choice == 2) {
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
            } else if (choice == 3) {
                HashMap<Integer, String> map = new HashMap<>();
                map.put(1, "Ajay");
                map.put(2, "Deepan");
                map.put(3, "Elavarasan");
                map.put(4, "Harish");
                map.put(6, "Moorthi");
                map.put(7, "Thavasu");
                logger.info(map.get(7));
                logger.info(map.get(6));
                logger.log(Level.INFO, () -> "" + map.clone());
                logger.info("" + map.isEmpty());
                logger.log(Level.INFO, () -> "" + map.replace(4, "kavin"));
                logger.info(map.get(4));
                logger.info("" + map.getClass());
                logger.log(Level.INFO, () -> "" + map.remove(2));
                logger.info(map.get(2));
                map.clear();
                logger.log(Level.INFO, () -> "" + map.size());
            } else if (choice == 4) {
                break;
            }
            else{
                logger.info("please choose correct option in the above");
            }
        }
    }
}

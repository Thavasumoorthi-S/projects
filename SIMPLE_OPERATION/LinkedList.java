package example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LinkedList
{
    static Logger logger=Logger.getLogger("com.api.jar");
    static  Scanner sc=new Scanner(System.in);
    static final String CON="Enter the index:";
    Node rootNode=null;
    int count=0;
    Node middnode=null;

    static class Node
    {
        int data;
        Node nextNode;
        Node(int data)
        {
            this.data=data;
        }
    }
    public void addElement(int value){
        if(this.rootNode == null){
            this.rootNode= new Node(value);
        }else{
            var temp = this.rootNode;
            while(temp.nextNode != null){
                temp = temp.nextNode;
            }
            temp.nextNode = new Node(value);
        }
        this.count++;
        logger.info("successfully Element added ");
    }
    public void removeElement(int indecx){
        Node prev= this.rootNode;
        Node temp1=this.rootNode.nextNode;
        int index=1;
        while(index!=indecx-1)
        {
            temp1=temp1.nextNode;
            prev=prev.nextNode;
            index++;
        }
        prev.nextNode=temp1.nextNode;
        logger.info("Successfully Removed Element ");
    }
    public void addMiddleElement(int value,int indecx)
    {
        Node prev= this.rootNode;
        Node temp1=this.rootNode.nextNode;
        int  count1=1;
        while(count1!=(indecx-1))
        {
            temp1=temp1.nextNode;
            prev=prev.nextNode;
            count1++;
        }
        this.middnode=new Node(value);
        this.middnode.nextNode=prev.nextNode;
        prev.nextNode=this.middnode;
        logger.info("Successfully index based Element inserted ");
    }
    public void display() {
        Node temp = this.rootNode;

        if (temp == null) {
            logger.info(" LinkedList Is empty!");
        } else {
            while (temp != null) {
                logger.log(Level.INFO,Integer.toString(temp.data),+temp.data);
                temp = temp.nextNode;
            }

        }
    }
    public static void execute()
    {
        Logger logger = Logger.getLogger("com.api.jar");
        int choice;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            logger.info("\n1)Array\n2)Arraylist \n3)Linkedlist \n4)Exit");
            logger.info("choose any one of the option in the above");
            choice=sc.nextInt();
            if(choice==1)
            {
               array();
            }
            else if(choice==2)
            {

               arraylist();

            }
            else if(choice==3)
            {
               linkedlist();
            }
            else if(choice==4)
            {
                break;
            }
            else{
                logger.info("please choose correct option in the above");
            }
        }

    }

    public static void array()
    {
        int choice;
        int size;
        logger.info("Enter the array size ");
        size = sc.nextInt();
        Arrayoperation ex = new Arrayoperation(size);
        int index;
        int element;
        while (true) {
            logger.info("\n1)Add element \n2)Remove element \n3)insert at particular index position \n4)delete at particularindex position \n5)display \n6)insert at beginning \n7)Delete at end \n8)search element \n9)Exit");
            logger.info("Choose any one of the option in the above :");
            choice = sc.nextInt();
            if (choice == 1) {
                logger.info("Enter the value: ");
                element = sc.nextInt();
                ex.add(element);
            } else if (choice == 2) {
                ex.delete();
            } else if (choice == 3) {
                logger.info(CON);
                index = sc.nextInt();
                logger.info("Enter the value ");
                element = sc.nextInt();
                ex.insertatindex(index, element);
            } else if (choice == 4) {
                logger.info(CON);
                index = sc.nextInt();
                ex.deleteatindex(index);
            } else if (choice == 5) {
                ex.display();
            } else if (choice == 6) {
                logger.info("Enter the element :");
                element = sc.nextInt();
                ex.insertatbegin(element);
            } else if (choice == 7) {
                ex.deleteatend();
            } else if (choice == 8) {
                logger.info("Enter the value ");
                element = sc.nextInt();
                ex.search(element);
            } else if (choice == 9) {
                break;
            }
        }
    }
    public static void arraylist()
    {

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
    public static void linkedlist()
    {
        int choice;
        LinkedList list = new LinkedList();
        int index;
        int element;
        while (true) {
            logger.info("\n1)add the Element \n2)index based remove element \n3)particular index based insert element\n4)display \n5)exit");
            logger.info("Choose any one of the option in the above: ");
            choice = sc.nextInt();
            if (choice == 1) {
                logger.info("Enter the  element:");
                element = sc.nextInt();
                list.addElement(element);
            } else if (choice == 2) {
                logger.info(CON);
                index = sc.nextInt();
                list.removeElement(index);
            } else if (choice == 3) {
                logger.info("Enter the  element:");
                element = sc.nextInt();
                logger.info(CON);
                index = sc.nextInt();
                list.addMiddleElement(element, index);
            } else if (choice == 4) {
                list.display();
            } else if (choice == 5) {
                break;
            }
        }

    }
}

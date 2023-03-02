package example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class Shape
{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String type;
    int length;
    int breadth;
    int height;
    int radius;
    int side1;
    int side2;
    int base;
    Shape(int length,int breadth,String type)
    {
        this.length=length;
        this.breadth=breadth;
        this.type=type;
    }
    Shape(int breadth,int height,int side1,int side2,int base,String type)
    {
        this.breadth=breadth;
        this.height=height;
        this.side1=side1;
        this.side2=side2;
        this.base=base;
        this.type=type;
    }
    Shape(int radius,String type)
    {
        this.radius=radius;
        this.type=type;
    }
    public int rectarea()
    {
        int result1;
        result1=this.length*this.breadth;
        return result1;

    }public float triarea()
{
    float result;
    result=(float)(this.breadth*this.height)/2;
    return result;
}
    public double cirarea()
    {
        double result;
        result=Math.PI*this.radius*this.radius;
        return result;
    }
    public int rectperimeter()
    {
        int result;
        result=2*(this.length+this.breadth);
        return result;
    }
    public int triperimeter()
    {
        int result;
        result=this.side1+this.side2+this.base;
        return result;
    }
    public  double circumference()
    {
        double result;
        result=2*(Math.PI)*this.radius;
        return result;
    }
    public static void execute()
    {
        Scanner sc=new Scanner(System.in);
        String type;
        int length;
        int breadth;
        int height;
        int radius;
        int side1;
        int side2;
        int base;
        String s;
        while (true) {
            LOGGER.info("user enter correct spellling like rectangle,triangle,circle else other quit");
            type = sc.next();
            if (type.equals("rectangle")) {
                LOGGER.log(Level.INFO, "Enter the length: ");
                length = sc.nextInt();
                LOGGER.log(Level.INFO, "Enter the breadth: ");
                breadth = sc.nextInt();
                Shape shape = new Shape(length, breadth, type);
                s = "Area of the rectangle :" + shape.rectarea();
                LOGGER.info(s);
                s = "perimeter of the rectangle :" + shape.rectperimeter();
                LOGGER.info(s);
            } else if (type.equals("triangle")) {
                LOGGER.log(Level.INFO, "Enter the breadth: ");
                breadth = sc.nextInt();
                LOGGER.log(Level.INFO, "Enter the height: ");
                height = sc.nextInt();
                LOGGER.log(Level.INFO, "Enter the side1: ");
                side1 = sc.nextInt();
                LOGGER.log(Level.INFO, "Enter the side2: ");
                side2 = sc.nextInt();
                LOGGER.log(Level.INFO, "Enter the base: ");
                base = sc.nextInt();
                Shape shape = new Shape(breadth, height, side1, side2, base, type);
                s = "Area of the Triangle: " + shape.triarea();
                LOGGER.info(s);
                s = "perimeter of the Triangle: " + shape.triperimeter();
                LOGGER.info(s);
            } else if (type.equals("circle")) {
                LOGGER.log(Level.INFO, "Enter the radius: ");
                radius = sc.nextInt();
                Shape shape = new Shape(radius, type);
                s = "Area of the Circle:" + shape.cirarea();
                LOGGER.info(s);
                s = "circumference of the Circle: " + shape.circumference();
                LOGGER.info(s);
            } else {
                break;
            }
        }
    }

}

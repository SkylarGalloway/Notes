import java.util.Scanner;

public class triangle {

    public static void main(String []args) {
        Scanner SysIn = new Scanner(System.in);

        Point p1, p2, p3;

        Integer x, y;
        x = SysIn.nextInt();
        y = SysIn.nextInt();

        p1 = new Point();

        p1.x = x;
        p1.y = y;

        x = SysIn.nextInt();
        y = SysIn.nextInt();

        p2 = new Point();

        p2.x = x;
        p2.y = y;

        x = SysIn.nextInt();
        y = SysIn.nextInt();

        p3 = new Point();

        p3.x = x;
        p3.y = y;



        System.out.println("The points are: ");

        System.out.println("("+ p1.x + "," + p1.y + ")");
        System.out.println("("+ p2.x + "," + p2.y + ")");
        System.out.println("("+ p3.x + "," + p3.y + ")");

        System.out.println("The distance between the points is: ");
        System.out.println( p1.distanceTo(p2) );
        System.out.println( p1.distanceTo(p3) );
        System.out.println( p2.distanceTo(p3) );

        System.out.println("The distance between the points is: ");
        System.out.println( Point.distanceBetween(p1,p2) );
        System.out.println( Point.distanceBetween(p1,p3) );
        System.out.println( Point.distanceBetween(p2,p3) );
    }
}

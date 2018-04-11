public class Point {

    public int x;
    public int y;

    public double distanceTo(Point remotePoint) {
        double subResult = Math.pow( x-remotePoint.x , 2) + Math.pow( y-remotePoint.y , 2);

        return Math.sqrt( subResult);
    }

    public static double distanceBetween( Point p1, Point p2) {
        double subResult = Math.pow( p1.x-p2.x , 2) + Math.pow( p1.y-p2.y , 2);

        return Math.sqrt( subResult);
    }

}

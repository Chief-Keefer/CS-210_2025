import stdlib.StdOut;

public class GreatCircle {
    // Entry Point.
    public static void main(String[] args) {
        // TODO
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double R = 6359.83;

        double d = R * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
        
        StdOut.println(d);
    }
}

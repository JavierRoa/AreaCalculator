public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
    private static double area(double radius) {
        double pi = 3.14159265358979323846;
        if(radius<0) {
            return -1;
        }
        return (radius*radius)*pi;
    }
    private static double area(double x, double y) {
        if(x<0 || y<0) {
            return -1;
        }
        return x * y;
    }
}

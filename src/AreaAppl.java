public class AreaAppl {
    public static void main(String[] args) {
        double result = calcCircleArea(10);
        System.out.println(result);
        result = calcCircleArea(15.5);
        System.out.println(result);
        result = calcRectangleArea(10, 20);
        System.out.println(result);

    }

    public static double calcCircleArea(double radius) {
        return radius * radius * 3.1415926;
    }

    public static double calcSquareArea(double side) {
        return side * side;
    }

    public static double calcRectangleArea(double sideA, double sideB) {
        return sideA * sideB;
    }
}

public class IfElseAppl {
    public static void main(String[] args) {
        int height = 185;
        checkHeight(height);
        double res =max(0.2,0.1);
        System.out.println(res);

    }

    public static void checkHeight(int height) {
        System.out.println("Hello");
        if (height > 192) {
            System.out.println("I am very tall");
            System.out.println("Feed me");
        } else {
            System.out.println("I have ordinary height");
        }
        System.out.println("My height is " + height + " sm");
        System.out.println("Bay,bay");
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}


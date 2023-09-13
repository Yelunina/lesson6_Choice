public class ChoiceAppl {
    public static void main(String[] args) {
        int x = 10;
        int y = -x;
        System.out.println(y);
        y = -y;
        System.out.println(y);
        //int age = 28;
        double res = barmen(28);
        System.out.println("You max vol. = " + res);
        res = barmen(15);
        System.out.println("You max vol. = " + res);
        res = max(0.2, 0.1);
        System.out.println("Max = " + res);
        res = max(3.8, 5.4);
        System.out.println("Max = " + res);
        res = max(-2.3, -3.5);
        System.out.println("Max = " + res);
        res = abs(5);
        System.out.println("abs = " + res);
        res = abs(-7);
        System.out.println("abs = " + res);
        res = meal(188, 300);
        System.out.println("Meal = " + res);
        res = meal(195, 300);
        System.out.println("Meal = " + res);
        res = min(-5, -3);
        System.out.println("Min = " + res);
        res = minAdvanced(10, 20);
        System.out.println("MinAdvanced = " + res);
        res = sign(-15.5);
        System.out.println("Sign = " + res);
        res = sign(0);
        System.out.println("Sign = " + res);
        res = sign(0.1);
        System.out.println("Sign = " + res);
        res = sign1(-15.5);
        System.out.println("Sign1 = " + res);
        res = sign1(0);
        System.out.println("Sign1 = " + res);
        res = sign1(0.1);
        System.out.println("Sign1 = " + res);


    }

    public static double barmen(int age) {
        double vol = age >= 18 ? 42 : 2.5;
        return vol;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static double abs(double a) {
        return a >= 0 ? a : -a;
    }

    public static double meal(int height, double dish) {
        return height <= 192 ? dish : dish * 1.5;
    }

    /*
    Задача 1
    В классе ChoiceAppl создать метод min вычисляющий минимальное из двух чисел
     */
    public static double min(double a, double b) {
        return a <= b ? a : b;
    }

    /*
    Задача 2 (Advanced)
    В классе ChoiceAppl создать метод min вычисляющий минимальное из двух чисел,
    не используя операторы выбора (тернарный, if-else, switch-case) и готовые решения из java.
    Можно использовать методы уже написанные нами в классе ChoiceAppl
     */
    public static double minAdvanced(double a, double b) {
        return (a + b) - max(a, b);
    }

    /*
    Задача 3 (Advanced)
    В классе ChoiceAppl создать метод sign возвращающий знак числа.
    Этот метод должен принимать в качестве аргумента число, и возвращать 1 если аргумент положительный,
    -1 если аргумент отрицательный и 0 если аргумент равен нулю.
     */
    public static int sign(double number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int sign1(double number) {
        return number > 0 ? 1 : number < 0 ? -1 : 0;
    }
}


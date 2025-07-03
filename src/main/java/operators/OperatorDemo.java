package operators;

public class OperatorDemo {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 50;

        System.out.println(number1 == number2); // false
        System.out.println(number1 != number2); // true
        System.out.println(number1 > number2); // true
        System.out.println(number1>=number2); // true

        int a=10, b=20, c=30;

        System.out.println(a<b && a<c); // true and true = true
        System.out.println(a<b && a>c); // true and false = false
        System.out.println(a>b && a<c); // false and true = false
        System.out.println(a>b && a>c); // false and false = false

        System.out.println(a<b || a<c); // true or true = true
        System.out.println(a<b || a>c); // true or false = true
        System.out.println(a>b || a<c); // false 0r true = true
        System.out.println(!(a>b || a>c)); // false or false = false

    }
}

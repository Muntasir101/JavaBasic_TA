package variables;

public class VariablesDemo {
    public static int number1 = 100;

    public static void main(String[] arguments) {
        System.out.println("Hello World!");
        int[] numbers = new int[5];
        String name = "John Doe";
        float total_price =  100.10f;
        double price = 100.10;
        boolean is_active_status = false;
        int number2 = 50;
        // Implicit casting:
        double result = number1 + number2; // 100.0 + 50.0
        System.out.println(result);

        int a=10, b=20, c=30;
        String city ="NY", road ="123 queens";
    }
    public static void summation(){
        int number2 = 50;  // local variable
        int result = number1 + number2;
        System.out.println(result);
    }
    public static void subtraction(){
        double number2 = 50.5;  // local variable
        double result = number1 - number2;
        System.out.println(result);
    }
    public static void implicitCasting(){
        int price = 100;
        double total_price = price;
    }

    public static void explicitCasting(){
        double price = 10.50;
        int final_price = (int) price; // manually casting
    }
}

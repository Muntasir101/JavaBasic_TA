package methodsDemo;

public class Calculator {
    // Static method(No return and No Parameters)
    public static void subtraction(){
        int a = 10;
        int b = 5;
        int result = a - b;
        System.out.println(result);
    }
    // Static method(No return with Parameters)
    public static void division(int a, int b){
        int result = a / b;
        System.out.println(result);
    }
    // Static method(return with Parameters)
    public static int multiply(int a, int b){
        return a * b;
    }
    // instance method with return and parameters
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator obj1 = new Calculator();  // New Object create
        int addResult = obj1.add(1000,5000); // instance method called by Object
        System.out.println(addResult);

        Calculator obj2 = new Calculator();  // New Object create
        int addResult2 = obj2.add(50,50); // instance method called by Object
        System.out.println(addResult2);

        //System.out.println(multiply(10,5)); // instance method called without Object
        int multiplyResult = multiply(10,5);
        System.out.println(multiplyResult);

        subtraction();
        division(100,50);
        division(100,25);

    }
}

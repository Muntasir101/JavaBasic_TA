package mathDemo;

public class MathExample {
    public static void main(String[] args) {
        System.out.println(Math.max(10.10,20.20));
        System.out.println(Math.min(50,10));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.abs(-5.5));
        System.out.println(Math.random());
        int RandomAge = (int) (Math.random() * 101); // 0 to 100
        System.out.println(RandomAge);
    }
}

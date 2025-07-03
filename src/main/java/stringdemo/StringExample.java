package stringdemo;

public class StringExample {
    public static void main(String[] args) {
        String message = "Hello world";
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.indexOf("world"));

        String Username = "John";

        System.out.println(Username + " "+"Replied" + " "+message);

        System.out.println(message.contains("world"));

        String expected_success_message = "Login Successful";
        String actual_success_message = "Login successful";

        System.out.println(expected_success_message.equals(actual_success_message)); // false
        System.out.println(expected_success_message.equalsIgnoreCase(actual_success_message)); // true
    }
}

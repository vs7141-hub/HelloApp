public class Uc3 {

    public static void main(String[] args) {

        // Default name handling using ternary operator
        String name = (args.length > 0) ? args[0] : "World";

        // Display greeting message
        System.out.println("Hello, " + name + "!");
    }
}
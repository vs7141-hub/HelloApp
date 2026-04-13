public class Uc3 {
    
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }

        // Default name handling using ternary operator
        String name = (args.length > 0) ? args[0] : "World";

        // Display greeting message
        System.out.println("Hello, " + name + "!");
    }
}


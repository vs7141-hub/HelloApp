public class Uc4 {
    public static void main(String[] args) {

        // Default name handling using ternary operator
        String name = (args.length > 0) ? args[0] : "World";
        String name;

        // Check if names are provided
        if (args.length > 0) {

            // Build comma-separated list of names
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();

        } else {

            // Default value if no arguments provided
            name = "World";
        }

        // Display greeting message
        System.out.println("Hello, " + name + "!");
}

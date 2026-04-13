public class Uc7 {
    public static void main(String[] args) {

        String name;

        // Check if no arguments are provided
        if (args.length == 0) {

            name = "World";

        } else {

            // Build comma-separated list using enhanced for loop
            StringBuilder nameBuilder = new StringBuilder();

            for (String n : args) {
                nameBuilder.append(n).append(", ");
            }
        // Assign default greeting target
        String names = "World";

            // Remove trailing comma and space using substring()
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        // If command-line arguments exist, join them using comma delimiter
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        // Display greeting message
        System.out.println("Hello, " + name + "!");
        // Display greeting
        System.out.println("Hello, " + names + "!");
    }
}
}

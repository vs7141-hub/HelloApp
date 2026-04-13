public class Uc6 {
    StringBuilder nameBuilder = new StringBuilder();

            boolean first = true;

            for (String n : args) {

                if (!first) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(n);
                first = false;
                nameBuilder.append(n).append(", ");
            }

            name = nameBuilder.toString();
            // Remove trailing comma and space using substring()
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }
}

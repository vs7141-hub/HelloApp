public class Uc5{
String name;
        if (args.length > 0) {
        
        if (args.length == 0) {

            name = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
            boolean first = true;

                if (i < args.length - 1) {
            for (String n : args) {

                if (!first) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(n);
                first = false;
            }
            name = nameBuilder.toString();
        } else {
            name = "World";
        }
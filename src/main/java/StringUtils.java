import java.util.Scanner;

public class StringUtils {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Something: ");
        String input = scanner.nextLine();

        System.out.println("You Entered: \"" + input + "\"");

        if (StringUtils.isNumeric(input)) {
            System.out.println("\"" + input + "\" is a number");
        } else {
            System.out.println("\"" + input + "\" is not a number");
        }

        String flippedCase = StringUtils.swapCase(input);
        System.out.println("Flipped Case: " + flippedCase);

        String reversed = StringUtils.reverse(input);
        System.out.println("Reversed: " + reversed);
    }

    private static String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    private static String swapCase(String input) {
        StringBuilder swappedCase = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                swappedCase.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swappedCase.append(Character.toUpperCase(c));
            } else {
                swappedCase.append(c);
            }
        }
        return swappedCase.toString();
    }

    private static boolean isNumeric(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}



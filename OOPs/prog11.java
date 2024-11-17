import java.util.Arrays;

// StringArrayValidation 
public class prog11 {
    public static void main(String[] args) {
        String[] inputArray = {"100", "10.2", "5.hello", "100hello"};

        for (String str : inputArray) {
            try {
                double number = Double.parseDouble(str);
                System.out.println(str + " is a valid number.");
            } catch (NumberFormatException e) {
                System.out.println(str + " is not a valid number.");
            }
        }
    }
}
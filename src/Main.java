import java.util.Scanner;

/**
 * Created by Gavin on 3/20/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();
        System.out.println("Age: ");
        String age = scanner.nextLine();

        try {
            Double.parseDouble(age);
            if (validator.validateAge(age)){
                System.out.println("You May Enter");
            }

        }
        catch (NumberFormatException e){
            System.out.println("has to be a number");

        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}

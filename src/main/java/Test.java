import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Test {

    public static String compare(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String Input = s.nextLine();


        if(StringUtils.isNumeric(Input)){
            System.out.println("You entered a number...");
        } else {
            System.out.println("You entered a string!");
        }
        System.out.println("Flipped case " + StringUtils.swapCase(Input));

        System.out.println("Reversed: " + StringUtils.reverse(Input));
        return Input;
        }

    public static void main(String[] args) {
        compare();
    }
}

import java.util.Scanner;

public class VowelOrConstant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a letter: ");
        char a = input.next().charAt(0);


        if (a == 'a' || a == 'i' || a == 'u' || a == 'e' || a =='o') {

            System.out.println(a + " is a vowel.");
        } else if (Character.isLetter(a)) {
            System.out.println(a + " is a constant.");
        } else {
            System.out.println(a + " is invalid.");
        }
    }
}
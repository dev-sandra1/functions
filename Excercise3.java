import java.util.Scanner;

public class Excercise3{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("write a greeting: ");
        String greetUser = entry.nextLine();

        greet(greetUser);

    }
    public static void  greet(String word){
        System.out.println( word + "from the world of name");
    }
}
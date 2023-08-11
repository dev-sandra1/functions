import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int items; 

        System.out.println("choose the number of elements you want:");
        items = entry.nextInt();
        

        char[] letters = new char[items];
        System.out.println("choose the elements of the arrangement:");

        for(int i=0; i<items; i++){
            System.out.println(((i+1))+"type a character:");
            letters[i] = entry.next().charAt(0);

        }

    }
}

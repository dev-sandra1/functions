import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int totalMoney = 1000;

        //funcion saludar
        System.out.print("what greet do you want?: ");
        String greetUser = entry.nextLine();

        greet(greetUser);//mandamos a llamar a la funcion saludar (argumentos)

        //funcion reirar
        System.out.print("How much money do you want to retired withdraw: ");
        int withdrawNumber = entry.nextInt();

        int verify = withdraw(totalMoney, withdrawNumber);

        if(verify <= 0){
            System.err.println("The amout is invalited :" + verify);
        }else {
            System.out.println("Great your current amout is " + verify);
        }


    }


    public static int withdraw(int amoutTotal, int amountWithdraw) { //parametros

        int subtraction = amoutTotal - amountWithdraw;
        if(subtraction <= 0){
            return subtraction;
        }

        return subtraction;
    }

    public static void  greet(String saludo) {

         System.out.println(saludo + " desde la funcion greet");

    }
    
}


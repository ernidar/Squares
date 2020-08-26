import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {

        int userInput;
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number: ");

        //1. I want to store the user's input in the userInput variable
        userInput = keybd.nextInt();

        System.out.println("Number          Square");
        System.out.println("-------         --------");

        // for (index; conditions; increment/change){}
        for (int i = 1; i<=9; i++) {
            System.out.println(i + "                  " +(i*i));
        }

//        // for (index; conditions; increment/change){}
//        for (int i = 0; i<=9; i=i*i) {
//            System.out.println(i);
//        }

//        Enter a number:
//        9
//
//        Number     Square
//        -----------    ---------
//                1                     1
//        2                     4
//        3                     9
//        4                     16
//        5                     25
//        6                    36
//        7                    49
//        8                    64
//        9                    81
    }
}

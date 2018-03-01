import java.util.Scanner;
public class fizzbuzzMethods {
    public static void main(String[] args){
        Scanner sysIn = new Scanner(System.in);
        //int value = sysIn.nextInt();  //need for while loop
        for(int value = sysIn.nextInt(); value>1; value--) {


            fizz(value);
            buzz(value);
            System.out.println();

        }
       /*while(value>1) {               //Example using while loop


            fizz(value);
            buzz(value);
            System.out.println();

            value=value-1;
        }
        */
    }
    private static void fizz(int number){
        if(number % 2==0){
            System.out.print("fizz");

        }

    }
    private static void buzz(int number){
        if(number %3==0){

            System.out.print("buzz");

        }

    }
}

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Stack numbers = new Stack();

                                    // "5 3 + 7 *"
        Scanner sysIn = new Scanner("5 3 % ");

        while( sysIn.hasNextLine() ) {
            String input = sysIn.nextLine();

            Scanner process = new Scanner(input);

            while( process.hasNext() ) {
                String symbol = process.next();

                switch(symbol) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                    case "%":
                        calculate(symbol, numbers);
                        break;
                    default:
                        numbers.push( Float.valueOf(symbol) );
                }
            }
        }

        System.out.println(numbers.stackSize());

        System.out.println(numbers.pop());


    }

    public static void calculate(String op, Stack stack) {
        Float y = stack.pop();
        Float x = stack.pop();
        switch( op ) {
            case "+":
                stack.push(x + y);
                break;
            case "-":
                stack.push(x - y);
                break;
            case "*":
                stack.push(x * y);
                break;
            case "/":
                stack.push(x / y);
                break;
            case "%":
                stack.push(x % y);
        }

    }
}

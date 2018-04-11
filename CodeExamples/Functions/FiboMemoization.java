import java.util.Scanner;

public class FiboMemoization {

    //used to store the values we have calculated (memoization)
    private static int[] results;

    //recursive
    private static int fib(int number) {
        if( number == 1 || number == 0 )
            return 1;

        int part1, part2;

        part1 = fib(number - 1);
        part2 = fib(number -2);

        return part1 + part2;
    }

    //recursive with memoization.  Thus dynamic programing.
    private static int fib2(int number) {
        if( number == 1 || number == 0 )
            return 1;

        int part1, part2;

        if( results[number-1] == -1) {
            part1 = fib(number - 1);
            results[number-1] = part1;
        }
        else
            part1 = results[number-1];

        if( results[number-2] == -1) {
            part2 = fib(number - 2);
            results[number-2] = part2;
        }
        else
            part2 = results[number-2];

        return part1 + part2;
    }

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        int number = sysIn.nextInt();

        results = new int[number + 1];

        for( int i = 0; i<= number; i++ )
            results[i] = -1;

        System.out.println("The result is: " + fib2(number));

        System.out.println("The result is: " + fib(number));

    }
}

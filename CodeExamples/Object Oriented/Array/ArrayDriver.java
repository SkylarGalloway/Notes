import java.util.Scanner;

public class ArrayDriver {

    public static void main(String[] args) {

        IntArray list = new IntArray();

        Scanner SysIn = new Scanner(System.in);

        int value = SysIn.nextInt();

        while( value != 0 ) {
            list.add(value);
            value = SysIn.nextInt();
        }

        for(int i = 0; i < list.size; i = i + 1) {
            System.out.print(list.array[i] + " ");
        }
    }
}

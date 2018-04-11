public class IntArray {

    public int[] array;
    public int size;

    public IntArray() {
        size = 0;
        array = new int[size];
    }

    public void add(int value) {
        size = size + 1;
        int[] tempArray;
        tempArray = new int[size];

        for(int i=0; i< size - 1; i++) {
            tempArray[i] = array[i];
        }

        array = tempArray;
        array[size - 1] = value;
    }
}

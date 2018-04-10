public class Stack {

    private Float[] stack = new Float[5];
    private int size = 5;
    private int numberOfItems = 0;


    private void increaseStackSize() {
        Float[] newStack = new Float[size*2];
        size = size * 2;
        for( int i=0; i<numberOfItems; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public void push(Float number) {
        if( numberOfItems == size) {
            increaseStackSize();
        }

        stack[numberOfItems] = number;
        numberOfItems = numberOfItems + 1;
    }

    public Float pop() {
        if(numberOfItems == 0) {
            return null;
        }

        numberOfItems = numberOfItems - 1;
        return stack[numberOfItems];
    }

    public int stackSize() {
        return numberOfItems;
    }

}

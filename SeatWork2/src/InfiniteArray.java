public class InfiniteArray<T> {
    private Object[] defaultArray;
    private static final int DEFAULT_ARRAY_SIZE = 3;
    private static int arraySize;

    public InfiniteArray(int preferredSize) {
        defaultArray = new String[preferredSize];
    }

    public InfiniteArray() {
        this(DEFAULT_ARRAY_SIZE);
    }

    public void add(T element) {
        increaseArraySize();
        defaultArray[arraySize] = element;
        arraySize++;
    }

    public void increaseArraySize() {
        Object[] newArray = new Object[(int) (arraySize + 1 + (arraySize * .5))];

        for (int i = 0; i < arraySize; i++) {
            newArray[i] = defaultArray[i];
        }
        defaultArray = newArray;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < arraySize -1; i++) {
            stringBuilder.append(defaultArray[i]).append(", ");
        }
        stringBuilder.append(defaultArray[arraySize- 1]);  // Print the last element
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}

public class deslocamento {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10; array[1] = 20; array[2] = 30; array[3] = 40;
        int currentSize = 4;
        int targetIndex = 1;
        int newValue = 15;

        for (int i = currentSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }

        array[targetIndex] = newValue;
        currentSize++;

        for (int i = 0; i < currentSize; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

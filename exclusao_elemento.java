public class exclusao_elemento {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int currentSize = 5;
        int valueToRemove = 30;
        int foundIndex = -1;

        for (int i = 0; i < currentSize; i++) {
            if (array[i] == valueToRemove) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            for (int i = foundIndex; i < currentSize - 1; i++) {
                array[i] = array[i + 1];
            }
            currentSize--;
        }
    }
}

public class remove_duplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int currentSize = 7;

        for (int i = 0; i < currentSize; i++) {
            for (int j = i + 1; j < currentSize; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < currentSize - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    currentSize--;
                    j--;
                }
            }
        }
    }
}

public class redimensionamento_dinamico {
    public static void main(String[] args) {
        int[] array = new int[2];
        int currentSize = 0;
        for (int i = 1; i <= 3; i++) {
            if (currentSize == array.length) {
                int[] newArray = new int[array.length * 2];
                for (int j = 0; j < array.length; j++) {
                    newArray[j] = array[j];
                }
                array = newArray;
                System.out.println("Capacity doubled to: " + array.length);
            }
            array[currentSize++] = i * 10;
        }
    }
}

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
        // Let's sort using quick sort
        QuickSort.quickSort( array, 0, array.length - 1 );
        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }






}

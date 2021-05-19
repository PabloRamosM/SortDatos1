import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class SortTestTest {
    @Test
    void successBuubleSort(){
        int expected[]={5,6,11,12,13};
        int arr[] = { 12, 11, 13, 5, 6 };
        Assertions.assertArrayEquals(expected,BubbleSort.sortArray(arr));
    }
    @Test
    void successInsertionSort(){
        InsertionSort selectionList = new InsertionSort();
        int expected[]={5,6,11,12,13};
        int arr[] = { 12, 11, 13, 5, 6 };
        Assertions.assertArrayEquals(expected,selectionList.sort(arr));
    }
    @Test
    void successSelectionSort(){
        SelectionSort selectionSort=new SelectionSort();
        int expected[]={5,6,11,12,13};
        int arr[] = { 12, 11, 13, 5, 6 };
        Assertions.assertArrayEquals(expected,selectionSort.sort(arr));
    }
    @Test
    void FailTested(){
        int notexpected[]={7,6,11,12,13};
        int arr[] = { 12, 11, 13, 5, 6 };
        Assertions.assertNotEquals(notexpected,BubbleSort.sortArray(arr));
    }

}
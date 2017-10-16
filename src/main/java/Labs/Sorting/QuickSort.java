package Labs.Sorting;

public class QuickSort extends Sort {
    public QuickSort(){
        sortName = "Quick sort";
    }

    public void Sorting(int[] sortArray){
        QuickSort(sortArray, 0, sortArray.length - 1);
    }

    private void QuickSort(int[] sortArray, int begin, int end) {
        int left = begin, right = end;
        int pivot = sortArray[(left + right) / 2];
        while (left <= right) {
            while (sortArray[left] < pivot) left++;
            while (sortArray[right] > pivot) right--;
            if (left <= right) exchange(sortArray, left++, right--);
        }
        if (begin < right) QuickSort(sortArray, begin, right);
        if (end > left) QuickSort(sortArray, left, end);
    }
}

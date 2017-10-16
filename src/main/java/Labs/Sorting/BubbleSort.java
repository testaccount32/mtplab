package Labs.Sorting;

public class BubbleSort extends Sort {
    public BubbleSort(){
        sortName = "Bubble sort";
    }

    public void Sorting(int[] sortArray){
        int n = sortArray.length;
        while (n > 0) {
            n--;
            for (int i = 0; i < n; i++) {
                if (sortArray[i] > sortArray[i + 1]) exchange(sortArray, i, i + 1);
            }
        }
    }
}

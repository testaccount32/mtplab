package Labs.Sorting;

public class OddEvenSort extends Sort {
    public OddEvenSort(){
        sortName = "OddEven sort";
    }

    public void Sorting(int[] sortArray){
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = ((i % 2) == 0) ? 0 : 1; j < sortArray.length - 1; j += 2) {
                if (sortArray[j] > sortArray[j + 1]) {
                    exchange(sortArray, j, j + 1);
                }
            }
        }
    }
}

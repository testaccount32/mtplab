package Labs.Sorting;

public class CocktailSort extends Sort {
    public CocktailSort(){
        sortName = "Cocktail sort";
    }

    public void Sorting(int[] sortArray){
        int n = 0;
        while (n < ((sortArray.length + 1) / 2)) {
            for (int i = n; i < sortArray.length - (n + 1); i++) {
                if (sortArray[i] > sortArray[i + 1]) exchange(sortArray, i, i + 1);
            }
            for (int i = sortArray.length - (n + 1); i > n; i--) {
                if (sortArray[i] < sortArray[i - 1]) exchange(sortArray, i, i - 1);
            }
            n++;
        }
    }
}

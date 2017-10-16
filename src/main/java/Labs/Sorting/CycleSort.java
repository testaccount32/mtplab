package Labs.Sorting;

public class CycleSort extends Sort {
    public CycleSort(){
        sortName = "Cycle sort";
    }

    public void Sorting(int[] sortArray){
        for (int cycleStart = 0; cycleStart < sortArray.length - 1; cycleStart++) {
            int val = sortArray[cycleStart];
            int pos = cycleStart;
            for (int i = cycleStart + 1; i < sortArray.length; i++) if (sortArray[i] < val) pos++;
            if (pos == cycleStart) continue;
            while (val == sortArray[pos]) pos++;
            int tmp = sortArray[pos];
            sortArray[pos] = val;
            val = tmp;
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < sortArray.length; i++) if (sortArray[i] < val) pos++;
                while (val == sortArray[pos]) pos++;
                tmp = sortArray[pos];
                sortArray[pos] = val;
                val = tmp;
            }
        }
    }
}

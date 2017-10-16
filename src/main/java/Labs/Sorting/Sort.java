package Labs.Sorting;

import java.util.Random;

public abstract class Sort {
    static int originalArray[];
    int sortingArray[] = new int[150];
    String sortName;

    public abstract void Sorting(int[] sortArray);

    public boolean takeMetrics() {
        long start,end;
        try {
            for (byte i = 0; i < 3; i++) {
                System.arraycopy(originalArray, 0, sortingArray, 0, 150);
                start = System.nanoTime();
                Sorting(sortingArray);
                end = System.nanoTime();
                System.out.println("Sort: " + sortName + ";\t №: " + (i + 1) + ";\t time: " + (end - start));
            }
        }
        catch (Exception ex){
            System.out.println(ex);
            return false;
        }
        return true;
    }

    public static String sayHi(){
        return "Hello world!";
    }

    public static int[] createArray(){
        originalArray = new int[150];
        Random random = new Random();
        for (int i = 0; i < 150; i++) originalArray[i] = random.nextInt() % 100;
        return originalArray;
    }

    public boolean exchange(int[] array, int n1, int n2) {
        if(n1>=0 && n1 < array.length && n2 >= 0 && n2 < array.length) {
            int var = array[n1];
            array[n1] = array[n2];
            array[n2] = var;
            return true;
        }
        else return false;
    }
}

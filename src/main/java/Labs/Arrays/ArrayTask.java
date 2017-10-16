package Labs.Arrays;

import java.util.Random;

public class ArrayTask {
    int[] array;

    public ArrayTask(int n){
        array = new int[n];
        System.arraycopy(createArray(n),0,array,0, n);
    }

    public ArrayTask(int n[]) {
        array = new int[n.length];
        System.arraycopy(n,0,array,0,n.length);
    }

    public int[] createArray(int n){
        int[] ar = new int[n];
        Random rand = new Random();
        for (int i = 0; i < ar.length; i++)
            array[i] = rand.nextInt() % 10 + 1;
        return ar;
    }

    public double GeometricMean() {
        double Geom_mean = 1.0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                Geom_mean *= array[i];
                counter++;
            }
        }
        if (counter > 0)
            Geom_mean = Math.pow(Geom_mean, (1.0) / counter);
        else
            Geom_mean = 0;
        return Geom_mean;
    }

    public int MaxByModule() {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            if (Math.abs(array[i]) > Math.abs(max))
                max = array[i];
        return max;
    }

    public int MaxPair() {
        int max_pair = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > max_pair)
                max_pair = array[i];
        }
        if (max_pair == 1) return -1;
        else return max_pair;
    }

    public double ArithmeticMean() {
        double Arith_mean = 0.0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            Arith_mean += array[i];
            counter++;
        }
        Arith_mean = Arith_mean / counter;
        return Arith_mean;
    }
    public int MinByModule() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) < Math.abs(min)) min = array[i];
        }
        return min;
    }

    public int IntervalSum(){
        int inter_sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]>=0 & array[i]<=10) inter_sum += array[i];
        }
        return inter_sum;
    }
}

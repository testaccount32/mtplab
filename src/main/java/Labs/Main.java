package Labs;

import Labs.Arrays.*;
import Labs.Sorting.*;

public class Main {
    public static void main(String[] args){
        ArrayTask ar = new ArrayTask(10);
        System.out.println("Geom: " + ar.GeometricMean() + "; Arith: "+ar.ArithmeticMean() + "; " + "int sum: " + ar.IntervalSum() + "; max pair: " + ar.MaxPair() + "; max by module: " + ar.MaxByModule() + "; min by module: " + ar.MinByModule());
        MatrixTask mt = new MatrixTask(5);
        System.out.println("under: " + mt.diagonalSum()[0] + "; center: " + mt.diagonalSum()[1] + "; above: " + mt.diagonalSum()[2]);
        MatrixTask.showMatrix(mt.create());
        Sort.createArray();
        Sort sorts[] = new Sort[5];
        sorts[0]= new BubbleSort();
        sorts[1]= new CocktailSort();
        sorts[2]= new QuickSort();
        sorts[3]= new OddEvenSort();
        sorts[4]= new CycleSort();
        for(Sort item: sorts)
            item.takeMetrics();
    }
}

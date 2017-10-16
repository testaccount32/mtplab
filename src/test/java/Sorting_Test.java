import org.junit.*;
import Labs.Sorting.*;
import java.util.*;


public class Sorting_Test {
    private int[] originalArray, sortingArray, rightArray, specArray;

    @Before
    public void createArray(){
        originalArray = new int[150];
        sortingArray = new int[150];
        rightArray = new int[150];
        specArray = new int[5];
        Random rand = new Random();
        for (int i = 0; i < originalArray.length; i++)
            originalArray[i] = rand.nextInt()%100;
        System.arraycopy(originalArray,0, rightArray,0,150);
        Arrays.sort(rightArray);
    }

    public void copyArray(){
        System.arraycopy(originalArray,0, sortingArray,0,150);
    }

    @Test
    public void BubbleTest(){
        copyArray();
        Sort b = new BubbleSort();
        b.Sorting(sortingArray);
        Assert.assertArrayEquals(sortingArray,rightArray);
    }

    @Test
    public void CocktailTest(){
        copyArray();
        Sort b = new CocktailSort();
        b.Sorting(sortingArray);
        Assert.assertArrayEquals(sortingArray,rightArray);
    }

    @Test
    public void QuickTest(){
        copyArray();
        Sort b = new QuickSort();
        b.Sorting(sortingArray);
        Assert.assertArrayEquals(sortingArray,rightArray);
    }

    @Test
    public void OddEvenTest(){
        copyArray();
        Sort b = new OddEvenSort();
        b.Sorting(sortingArray);
        Assert.assertArrayEquals(sortingArray,rightArray);
    }

    @Test
    public void CycleTest(){
        copyArray();
        Sort b = new CycleSort();
        b.Sorting(sortingArray);
        Assert.assertArrayEquals(sortingArray,rightArray);
    }

    @Test
    public void CheckExch(){
        Sort b = new BubbleSort();
        Assert.assertTrue(b.exchange(specArray,1,3));
    }

    @Test
    public void CheckMetrics(){
        Sort b = new BubbleSort();
        Assert.assertEquals(false, b.takeMetrics());
    }

    @Test
    public void CheckArray(){
        Assert.assertNotNull(Sort.createArray());
    }

    @Test
    public void CheckWorld(){
        Assert.assertEquals("Hello world!", Sort.sayHi());
    }
}

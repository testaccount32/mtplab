import org.junit.*;
import Labs.Arrays.ArrayTask;

public class Array_Test {
    private int[] array = {-7,1,10,-7,2,8,1,6,-4,0};
    ArrayTask ar;
    double gm,am;
    int isum,mpair,minbm,maxbm;

    @Before
    public void initVar(){
        gm = 0.0;
        am = 1.0;
        isum = 28;
        mpair = 10;
        minbm = 0;
        maxbm = 10;
        ar = new ArrayTask(array);
    }

    @Test
    public void GeomTest(){
        Assert.assertTrue(gm == ar.GeometricMean());
    }

    @Test
    public void AriphTest(){
        Assert.assertTrue(am == ar.ArithmeticMean());
    }

    @Test
    public void IntervalSum(){
        Assert.assertTrue(isum == ar.IntervalSum());
    }

    @Test
    public void MaxPair(){
        Assert.assertTrue(mpair == ar.MaxPair());
    }

    @Test
    public void MaxByModule(){
        Assert.assertTrue(maxbm == ar.MaxByModule());
    }

    @Test
    public void MinByModule(){
        Assert.assertTrue(minbm == ar.MinByModule());
    }

    @Test
    public void checkArray() { Assert.assertNotNull(ar.createArray(3)); }
}

import org.junit.*;
import Labs.Arrays.MatrixTask;

public class Matrix_Test {
    MatrixTask mt;
    int[][] matrixT;
    int[][] baseMatrixT;
    int[][] rightMatrixT;
    int[] sum;

    @Before
    public void initVar(){
        matrixT = new int[][]{
                {-62,57,55,68,40},
                {-64,61,-57,43,62},
                {-75,-83,-64,35,32},
                {0,0,-16,49,66},
                {-39,-47,-65,-47,93}
        };
        baseMatrixT = new int[][]{
                {93,-75,-73,27,81,55,-40,-20,35,},
                {-69,50,82,-44,2,87,-70,81,-20,},
                {-36,-81,5,-13,-20,-56,-29,-73,58,},
                {-45,42,29,96,90,-63,-96,53,-67,},
                {9,36,68,-75,-36,62,98,-16,-72,},
                {59,-91,-78,28,-91,34,51,-91,-49,},
                {90,89,-40,-79,-21,64,-82,-57,-48,},
                {-25,41,25,62,-58,83,74,-27,13,},
                {-29,28,11,38,-25,93,-74,43,19,},
        };
        rightMatrixT = new int[][]{
                {0,0,0,0,0,0,0,0,0,},
                {0,0,82,0,0,87,0,81,0,},
                {0,0,0,0,0,0,0,0,58,},
                {0,0,0,0,0,0,0,0,0,},
                {9,36,68,0,0,62,98,-16,0,},
                {59,0,0,0,0,0,51,0,0,},
                {90,89,-40,-79,-21,64,0,-57,-48,},
                {-25,41,25,62,0,83,74,0,13,},
                {0,28,0,38,0,93,0,43,0,},
        };
        mt = new MatrixTask(matrixT, baseMatrixT);
        sum = new int[]{-436,77,401};
    }

    @Test
    public void SumTest(){
        Assert.assertArrayEquals(sum,mt.diagonalSum());
    }

    @Test
    public void MatrixTest(){
        Assert.assertArrayEquals(rightMatrixT,mt.create());
    }

    @Test
    public void fillTest(){
        Assert.assertNotNull(mt.fillMatrix());
    }
}

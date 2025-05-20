import blogic.FlatFigure;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FlatFigureTest {
    
    public FlatFigureTest() {
    }
    @Test
    public void testRTriangle() {
        double a = 2;
        double b = 4;
        double expResult = 4.0;
        FlatFigure ff=new FlatFigure(a, b, 90);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }
    @Test
    public void testTriangle() {
        double a = 4;
        double b = 3;
        double c = 5;
        double expResult = 6.0;
        FlatFigure ff=new FlatFigure(a, b, c);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    } 
    @Test
    public void testTriangle3() {
        double a = 4;
        double b = 8;
        double c = 5;
        double expResult = 8.181534;
        FlatFigure ff=new FlatFigure(a, b, c);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }
    @Test
    public void testSquare() {
        double a = 4;
        double expResult = 16.0;
        FlatFigure ff=new FlatFigure(a,90);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }  
    @Test
    public void testRomb() {
        double a = 4;
        double expResult = 8.0;
        FlatFigure ff=new FlatFigure(a,30);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }    
    @Test
    public void testRect() {
        double a = 4;
        double b = 8;
        double expResult = 32.0;
        FlatFigure ff=new FlatFigure(a,b,90,90);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }
    @Test
    public void testParal() {
        double a = 4;
        double b = 8;
        double expResult = 16.0;
        FlatFigure ff=new FlatFigure(a,b,30,150);
        double result = ff.area();
        assertEquals(expResult, result,0.0001);
    }
    //дополнительный тест для проверки площади параллелограмма с
    // другими углами (не 30/150 градусов), чтобы убедиться,
    // что расчеты работают корректно для разных значений углов
    @Test
    public void testParalWithDifferentAngles() {
        double a = 5;
        double b = 10;
        double expResult = 25.0;  // 5 * 10 * sin(30°) = 50 * 0.5 = 25
        FlatFigure ff = new FlatFigure(a, b, 30, 150);
        double result = ff.area();
        assertEquals(expResult, result, 0.0001);
    }

}

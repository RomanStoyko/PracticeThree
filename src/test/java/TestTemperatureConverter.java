import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestTemperatureConverter {
    @Parameterized.Parameter
    public double celsius;
    @Parameterized.Parameter(1)
    public double fahrenheit;
    @Parameterized.Parameter(2)
    public double kelvin;

    private TemperatureConverter temperatureConverter;

    @Before
    public void before(){
        temperatureConverter = new TemperatureConverter();
    }

   @Parameterized.Parameters()
   public static Collection<Object[]> getTestData(){
       return Arrays.asList(new Object[][]{
               {0,32,273.2},
               {10, 50, 283.2},
               {-10, 14,263.2},
               {100,212,373.2}
       });
   }

    @Test
    public void convertFtoC() throws Exception {
        double result = temperatureConverter.convertFtoC(fahrenheit);
        assertEquals(celsius, result,0.1);
    }

    @Test
    public void convertCtoF() throws Exception {
        double result = temperatureConverter.convertCtoF(celsius);
        assertEquals( fahrenheit, result,0.1);
    }

    @Test
    public void convertCtoK() throws Exception {
        double result = temperatureConverter.convertCtoK(celsius);
        assertEquals(kelvin, result,0.1);
    }

    @Test
    public void convertKtoC() throws Exception {
        double result = temperatureConverter.convertKtoC(kelvin);
        assertEquals( celsius, result,0.1);
    }

    @Test
    public void convertFtoK() throws Exception {
        double result = temperatureConverter.convertFtoK(fahrenheit);
        assertEquals(kelvin, result,0.1);
    }

    @Test
    public void convertKtoF() throws Exception {
      //  TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.convertKtoF(kelvin);
        assertEquals( fahrenheit, result,0.1);
    }

}
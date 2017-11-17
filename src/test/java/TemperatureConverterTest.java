import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {
    private TemperatureConverter temperatureConverter;
    @Before
    public void before(){
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void convertFtoC() throws Exception {
        assertEquals("10",-12.2222, temperatureConverter.convertFtoC(10), 0.0001);
        assertEquals("0",-17.7777, temperatureConverter.convertFtoC(0), 0.0001);
        assertEquals("-50",-45.5555, temperatureConverter.convertFtoC(-50), 0.0001);
        assertEquals("-5f",-20.5555,temperatureConverter.convertFtoC(-5), 0.0001);
    }

    @Test
    public void convertCtoF() throws Exception {
        assertEquals("10",50, temperatureConverter.convertCtoF(10), 0.0001);
        assertEquals("0",32, temperatureConverter.convertCtoF(0), 0.0001);
        assertEquals("-50",-58, temperatureConverter.convertCtoF(-50), 0.0001);
        assertEquals("-5f",23,temperatureConverter.convertCtoF(-5), 0.0001);
    }

    @Test
    public void convertCtoK() throws Exception {
        assertEquals("10",283.2, temperatureConverter.convertCtoK(10), 0.0001);
        assertEquals("0",273.2, temperatureConverter.convertCtoK(0), 0.0001);
        assertEquals("-50",223.2, temperatureConverter.convertCtoK(-50), 0.0001);
        assertEquals("-5f",268.2,temperatureConverter.convertCtoK(-5), 0.0001);
    }

    @Test
    public void convertKtoC() throws Exception {
        assertEquals("10",-263.2, temperatureConverter.convertKtoC(10), 0.0001);
        assertEquals("0",-273.2, temperatureConverter.convertKtoC(0), 0.0001);
        assertEquals("-50",-323.2, temperatureConverter.convertKtoC(-50), 0.0001);
        assertEquals("-5f",-278.2,temperatureConverter.convertKtoC(-5), 0.0001);
    }

    @Test
    public void convertFtoK() throws Exception {
        assertEquals("10", 260.9278, temperatureConverter.convertFtoK(10),0.1);
        assertEquals("0",255.3722, temperatureConverter.convertFtoK(0), 0.1);
        assertEquals("-50",227.5944, temperatureConverter.convertFtoK(-50), 0.1);
        assertEquals("-5f",252.5944,temperatureConverter.convertFtoK(-5), 0.1);
    }

    @Test
    public void convertKtoF() throws Exception {
        assertEquals("10",-441.67, temperatureConverter.convertKtoF(10), 0.1);
        assertEquals("0",-459.67, temperatureConverter.convertKtoF(0), 0.1);
        assertEquals("-50",-549.67, temperatureConverter.convertKtoF(-50), 0.1);
        assertEquals("-5f",-468.67,temperatureConverter.convertKtoF(-5), 0.1);
    }

}
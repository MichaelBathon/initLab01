package bathon.michael.initlab01;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 1/28/16.
 */
public class SpecInitializationLab1 {

    ColorfulThing testColor;

    @Before
    public void setUp(){testColor = new ColorfulThing("blue");}

    String colorExpected = "blue";

    @Test
    public void testGetColor(){
        assertEquals(colorExpected, testColor.getColor());
    }


}

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
    public void setUp(){testColor = new ColorfulThing(ColorfulThing.ColorEnum.BLUE);}

    ColorfulThing.ColorEnum testEnum = ColorfulThing.ColorEnum.BLUE;

    @Test
    public void testGetColor(){
        assertEquals(testEnum, testColor.getColor());
    }


}

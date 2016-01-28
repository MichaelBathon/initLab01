package bathon.michael.initlab01;

/**
 * Created by michaelbathon on 1/27/16.
 */
public class InitializationLab1 {

    public static void main(String[] args) {

        //Testing Enum

        ColorfulThing ctEnumRed = new ColorfulThing(ColorfulThing.ColorEnum.RED);
        ColorfulThing ctEnumBlue = new ColorfulThing(ColorfulThing.ColorEnum.BLUE);
        ColorfulThing ctEnumGreen = new ColorfulThing(ColorfulThing.ColorEnum.GREEN);

        /*Won't allow
        ColorfulThing yellow = new ColorfulThing(ColorfulThing.Color.YELLOW);
        ColorfulThing orange = new ColorfulThing(ColorfulThing.Color.ORANGE); */


        System.out.println(ctEnumRed.getColor());
        System.out.println(ctEnumBlue.getColor());
        System.out.println(ctEnumGreen.getColor());


    }
}

class ColorfulThing{


    private ColorEnum colorEnum;

    ColorfulThing(ColorEnum colorEnum){
        this.colorEnum = colorEnum;
    }

    public enum ColorEnum {RED, BLUE, GREEN}

    public ColorEnum getColor(){
        return this.colorEnum;
    }

}

class BoringThing{


}


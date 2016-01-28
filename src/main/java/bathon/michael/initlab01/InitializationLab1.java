package bathon.michael.initlab01;

/**
 * Created by michaelbathon on 1/27/16.
 */
public class InitializationLab1 {

    public static void main(String[] args) {

     ColorfulThing ctRed = new ColorfulThing("red");
        ColorfulThing ctBlue = new ColorfulThing("blue");
        ColorfulThing ctGreen = new ColorfulThing("green");
        ColorfulThing ctYellow = new ColorfulThing("yellow");
        ColorfulThing ctOrange = new ColorfulThing("orange");
       // ColorfulThing purple = new ColorfulThing(); test no arg constructor causes error

        BoringThing boring1 = new BoringThing();
        BoringThing boring2 = new BoringThing();
        BoringThing boring3 = new BoringThing();
        BoringThing boring4 = new BoringThing();
        BoringThing boring5 = new BoringThing();

        System.out.println(ctRed.getColor());
        System.out.println(ctBlue.getColor());
        System.out.println(ctGreen.getColor());
        System.out.println(ctYellow.getColor());
        System.out.println(ctOrange.getColor());


    }
}

class ColorfulThing{

    private String color; //variable for first constructor

    ColorfulThing(String color) {
        this.color = color;
    } //Constructor for part 1 of Lab

   public String getColor(){
        return this.color;
    } //Getter method for part 1 of Lab

}

class BoringThing{


}


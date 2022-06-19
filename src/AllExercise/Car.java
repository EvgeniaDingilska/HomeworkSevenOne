package AllExercise;

public class Car {
    String name;
    String color;
    int releaseYear;
    int horsePower;
    boolean secondHand;

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand)
    {
        this.name = name;
        this.color= color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car(String name, String color, boolean secondHand)
    {
        this(name,color,-1, -1, secondHand);
    }

    public Car(String name, String color, int releaseYear, int horsePower)
    {
        this(name, color, releaseYear,horsePower,false);
    }

    public Car(String name, int releaseYear, int horsePower)
    {
        this(name,"N/A", releaseYear, horsePower, false);
    }
    //default empty constructor
    public Car(){};
}

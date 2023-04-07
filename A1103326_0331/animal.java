public class animal
{
    private String name;
    private double height;
    private double weight;
    private double speed;

    public animal(String name, double height, double weight, double speed)
    {
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }

    public void show()
    {
        System.out.println("Name : "+ name );
        System.out.println("Height : "+ height +" meter");
        System.out.println("Weight : "+ weight +" kilograms");
        System.out.println("Speed : "+ speed +" meters per minutes");
    }

    public double distance(int time, double accelerate)
    {
        double distance=time*accelerate*speed;
        return distance;
    }
    public double distance(int time)
    {
        double distance=time*speed;
        return distance;
    }

    public static void showInfo()
    {
        System.out.println("welcome to FROZEN system!!");
    }
}
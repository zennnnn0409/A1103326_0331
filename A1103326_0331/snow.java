public class snow extends human
{
    private String skill;

    public snow(String name, double height, double weight, double speed, String gender, String skill)
    {
        super(name, height, weight, speed, gender);
        this.skill=skill;
    }

    public void show()
    {
        super.show();
        System.out.println("Skill : "+ skill);
    }

    public double distance(int time, double accelerate)
    {
        super.distance(time, accelerate);
        return super.distance(time, accelerate)*2;
    }
    public double distance(int time)
    {
        super.distance(time);
        return super.distance(time)*2;
    }
}
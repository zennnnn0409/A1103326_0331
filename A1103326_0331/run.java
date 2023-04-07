import java.util.Scanner;

public class run
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        animal.showInfo();
        System.out.println();
        animal snowbal=new animal("snowbal", 1.1, 52, 100);
        animal donkey=new animal("donkey", 1.5, 99, 120);
        human arc=new human("arc", 1.9, 80, 150, "male");
        human hans=new human("hans", 1.8, 78, 130, "male");
        human anna=new human("anna", 1.7, 48, 120, "female");
        snow alsa=new snow("alsa", 1.7, 50, 120, "female", "frozen");

        snowbal.show();
        System.out.println();
        donkey.show();
        System.out.println();
        arc.show();
        System.out.println();
        hans.show();
        System.out.println();
        anna.show();
        System.out.println();
        alsa.show();
        System.out.println();

        System.out.println("enter snowbal's time(min) : ");
        int snowbalT=input.nextInt();
        System.out.println("enter snowbal's accelerate(m/s^2) : ");
        double snowbalA=input.nextDouble();
        double snowbalDis=snowbal.distance(snowbalT,snowbalA);
        System.out.printf("%.5f \n",snowbalDis);

        System.out.println("enter donkey's time(min) : ");
        int donkeyT=input.nextInt();
        System.out.println("enter donkey's accelerate(m/s^2) : ");
        double donkeyA=input.nextDouble();
        double donkeyDis=donkey.distance(donkeyT,donkeyA);
        System.out.printf("%.5f \n",donkeyDis);

        System.out.println("enter arc's time(min) : ");
        int arcT=input.nextInt();
        System.out.println("enter arcT's accelerate(m/s^2) : ");
        double arcA=input.nextDouble();
        double arcDis=snowbal.distance(arcT,arcA);
        System.out.printf("%.5f \n",arcDis);

        System.out.println("enter hans's time(min) : ");
        int hansT=input.nextInt();
        System.out.println("enter hans's accelerate(m/s^2) : ");
        double hansA=input.nextDouble();
        double hansDis=hans.distance(hansT,hansA);
        System.out.printf("%.5f \n",hansDis);

        System.out.println("enter anna's time(min) : ");
        int annaT=input.nextInt();
        System.out.println("enter anna's accelerate(m/s^2) : ");
        double annaA=input.nextDouble();
        double annaDis=anna.distance(annaT,annaA);
        System.out.printf("%.5f \n",annaDis);

        System.out.println("enter alsa's time(min) : ");
        int alsaT=input.nextInt();
        System.out.println("enter alsa's accelerate(m/s^2) : ");
        double alsaA=input.nextDouble();
        double alsaDis=alsa.distance(alsaT,alsaA);
        System.out.printf("%.5f \n",alsaDis);

        input.close();
    }
}
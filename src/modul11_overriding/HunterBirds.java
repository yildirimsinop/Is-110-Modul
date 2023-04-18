package modul11_overriding;

public class HunterBirds extends Birds {
    public void bevege () {
        System.out.println("Rovfugler beveger seg ved å fly");
    }

    public void nebb () {

        System.out.println("Rovfugler har nebb");
    }

    String live = "Rovfugler lever i 20 år";


    public static void main(String[] args) {

        Birds fugl = new HunterBirds();

        System.out.println(fugl.live); // "De lever";
        fugl.nebb(); // ("Rovfugler har nebb");
        fugl.puste(); // ("fugler puster med lungene");
        fugl.bevege(); // Rovfugler beveger seg ved å fly
    }


}

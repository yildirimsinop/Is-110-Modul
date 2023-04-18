package modul12_Abstrakt;

public class Child extends ParentAbstrakt {
    @Override
    public void mel() {
        System.out.println("Alle bakene må bruke mel");
    }

    @Override
    public void salt() {
        System.out.println("Alle bakene må bruke salt");
    }

    @Override
    public void gjaar() {
        System.out.println("Alle bakene må bruke gjaar");
    }

    public void vekt () {

        System.out.println("Alle bakene må bruke vekt");

    }
}

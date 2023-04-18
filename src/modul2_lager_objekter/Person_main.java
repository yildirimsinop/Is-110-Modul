package modul2_lager_objekter;

public class Person_main {
    public static void main(String[] args) {
        /*
        I main-metoden oppretter vi to nye objekter av Person-klassen ved å
        bruke new-operatoren og kaller deretter displayPersonInfo()-metoden
        for å vise informasjonen om hver person.
         */

        Person person1 = new Person("Hasan", 50);
        Person person2 = new Person("Mehmet", 25);

        // Vis personinformasjon for person1 og person2
        person1.displayPersonInfo();
        person2.displayPersonInfo();
    }
}

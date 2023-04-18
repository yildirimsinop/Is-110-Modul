package modul2_kallerMetoder_andreObjekter;

public class Person_main {
    public static void main(String[] args) {
        /*
           I Main-klassen oppretter vi to Person-objekter og et Greeting-objekt.
           Vi kaller greet()-metoden på Greeting-objektet og gir Person-objektene som argumenter.
           Inne i greet()-metoden kaller vi getName()-metoden på Person-objektet for å få navnet.
           Dette er et eksempel på hvordan du kan kalle metoder i både samme og andre objekter.
         */

        Person person1 = new Person("Ola");
        Person person2 = new Person("Kari");

        // Opprett et Greeting-objekt
        Greeting greeting = new Greeting("Hei");

        // Kall greet()-metoden på Greeting-objektet, som igjen kaller getName()-metoden på Person-objektet
        greeting.greet(person1); // Output: Hei, Ola!
        greeting.greet(person2); // Output: Hei, Kari!
       

        // Endre hilsen og navn ved hjelp av setter-metodene
        greeting.setGreeting("Hallo");
        person1.setName("Ola Nordmann");

        // Kall greet()-metoden igjen med de nye verdiene
        greeting.greet(person1); // Output: Hallo, Ola Nordmann!
    }
}

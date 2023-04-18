package modul2_kallerMetoder_andreObjekter;

public class Greeting {

    /*
       Greeting-klassen har en metode kalt greet() som tar et Person-objekt
       som argument og skriver ut en hilsen etterfulgt av personens navn.

     */
    private String greeting;

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void greet(Person person) {
        System.out.println(greeting + ", " + person.getName() + "!");
    }
}

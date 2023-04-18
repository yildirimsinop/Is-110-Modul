package modul2_kallerMetoder_andreObjekter;

public class Person {

    // Jeg vil lage to klasser, Person og Greeting,
    // og vise hvordan vi kan kalle metoder i både samme og andre objekter.

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

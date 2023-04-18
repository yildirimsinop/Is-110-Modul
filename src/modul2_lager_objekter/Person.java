package modul2_lager_objekter;

public class Person {

    /*
      Her har vi definert en enkel Person-klasse med to private variabler (name og age),
      en konstruktør, getter og setter-metoder og en metode kalt displayPersonInfo().
     */
    private String name;
    private int age;

    // Konstruktør
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter og setter-metoder
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    // En metode for å vise personinformasjon
    public void displayPersonInfo() {
        System.out.println("Navn: " + name + ", Alder: " + age);
    }
}
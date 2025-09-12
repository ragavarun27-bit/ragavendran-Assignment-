package ragavendran;
import java.util.Arrays;
import java.util.Comparator;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Person[] people = new Person[] {
            new Person("Ram", 30),
            new Person("Arun", 25),
            new Person("Bhupesh", 35)
        };

        Comparator<Person> ageComparator = new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        Arrays.sort(people, ageComparator);

        System.out.println("Sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

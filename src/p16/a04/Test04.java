package p16.a04;

class Person {

    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

@FunctionalInterface
interface PersonFactory {

    Person create(String firstName, String lastName);
}

public class Test04 {

    public static void main(String[] args) {
        //1
        PersonFactory a = new PersonFactory() {
            @Override
            public Person create(String firstName, String lastName) {
                return new Person(firstName, lastName);
            }
        };

        Person p1 = a.create("賴", "玉珊");
        System.out.println(p1);
        //2.
        PersonFactory b = (firstName, lastName) -> new Person(firstName, lastName);
        Person p2 = b.create("賴", "玉珊");
        System.out.println(p2);
        //3.
         PersonFactory c = Person::new ;
            Person p3 = c.create("賴", "玉珊");
        System.out.println(p3);
    }

}

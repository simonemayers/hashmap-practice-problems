import java.util.HashMap;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        HashMap<String, Person> personMap = new HashMap<>();

        Person casper = new Person("Casper", 55);
        Person mike = new Person("Mike", 4);
        Person matt = new Person("Matt", 12);

        personMap.put(casper.getName(), casper);
        personMap.put(mike.getName(), mike);
        personMap.put(matt.getName(), matt);

        if( personMap.get("Mike").getAge() == 4){
            System.out.println("Correct");
        }
    }
}


package in.kgcoding.equals;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private String id;

    public Person(int age, String name, String id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

//    @Override
//    public boolean equals(Object obj) {  // Our Written Equals Method
//        if (!(obj instanceof Person)) {
//            return false;
//        } else {
//            Person per = (Person) obj;
//            return per.name.equals(this.name) &&
//                    per.age == this.age &&
//                    per.id.equals(this.id);
//        }
//    }

    // If two object are same according to equals then hashcode must be same.
    // However, if two object with same hashcode, does not guarantee they are equals
    // Because sometime un equal objects according to equals can also have the same hashcode.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, id);
    }
}

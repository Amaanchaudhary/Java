package in.kgcoding.equals;

public class EqualsAndHashcodeTest {
    public static void main(String[] args) {
        Person p1 = new Person(12, "Raju", "001");
        Person p2 = new Person(12, "Raju", "001");

//        if(p1 == p2){  // Reference Compare so both point to diff false
//            System.out.println("Equals");
//        }else{
//            System.out.println("Not Equals");
//        }

//        if (p1.equals(p2)) { // Still False because default equals method also compare ref, so define own equals method.
//            System.out.println("Equals");
//        } else {
//            System.out.println("Not Equals");
//        }

        if (p1.equals(p2)) {  // Now after overriding equals method, this will call our method.
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}

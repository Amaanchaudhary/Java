public class StringTest {

    int first = 1;
    String name = "Amaan";
    int age = 23;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("First");
        sb.append("45");
        sb.append(", now this is the ");
        StringTest myStr = new StringTest();
        System.out.println(myStr);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StringTest{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", first=").append(first);
        sb.append('}');
        return sb.toString();
    }
}

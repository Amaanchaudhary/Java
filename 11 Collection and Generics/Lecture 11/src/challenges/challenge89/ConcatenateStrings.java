package challenges.challenge89;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateStrings {
    public static void main(String[] args) {
        ConcatenateStrings cs = new ConcatenateStrings();
        System.out.println(cs.concatString("amaan", "chaudhary"));
    }

    public String concatString(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}

package passby;

import java.awt.*;

public class TestPassByRef {

    public static void main(String[] args) {
        Point first = new Point(4, 8);
        System.out.println("First: " + first);
        move(first);
        System.out.println("First: " + first);
    }

    public static void move(Point p) {
        p.x += 1;
        p.y += 1;
        System.out.println(p);
    }

    public static class point {
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}

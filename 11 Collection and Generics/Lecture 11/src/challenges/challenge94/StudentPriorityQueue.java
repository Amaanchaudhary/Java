package challenges.challenge94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    static void main() {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        queue.offer(new Student("Rushaan", 'C'));
        queue.offer(new Student("Amaan", 'A'));
        queue.offer(new Student("MAAZ", 'B'));
        queue.offer(new Student("Rocky", 'A'));

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    public static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade){
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " : " + grade;
        }
    }
}

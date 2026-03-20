class Course {
    static int maxCapacity;
    String courseName;
    int enrollments;
    String[] enrollmentStudents;

    static {
        maxCapacity = 50;
    }

    {
        enrollments = 0;
        enrollmentStudents = new String[maxCapacity];
    }

    Course(String courseName) {
        this.courseName = courseName;
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        if (enrollments >= maxCapacity) {
            System.out.println("Sorry " + studentName + " seat is full for the Course " + this.courseName);
        } else {
            enrollmentStudents[enrollments] = studentName;
            enrollments++;
            System.out.println(studentName + " Happy Enrollment, Welcome to  " + this.courseName);
        }
    }

    void unEnroll(String studentName) {
        int index = searchStudent(studentName);
        if (index == -1) {
            System.out.println("Sorry no Student name " + studentName + " is Enrolled");
        } else {
            enrollmentStudents[index] = "";
            enrollments--;
            System.out.println(studentName + ", You have been Un Enrolled from the course " + courseName);
        }
    }

    int searchStudent(String studentName){
        int i = 0;
        while(i < enrollments){
            if(enrollmentStudents[i].equals(studentName)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Course reactCourse = new Course("React");
        Course javaCourse = new Course("JAVA");
        Course.maxCapacity = 2;
        Course jsCourse = new Course("JS");
        reactCourse.enrollStudent("Abdul");
        javaCourse.enrollStudent("Amaan");
        javaCourse.enrollStudent("Ganesh");
        javaCourse.enrollStudent("Abhishek");
        javaCourse.unEnroll("Amaan");
        javaCourse.enrollStudent("Abhishek");
        Course.maxCapacity = 1;
        Course awsCourse = new Course("AWS");
        reactCourse.enrollStudent("Shubham");
        reactCourse.unEnroll("Abhi");
        System.out.println("react " + reactCourse.enrollmentStudents.length);
        System.out.println("JS " + jsCourse.enrollmentStudents.length);
        System.out.println("AWS " + awsCourse.enrollmentStudents.length);

    }

}


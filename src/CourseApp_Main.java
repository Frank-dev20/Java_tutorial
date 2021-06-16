public class CourseApp_Main {
    public static void main(String[] args) {
        CourseApp course1 = new CourseApp("Physics");
        CourseApp course2 = new CourseApp("Biology");

        course1.addStudent("Frank");
        course1.addStudent("Edward");
        course1.dropStudent("Edward");

        course2.addStudent("Maxwell");
        course2.addStudent("Gamaliel");
        course2.dropStudent("Gamaliel");

        System.out.println(course1.getNumberOfStudents());
        String[] students=course1.getStudents();


        for(int i=0; i<course1.getNumberOfStudents();i++) {
            System.out.println(students[i] + " ");
            System.out.println();
        }

        System.out.println(course2.getNumberOfStudents());
        students = course2.getStudents();


        for(int i =0; i< course2.getNumberOfStudents();i++)
            System.out.println(students[i]+ " ");


        System.out.println("The course is "+ course2.getCourseName());
    }
}

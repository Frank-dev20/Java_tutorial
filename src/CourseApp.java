public class CourseApp {
    private String courseName;
    private String[] students = new String[5];
    private int numberOfStudents;
    int i = 0;
    int j = i + 1;

    public CourseApp(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;

    }

    public void dropStudent(String student){


        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i] == student) {
                    String container = "";
                    container = students[i];
                    students[i] = students[j];
                    students[j] = container;
                    numberOfStudents--;
            }
        }



//            if (students[i] == student){
//                students[1]=null;
//                //Integer.parseInt(students[i--]);
//            }

        //students[Integer.parseInt(student)] = null;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }


}

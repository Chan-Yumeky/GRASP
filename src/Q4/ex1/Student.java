package Q4.ex1;

class Student {
    private String studentName;
    private AttendClass course;

    public Student(String studentName, AttendClass course) {
        this.studentName = studentName;
        this.course = course;
    }

    public void attendCourse() {
        System.out.print(studentName + " is ");
        course.takeClass();
    }
}

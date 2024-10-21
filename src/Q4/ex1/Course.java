package Q4.ex1;

class Course implements AttendClass {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void takeClass() {
        System.out.println("Attending " + courseName + " class...");
    }
}

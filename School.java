class School {
    String schoolName;
    String location;
    int numberOfStudents;
    int numberOfTeachers;
    String principalName;
    boolean hasPlayground;
    boolean hasLibrary;
    double fee;
    int establishedYear;
    String schoolType;

    static String country = "India";
    static String type = "Education";

    public String admitStudent(String name) {
        System.out.println("Student Admitted: " + name);
        return name;
    }

    public String removeStudent(String name) {
        System.out.println("Student Removed: " + name);
        return name;
    }

    public String assignTeacher(String name) {
        System.out.println("Teacher Assigned: " + name);
        return name;
    }

    public double collectFee(double amount) {
        System.out.println("Fee Collected: " + amount);
        return amount;
    }

    public boolean startClass(boolean status) {
        System.out.println("Class Started: " + status);
        return status;
    }

    public boolean endClass(boolean status) {
        System.out.println("Class Ended: " + status);
        return status;
    }

    public int countStudents(int total) {
        System.out.println("Total Students: " + total);
        return total;
    }

    public boolean conductExam(boolean status) {
        System.out.println("Exam Conducted: " + status);
        return status;
    }

    public String assignClassroom(String room) {
        System.out.println("Classroom Assigned: " + room);
        return room;
    }

    public boolean maintainDiscipline(boolean status) {
        System.out.println("Discipline Maintained: " + status);
        return status;
    }
}
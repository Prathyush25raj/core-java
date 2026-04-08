class MusicAcademy {

    String name;
    String location;
    int numberOfStudents;
    int numberOfTeachers;
    String directorName;
    boolean hasInstruments;
    boolean hasRecordingStudio;
    double fee;
    int establishedYear;
    String academyType;

    static String country = "India";
    static String type = "Education";

    public String enrollStudent(String name) { System.out.println("Enrolled: " + name); return name; }
    public String removeStudent(String name) { System.out.println("Removed: " + name); return name; }
    public String assignTeacher(String teacher) { System.out.println("Teacher: " + teacher); return teacher; }
    public double collectFee(double amount) { System.out.println("Fee: " + amount); return amount; }
    public boolean startClass(boolean status) { System.out.println("Class Started: " + status); return status; }
    public boolean endClass(boolean status) { System.out.println("Class Ended: " + status); return status; }
    public int countStudents(int total) { System.out.println("Students: " + total); return total; }
    public boolean conductConcert(boolean status) { System.out.println("Concert: " + status); return status; }
    public String assignRoom(String room) { System.out.println("Room: " + room); return room; }
    public boolean maintainDiscipline(boolean status) { System.out.println("Discipline: " + status); return status; }
}
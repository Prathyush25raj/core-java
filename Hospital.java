class Hospital {
    String hospitalName;
    String location;
    int numberOfDoctors;
    int numberOfBeds;
    String managerName;
    boolean hasICU;
    boolean hasAmbulance;
    double consultationFee;
    int establishedYear;
    String hospitalType;

    static String country = "India";
    static String type = "Healthcare";

    public String admitPatient(String name) {
        System.out.println("Patient Admitted: " + name);
        return name;
    }

    public String dischargePatient(String name) {
        System.out.println("Patient Discharged: " + name);
        return name;
    }

    public String assignDoctor(String doctor) {
        System.out.println("Doctor Assigned: " + doctor);
        return doctor;
    }

    public double generateBill(double amount) {
        System.out.println("Bill Generated: " + amount);
        return amount;
    }

    public boolean startTreatment(boolean status) {
        System.out.println("Treatment Started: " + status);
        return status;
    }

    public boolean stopTreatment(boolean status) {
        System.out.println("Treatment Stopped: " + status);
        return status;
    }

    public int countPatients(int total) {
        System.out.println("Total Patients: " + total);
        return total;
    }

    public boolean provideMedicine(boolean status) {
        System.out.println("Medicine Provided: " + status);
        return status;
    }

    public String assignRoom(String room) {
        System.out.println("Room Assigned: " + room);
        return room;
    }

    public boolean maintainHygiene(boolean status) {
        System.out.println("Hygiene Maintained: " + status);
        return status;
    }
}
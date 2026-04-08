class SportsClub {

    String name;
    String location;
    int numberOfPlayers;
    int numberOfCoaches;
    String managerName;
    boolean hasGym;
    boolean hasGround;
    double membershipFee;
    int establishedYear;
    String clubType;

    static String country = "India";
    static String type = "Sports";

    public String enrollPlayer(String player) {
        System.out.println("Player Enrolled: " + player);
        return player;
    }

    public String removePlayer(String player) {
        System.out.println("Player Removed: " + player);
        return player;
    }

    public String assignCoach(String coach) {
        System.out.println("Coach Assigned: " + coach);
        return coach;
    }

    public double collectFee(double amount) {
        System.out.println("Fee: " + amount);
        return amount;
    }

    public boolean startMatch(boolean status) {
        System.out.println("Match Started: " + status);
        return status;
    }

    public boolean endMatch(boolean status) {
        System.out.println("Match Ended: " + status);
        return status;
    }

    public int countPlayers(int total) {
        System.out.println("Players: " + total);
        return total;
    }

    public boolean conductTraining(boolean status) {
        System.out.println("Training: " + status);
        return status;
    }

    public String assignTeam(String team) {
        System.out.println("Team Assigned: " + team);
        return team;
    }

    public boolean maintainGround(boolean status) {
        System.out.println("Ground Maintained: " + status);
        return status;
    }
}
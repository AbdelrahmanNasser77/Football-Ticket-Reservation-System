public class Groups {
    public int numOfTeams;
    public String name;
    private Teams[] teams;
    public String[] teamName;

    public Groups(int numOfTeams, String name) {
        this.numOfTeams = numOfTeams;
        this.name = name;
        teamName = new String[numOfTeams];
    }
    public void setTeams(Teams[] teams) {
        this.teams = teams;
    }

    public String[] getTeamName() {

        for (int i = 0; i < teams.length; i++) {
            teamName[i] = teams[i].getTeamName();
        }
        return this.teamName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-12s", name ));

        for (int i = 0; i < teams.length; i++) {
            sb.append(String.format("%-30s", "[" + (i + 1) + "] " + teams[i]));
        }
        return sb.toString();
    }



}
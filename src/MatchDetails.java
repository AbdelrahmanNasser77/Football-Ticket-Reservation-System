public class MatchDetails {
    private Groups groups;
    private int chooseGroup;
    private String groupName;
    private Stadium stadium;
    private Date date;
    private Time time;
    private int chooseTeam1;
    private int chooseTeam2;
    private String team1;
    private String team2;


    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public void setChooseGroup(int chooseGroup) {
        this.chooseGroup = chooseGroup;
    }

    public int getChooseGroup() {
        return chooseGroup;
    }

    public String getGroupName() {

        groupName = "Group ";

        char letter = 'A';
        letter += getChooseGroup() - 1;

        groupName += letter;

        return groupName;
    }

    public void setChooseTeam1(int chooseTeam1) {
        this.chooseTeam1 = chooseTeam1;
    }

    public int getChooseTeam1() {
        return chooseTeam1;
    }

    public String getTeam1() {

        team1 = groups.teamName[getChooseTeam1() - 1];
        return team1;
    }

    public void setChooseTeam2(int chooseTeam2) {
        this.chooseTeam2 = chooseTeam2;
    }

    public int getChooseTeam2() {

        return chooseTeam2;
    }

    public String getTeam2() {

        team2 = groups.teamName[getChooseTeam2() - 1];
        return team2;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return

                Design.centerText + Design.yellowText + getGroupName() + Design.resetColorText + "\t" + Design.cyanText  + getTeam1() + Design.resetColorText +  " vs. " + Design.purpleText  + getTeam2() + Design.resetColorText
                + "\n" +
                "\t\t\t" + date + "\t" + time + "\t" + "|" + "\t" +
                stadium
                + "\n"
                ;
    }
}

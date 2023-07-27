// To static competition system
public class ChampionshipSystem {
    private int chooseRegion;
    private String regionChampionship;
    private int chooseTeamType;
    private  int numOfGroups;
    private  int numOfTeams;
    private int year;

    private String teamType;

    public void setChooseRegion(int chooseRegion) {
        this.chooseRegion = chooseRegion;
    }

    public int getChooseRegion() {
        return chooseRegion;
    }

    public String getRegionChampionship() {
        switch (getChooseTeamType())
        {
            case 1:
                switch (getChooseRegion())
                {
                    case 1:
                        regionChampionship = "FIFA World Cup";
                        break;
                    case 2:
                        regionChampionship = "UEFA European Cup";
                        break;
                    case 3:
                        regionChampionship = "AFC Asian Cup";
                        break;
                    case 4:
                        regionChampionship = "CAF African Cup of Nations";
                        break;
                    case 5:
                        regionChampionship = "CONMEBOL Cup";
                        break;
                    case 6:
                        regionChampionship = "CONCACAF Gold Cup";
                        break;
                }
                break;
            case 2:
                switch (getChooseRegion())
                {
                    case 1:
                        regionChampionship = "FIFA Club World Cup";
                        break;
                    case 2:
                        regionChampionship = "UEFA Champions League";
                        break;
                    case 3:
                        regionChampionship = "AFC Champions League";
                        break;
                    case 4:
                        regionChampionship = "CAF Champions League";
                        break;
                    case 5:
                        regionChampionship = "CONMEBOL Copa Libertadores";
                        break;
                    case 6:
                        regionChampionship = "CONCACAF Champions League";
                        break;
                }

                break;
        }
        return regionChampionship;
    }

    public void setChooseTeamType(int chooseTeamType) {
        this.chooseTeamType = chooseTeamType;
    }

    public int getChooseTeamType() {
        return chooseTeamType;
    }

    public String getTeamType() {
        switch (getChooseTeamType())
        {
            case 1:
                teamType = "National Teams";
                break;
            case 2:
                teamType = "Clubs";
                break;
        }
        return teamType;
    }

    public void setNumOfGroups(int numOfGroups) {
        this.numOfGroups = numOfGroups;
    }

    public int getNumOfGroups() {
        return numOfGroups;
    }

    public void setNumOfTeams(int numOfTeams) {
        this.numOfTeams = numOfTeams;
    }

    public int getNumOfTeams() {
        return numOfTeams;
    }

    public int getTeamsPerGroup() {
        return getNumOfTeams() / getNumOfGroups();
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

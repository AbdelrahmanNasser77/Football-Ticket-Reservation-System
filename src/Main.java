import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ChampionshipSystem championshipSystem = new ChampionshipSystem();
        HostCountry hostCountry = new HostCountry();

        System.out.println(Design.centerText + Design.boldText + "Setting region of Championship" + Design.resetColorText);

        System.out.println("[1] " + "World");
        System.out.println("[2] " + "Europe");
        System.out.println("[3] " + "Asia");
        System.out.println("[4] " + "Africa");
        System.out.println("[5] " + "South America");
        System.out.println("[6] " + "North America");
        System.out.print("\t\t" + "Enter " + Design.boldText + "NUMBER " + Design.resetColorText + "of region of championship --> " + "\t");
        championshipSystem.setChooseRegion(in.nextInt());

        Design.cls();



        System.out.println(Design.centerText + Design.boldText + "Setting Teams" + Design.resetColorText);
        System.out.println("[1] " + "National Teams");
        System.out.println("[2] " + "Clubs");
        System.out.print("\t\t" + "Enter Teams Type --> " + "\t");
        championshipSystem.setChooseTeamType(in.nextInt());

        System.out.println();

        System.out.print("How many " + championshipSystem.getTeamType() + " --> " + "\t");
        championshipSystem.setNumOfTeams(in.nextInt());

        while (championshipSystem.getNumOfTeams() % 2 != 0)
        {
            Design.cls();
            System.out.println(Design.redText + "Error Input" + Design.resetColorText);
            System.out.println("Number of " + championshipSystem.getNumOfTeams() + " Should be Divisible by 2");
            System.out.println();
            System.out.println("Input again");

            System.out.print("How many " + championshipSystem.getTeamType() + " --> " + "\t");
            championshipSystem.setNumOfTeams(in.nextInt());
        }

        System.out.print("How many Groups --> " + "\t");
        championshipSystem.setNumOfGroups(in.nextInt());

        Design.cls();

        System.out.println(Design.centerText + Design.boldText + "Setting Host Country" + Design.resetColorText);
        MenuStadiums.hostCountries();
        System.out.print("\t\t" + "Enter " + Design.boldText + "NUMBER " + Design.resetColorText + "of Host Country --> " + "\t");

        hostCountry.setChooseHost(in.nextInt());

        Design.cls();

        System.out.print("What is the minimum price for the ticket " + "-->" + "\t");
        double minPrice = in.nextDouble();

        Design.cls();

        System.out.println(Design.centerText + Design.boldText + "Setting Year" + Design.resetColorText);
        System.out.print("Enter Year of " + Design.boldText + championshipSystem.getRegionChampionship() + Design.blueText + " " + hostCountry.getName() + Design.resetColorText + " " +  " -->" + "\t");
        championshipSystem.setYear(in.nextInt());

        char letter = 'A';

        Groups[] groups = new Groups[championshipSystem.getNumOfGroups()];

        int numOfTeamsPerGroup = championshipSystem.getTeamsPerGroup();

        for (int i = 0; i < groups.length; i++) {

            String name = "Group " + letter;
            groups[i] = new Groups(numOfTeamsPerGroup , name);

            letter++;
        }

        switch (championshipSystem.getChooseRegion()) {

            case 1:
            switch (championshipSystem.getChooseTeamType()) {

                case 1:
                    for (int i = 0; i < groups.length; i++) {

                        Teams[] teams = new Teams[numOfTeamsPerGroup];
                        groups[i].setTeams(teams);

                        for (int j = 0; j < numOfTeamsPerGroup; j++) {
                            Design.cls();

                            teams[j] = new Teams();
                            teams[j].setChampionshipSystem(championshipSystem);

                            System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                            System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                            MenuClubs.region();
                            System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of region of " + championshipSystem.getTeamType() + " --> " + "\t");
                            teams[j].setChooseTeamRegion(in.nextInt());

                            Design.cls();

                            System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                            System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                            switch (teams[j].getChooseTeamRegion()) {
                                case 1:
                                    MenuNationalTeams.europe();
                                    break;
                                case 2:
                                    MenuNationalTeams.asia();
                                    break;
                                case 3:
                                    MenuNationalTeams.africa();
                                    break;
                                case 4:
                                    MenuNationalTeams.southAmerica();
                                    break;
                                case 5:
                                    MenuNationalTeams.northAmerica();
                                    break;
                            }
                            System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + " of " + championshipSystem.getTeamType() + " --> " + "\t");
                            teams[j].setChooseTeamName(in.nextInt());
                        }

                    }
                    break;
                case 2:
                    for (int i = 0; i < groups.length; i++) {

                        Teams[] teams = new Teams[numOfTeamsPerGroup];
                        groups[i].setTeams(teams);

                        for (int j = 0; j < numOfTeamsPerGroup; j++) {
                            Design.cls();

                            teams[j] = new Teams();
                            teams[j].setChampionshipSystem(championshipSystem);

                            System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                            System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                            MenuNationalTeams.region();

                            System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of region of " + championshipSystem.getTeamType() + " --> " + "\t");
                            teams[j].setChooseTeamRegion(in.nextInt());

                            Design.cls();

                            System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                            System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                            switch (teams[j].getChooseTeamRegion()) {
                                case 1:
                                    MenuLeagues.europe();

                                    System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of League of " + championshipSystem.getTeamType() + " --> " + "\t");
                                    teams[j].setChooseClubLeague(in.nextInt());

                                    Design.cls();

                                    System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                    System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                    switch (teams[j].getChooseClubLeague()) {
                                        case 1:
                                            MenuClubs.england();
                                            break;
                                        case 2:
                                            MenuClubs.spain();
                                            break;
                                        case 3:
                                            MenuClubs.germany();
                                            break;
                                        case 4:
                                            MenuClubs.italy();
                                            break;
                                        case 5:
                                            MenuClubs.france();
                                            break;
                                        case 6:
                                            MenuClubs.netherlands();
                                            break;
                                        case 7:
                                            MenuClubs.portugal();
                                            break;
                                        case 8:
                                            MenuClubs.turkey();
                                            break;
                                        case 9:
                                            MenuClubs.russia();
                                            break;
                                    }
                                    break;

                                case 2:
                                    MenuLeagues.asia();

                                    System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of League of " + championshipSystem.getTeamType() + " --> " + "\t");
                                    teams[j].setChooseClubLeague(in.nextInt());

                                    Design.cls();

                                    System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                    System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                    switch (teams[j].getChooseClubLeague()) {
                                        case 1:
                                            MenuClubs.saudiArabia();
                                            break;
                                        case 2:
                                            MenuClubs.emirates();
                                            break;
                                        case 3:
                                            MenuClubs.qatar();
                                            break;
                                        case 4:
                                            MenuClubs.southKorea();
                                            break;
                                    }
                                    break;
                                case 3:
                                    MenuLeagues.africa();

                                    System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of League of " + championshipSystem.getTeamType() + " --> " + "\t");
                                    teams[j].setChooseClubLeague(in.nextInt());

                                    Design.cls();

                                    System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                    System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                    switch (teams[j].getChooseClubLeague()) {
                                        case 1:
                                            MenuClubs.egypt();
                                            break;
                                        case 2:
                                            MenuClubs.morocco();
                                            break;
                                        case 3:
                                            MenuClubs.tunisia();
                                            break;
                                        case 4:
                                            MenuClubs.algerie();
                                            break;
                                        case 5:
                                            MenuClubs.southAfrica();
                                            break;
                                    }
                                    break;
                                case 4:
                                    MenuLeagues.southAmerica();

                                    System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of League of " + championshipSystem.getTeamType() + " --> " + "\t");
                                    teams[j].setChooseClubLeague(in.nextInt());

                                    Design.cls();

                                    System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                    System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                    switch (teams[j].getChooseClubLeague()) {
                                        case 1:
                                            MenuClubs.argentina();
                                            break;
                                        case 2:
                                            MenuClubs.brazil();
                                            break;
                                        case 3:
                                            MenuClubs.chile();
                                            break;
                                        case 4:
                                            MenuClubs.colombia();
                                            break;
                                    }
                                    break;
                                case 5:
                                    MenuLeagues.northAmerica();

                                    System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of League of " + championshipSystem.getTeamType() + " --> " + "\t");
                                    teams[j].setChooseClubLeague(in.nextInt());

                                    Design.cls();

                                    System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                    System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                    switch (teams[j].getChooseClubLeague()) {
                                        case 1:
                                            MenuClubs.mexico();
                                            break;
                                        case 2:
                                            MenuClubs.unitedStates();
                                            break;
                                        case 3:
                                            MenuClubs.costaRica();
                                            break;
                                        case 4:
                                            MenuClubs.canada();
                                            break;
                                    }
                            }
                            System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of " + championshipSystem.getTeamType() + " --> " + "\t");
                            teams[j].setChooseTeamName(in.nextInt());
                        }
                    }
                    break;
            }
            break;
            case 2:

                switch (championshipSystem.getChooseTeamType())
                {
                    case 1:

                        for (int i = 0; i < groups.length; i++) {

                            Teams[] teams = new Teams[numOfTeamsPerGroup];
                            groups[i].setTeams(teams);

                            for (int j = 0; j < numOfTeamsPerGroup; j++) {
                                Design.cls();

                                teams[j] = new Teams();
                                teams[j].setChampionshipSystem(championshipSystem);

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                teams[j].setChooseTeamRegion(1);

                                MenuNationalTeams.europe();

                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + " of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseTeamName(in.nextInt());
                            }
                        }

                        break;

                    case 2:

                        for (int i = 0; i < groups.length; i++) {

                            Teams[] teams = new Teams[numOfTeamsPerGroup];
                            groups[i].setTeams(teams);

                            for (int j = 0; j < numOfTeamsPerGroup; j++) {
                                Design.cls();

                                teams[j] = new Teams();
                                teams[j].setChampionshipSystem(championshipSystem);

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                teams[j].setChooseTeamRegion(1);

                                MenuLeagues.europe();

                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of League of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseClubLeague(in.nextInt());

                                Design.cls();

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                switch (teams[j].getChooseClubLeague()) {
                                    case 1:
                                        MenuClubs.england();
                                        break;
                                    case 2:
                                        MenuClubs.spain();
                                        break;
                                    case 3:
                                        MenuClubs.germany();
                                        break;
                                    case 4:
                                        MenuClubs.italy();
                                        break;
                                    case 5:
                                        MenuClubs.france();
                                        break;
                                    case 6:
                                        MenuClubs.netherlands();
                                        break;
                                    case 7:
                                        MenuClubs.portugal();
                                        break;
                                    case 8:
                                        MenuClubs.turkey();
                                        break;
                                    case 9:
                                        MenuClubs.russia();
                                        break;
                                }
                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseTeamName(in.nextInt());
                            }
                        }
                                break;
                }
                break;
            case 3:

                switch (championshipSystem.getChooseTeamType())
                {

                    case 1:

                        for (int i = 0; i < groups.length; i++) {

                            Teams[] teams = new Teams[numOfTeamsPerGroup];
                            groups[i].setTeams(teams);

                            for (int j = 0; j < numOfTeamsPerGroup; j++) {
                                Design.cls();

                                teams[j] = new Teams();
                                teams[j].setChampionshipSystem(championshipSystem);

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                teams[j].setChooseTeamRegion(2);

                                MenuNationalTeams.asia();

                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + " of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseTeamName(in.nextInt());
                            }
                        }
                        break;
                    case 2:

                        for (int i = 0; i < groups.length; i++) {

                            Teams[] teams = new Teams[numOfTeamsPerGroup];
                            groups[i].setTeams(teams);

                            for (int j = 0; j < numOfTeamsPerGroup; j++) {
                                Design.cls();

                                teams[j] = new Teams();
                                teams[j].setChampionshipSystem(championshipSystem);

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                teams[j].setChooseTeamRegion(2);

                                MenuLeagues.asia();

                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of League of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseClubLeague(in.nextInt());

                                Design.cls();

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                switch (teams[j].getChooseClubLeague()) {
                                    case 1:
                                        MenuClubs.saudiArabia();
                                        break;
                                    case 2:
                                        MenuClubs.emirates();
                                        break;
                                    case 3:
                                        MenuClubs.qatar();
                                        break;
                                    case 4:
                                        MenuClubs.southKorea();
                                        break;
                                }
                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseTeamName(in.nextInt());
                            }
                        }
                                break;
                }
                break;

            case 4:
                switch (championshipSystem.getChooseTeamType())
                {
                    case 1:

                        for (int i = 0; i < groups.length; i++) {

                            Teams[] teams = new Teams[numOfTeamsPerGroup];
                            groups[i].setTeams(teams);

                            for (int j = 0; j < numOfTeamsPerGroup; j++) {
                                Design.cls();

                                teams[j] = new Teams();
                                teams[j].setChampionshipSystem(championshipSystem);

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                teams[j].setChooseTeamRegion(3);

                                MenuNationalTeams.africa();

                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + " of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseTeamName(in.nextInt());
                            }
                        }
                        break;

                    case 2:

                        for (int i = 0; i < groups.length; i++) {

                            Teams[] teams = new Teams[numOfTeamsPerGroup];
                            groups[i].setTeams(teams);

                            for (int j = 0; j < numOfTeamsPerGroup; j++) {
                                Design.cls();

                                teams[j] = new Teams();
                                teams[j].setChampionshipSystem(championshipSystem);

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                teams[j].setChooseTeamRegion(3);

                                MenuLeagues.africa();

                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of League of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseClubLeague(in.nextInt());

                                Design.cls();

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                switch (teams[j].getChooseClubLeague()) {
                                    case 1:
                                        MenuClubs.egypt();
                                        break;
                                    case 2:
                                        MenuClubs.morocco();
                                        break;
                                    case 3:
                                        MenuClubs.tunisia();
                                        break;
                                    case 4:
                                        MenuClubs.algerie();
                                        break;
                                    case 5:
                                        MenuClubs.southAfrica();
                                        break;
                                }
                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseTeamName(in.nextInt());
                            }
                        }

                        break;
                }
                break;

            case 5:
                switch (championshipSystem.getChooseTeamType())
                {

                    case 1:

                        for (int i = 0; i < groups.length; i++) {

                            Teams[] teams = new Teams[numOfTeamsPerGroup];
                            groups[i].setTeams(teams);

                            for (int j = 0; j < numOfTeamsPerGroup; j++) {
                                Design.cls();

                                teams[j] = new Teams();
                                teams[j].setChampionshipSystem(championshipSystem);

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                teams[j].setChooseTeamRegion(4);

                                MenuNationalTeams.southAmerica();

                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + " of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseTeamName(in.nextInt());
                            }
                        }
                        break;
                    case 2:

                        for (int i = 0; i < groups.length; i++) {

                            Teams[] teams = new Teams[numOfTeamsPerGroup];
                            groups[i].setTeams(teams);

                            for (int j = 0; j < numOfTeamsPerGroup; j++) {
                                Design.cls();

                                teams[j] = new Teams();
                                teams[j].setChampionshipSystem(championshipSystem);

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                teams[j].setChooseTeamRegion(4);

                                MenuLeagues.southAmerica();

                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of League of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseClubLeague(in.nextInt());

                                Design.cls();

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                switch (teams[j].getChooseClubLeague()) {
                                    case 1:
                                        MenuClubs.argentina();
                                        break;
                                    case 2:
                                        MenuClubs.brazil();
                                        break;
                                    case 3:
                                        MenuClubs.chile();
                                        break;
                                    case 4:
                                        MenuClubs.colombia();
                                        break;
                                }
                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseTeamName(in.nextInt());
                            }
                        }
                        break;
                }
                break;
            case 6:

                switch (championshipSystem.getChooseTeamType())
                {
                    case 1:

                        for (int i = 0; i < groups.length; i++) {

                            Teams[] teams = new Teams[numOfTeamsPerGroup];
                            groups[i].setTeams(teams);

                            for (int j = 0; j < numOfTeamsPerGroup; j++) {
                                Design.cls();

                                teams[j] = new Teams();
                                teams[j].setChampionshipSystem(championshipSystem);

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                teams[j].setChooseTeamRegion(6);

                                MenuNationalTeams.northAmerica();

                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + " of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseTeamName(in.nextInt());

                            }
                        }
                        break;

                    case 2:
                        for (int i = 0; i < groups.length; i++) {

                            Teams[] teams = new Teams[numOfTeamsPerGroup];
                            groups[i].setTeams(teams);

                            for (int j = 0; j < numOfTeamsPerGroup; j++) {
                                Design.cls();

                                teams[j] = new Teams();
                                teams[j].setChampionshipSystem(championshipSystem);

                                System.out.println(Design.centerText + Design.boldText +  Design.yellowText +  groups[i].name);
                                System.out.println(Design.centerText + Design.pinkText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                teams[j].setChooseTeamRegion(5);

                                MenuLeagues.northAmerica();

                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of League of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseClubLeague(in.nextInt());

                                Design.cls();

                                System.out.println(Design.centerText + Design.boldText +  groups[i].name);
                                System.out.println(Design.centerText + championshipSystem.getTeamType() + " [" + (j+1) + "] " + Design.resetColorText);

                                switch (teams[j].getChooseClubLeague()) {
                                    case 1:
                                        MenuClubs.mexico();
                                        break;
                                    case 2:
                                        MenuClubs.unitedStates();
                                        break;
                                    case 3:
                                        MenuClubs.costaRica();
                                        break;
                                    case 4:
                                        MenuClubs.canada();
                                        break;
                                }
                                System.out.print("\t\t" + "Enter" + Design.boldText + " NUMBER " + Design.resetColorText + "of " + championshipSystem.getTeamType() + " --> " + "\t");
                                teams[j].setChooseTeamName(in.nextInt());
                            }
                        }
                        break;
                }
        }
        Design.cls();

        System.out.println(Design.centerText + Design.boldText +  championshipSystem.getRegionChampionship() + " " + hostCountry + Design.resetColorText + " " + Design.orangeText +  championshipSystem.getYear() + Design.resetColorText + "™");
        for (int i = 0; i < groups.length ; i++) {
            System.out.println(groups[i]);
            groups[i].getTeamName();
        }

        System.out.println();

        ArrayList <MatchDetails> matchesList = new ArrayList<>();

        System.out.print("\t\t" + "Start Match Making (y/n) " + "--> " + "\t");
        char makeMatch = in.next().charAt(0);

        Design.cls();

        while (makeMatch == 'Y' || makeMatch == 'y')
        {
            MatchDetails matchDetails = new MatchDetails();

            System.out.println(Design.centerText + Design.boldText + "Match Making" + Design.resetColorText);

            for (int i = 0; i < groups.length; i++) {
                System.out.print( "[" + (i+1) + "] " );
                System.out.println(groups[i].name);
            }

            System.out.print("\t\t" + "Enter " + Design.boldText + "NUMBER " + Design.resetColorText + "of" + Design.boldText + Design.yellowText + " Group " + Design.resetColorText + "of Opposing team (Enter Valid Number (1 - " +  championshipSystem.getNumOfGroups() + ") )" + " -->" + "\t" );
            matchDetails.setChooseGroup(in.nextInt());

            Design.cls();

            System.out.println(groups[matchDetails.getChooseGroup()-1]);
            matchDetails.setGroups(groups[matchDetails.getChooseGroup()-1]);

            System.out.println("Enter" + Design.boldText +  " NUMBER " + Design.resetColorText + "of Opposing Teams");

            System.out.print("\t\t" + Design.boldText + Design.pinkText + "Team 1" + Design.resetColorText + " --> " + "\t");
            matchDetails.setChooseTeam1(in.nextInt());

            System.out.print("\t\t" + Design.boldText + Design.pinkText + "Team 2" + Design.resetColorText + " --> " + "\t");
            matchDetails.setChooseTeam2(in.nextInt());

            Design.cls();

            Stadium stadium = new Stadium();

            System.out.print(Design.centerText + Design.boldText + "Setting Stadium" + Design.resetColorText + "\n\n");

            stadium.setHostCountry(hostCountry);

            switch (hostCountry.getChooseHost())
            {
                case 1:
                    MenuStadiums.england();
                    break;
                case 2:
                    MenuStadiums.spain();
                    break;
                case 3:
                    MenuStadiums.germany();
                    break;
                case 4:
                    MenuStadiums.italy();
                    break;
                case 5:
                    MenuStadiums.france();
                    break;
                case 6:
                    MenuStadiums.russia();
                    break;
                case 7:
                    MenuStadiums.brazil();
                    break;
                case 8:
                    MenuStadiums.qatar();
                    break;
            }
            System.out.print("\t\t" + "Enter " + Design.boldText + "NUMBER " + Design.resetColorText + " of Stadium" + " -->" + "\t");
            stadium.setChooseStadium(in.nextInt());

            matchDetails.setStadium(stadium);

            Design.cls();

            System.out.println(Design.centerText + Design.boldText + "Setting Date & Time" + Design.resetColorText);
            Date date = new Date();
            Time time = new Time();

            System.out.print("Day: " + "\t");
            date.setDay(in.nextInt());
            System.out.print("Month: " + "\t");
            date.setMonth(in.nextInt());
            date.setYear(championshipSystem.getYear());

            System.out.println();

            System.out.print("Hour (24-Hour System) : " + "\t");
            time.setStartHour(in.nextInt());
            System.out.print("Minute: " + "\t");
            time.setStartMin(in.nextInt());

            matchDetails.setDate(date);
            matchDetails.setTime(time);

            matchesList.add(matchDetails);

            Design.cls();

            System.out.print("\t\t" + "Continue Match Making (y/n)" + " --> "  +"\t");
            makeMatch = in.next().charAt(0);

            Design.cls();
        }

        Design.cls();

        for (int i = 0; i < matchesList.size(); i++) {
            System.out.println("[" + (i+1) +  "]");
            System.out.println(matchesList.get(i));
        }
        System.out.print("\n\n");

        System.out.print("\t\t" + "Start Tickets Booking (y/n) " + "--> " + "\t");
        char bookTicket = in.next().charAt(0);

        Design.cls();


        Design.cls();

        System.out.println(Design.centerText + Design.boldText + "Setting Age" + Design.resetColorText);

        ArrayList <QualifiedFan> fansList = new ArrayList<>();

        while (bookTicket == 'Y' || bookTicket == 'y')
        {
            Person person = new Person();
            System.out.print("What is your Age " + "-->" + "\t");
            person.setAge(in.nextInt());

            Design.cls();

            if (person.getAge() >= 0)
            {
                if (person.getAge() >= 18)
                {
                    System.out.println(Design.centerText + Design.greenText + "You are Allowed to book Tickets" + Design.resetColorText);
                    System.out.println();

                    System.out.println(Design.centerText + Design.boldText + "Getting Qualified Person data" + Design.resetColorText);

                    QualifiedFan qualifiedFan = new QualifiedFan();

                    qualifiedFan.setAgeQualified(person.getAge());

                    System.out.print("Enter your FIRST name" + " -->" + "\t");
                    qualifiedFan.setName(in.next());

                    System.out.print("Enter your Nationality" + " --> " + "\t");
                    qualifiedFan.setNationality(in.next());

                    System.out.print("Enter your National number" + " --> " + "\t");
                    qualifiedFan.setID(in.nextInt());

                    Design.cls();

                    Ticket ticket = new Ticket();
                    ticket.setMinPrice(minPrice);
                    ticket.setHostCountry(hostCountry);
                    ticket.setChampionshipSystem(championshipSystem);

                    System.out.println(Design.centerText + Design.boldText + "Booking Ticket" + Design.resetColorText);

                    for (int i = 0; i < matchesList.size(); i++) {
                        System.out.println("[" + (i+1) +  "]");
                        System.out.println(matchesList.get(i));
                    }
                    System.out.print("\n\n");

                    System.out.print("Enter " + Design.boldText +  "NUMBER " + Design.resetColorText + "of match you want to book" + " --> " + "\t");
                    ticket.setChooseMatch(in.nextInt());

                    ticket.setMatchDetails(matchesList.get( ticket.getChooseMatch() ) );

                    Design.cls();

                    System.out.println(Design.centerText + Design.boldText + "Booking Ticket" + Design.resetColorText);

                    ticket.MenuCategory();

                    System.out.print("Enter " + Design.boldText + "NUMBER " + Design.resetColorText + "of Category you want" + " -->" + "\t");
                    ticket.setChooseCategory(in.nextInt());

                    System.out.print("How many Tickets" + " -->" + "\t");
                    ticket.setQuantity(in.nextDouble());

                    qualifiedFan.setTicket(ticket);
                    fansList.add(qualifiedFan);
                }
                else
                {
                    System.out.print(Design.centerText + Design.redText + "You are too young to book Tickets by Yourself" + Design.resetColorText + "\n\n");
                }
            }
            else
            {
                System.out.print(Design.centerText + Design.redText + "Invalid Input" + Design.resetColorText + "\n\n");
            }
            System.out.print("\n\n");
            System.out.print("\t\t" + "Continue Tickets Booking (y/n) " + "--> " + "\t");
            bookTicket = in.next().charAt(0);

            Design.cls();
        }
        for (int i = 0; i < fansList.size(); i++) {
            System.out.println(fansList.get(i));
            System.out.println(Design.centerText + "------------------------");
        }
    }
}
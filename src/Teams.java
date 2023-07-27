public class Teams {
    public int chooseTeamRegion;
    private int chooseClubLeague;
    private int chooseTeamName;
    private String teamName;

    private ChampionshipSystem championshipSystem;

    public void setChampionshipSystem(ChampionshipSystem championshipSystem) {
        this.championshipSystem = championshipSystem;
    }

    public void setChooseTeamRegion(int chooseTeamRegion) {
        this.chooseTeamRegion = chooseTeamRegion;
    }

    public int getChooseTeamRegion() {
        return chooseTeamRegion;
    }

    public void setChooseClubLeague(int chooseClubLeague) {
        this.chooseClubLeague = chooseClubLeague;
    }

    public int getChooseClubLeague() {
        return chooseClubLeague;
    }

    public void setChooseTeamName(int chooseTeamName) {
        this.chooseTeamName = chooseTeamName;
    }
    public int getChooseTeamName() {
        return chooseTeamName;
    }

    // From Here: work on teamName;
    public String getTeamName() {

        switch (championshipSystem.getChooseTeamType())
        {
            case 1: // Class MenuNationalTeams  // National Teams
                switch (getChooseTeamRegion()) // El-qarat (5)
                {
                    case 1: // Method europe from Class MenuNationalTeams
                        switch (getChooseTeamName())
                        {
                            case 1:
                                teamName = "Albania";
                                break;
                            case 2:
                                teamName = "Andora";
                                break;
                            case 3:
                                teamName = "Armenia";
                                break;
                            case 4:
                                teamName = "Austria";
                                break;
                            case 5:
                                teamName = "Azerbaijan";
                                break;
                            case 6:
                                teamName = "Belarus";
                                break;
                            case 7:
                                teamName = "Belgium";
                                break;
                            case 8:
                                teamName = "Bosnia and Herzegovina";
                                break;
                            case 9:
                                teamName = "Bulgaria";
                                break;
                            case 10:
                                teamName = "Croatia";
                                break;
                            case 11:
                                teamName = "Cyprus";
                                break;
                            case 12:
                                teamName = "Czech Republic";
                                break;
                            case 13:
                                teamName = "Denmark";
                                break;
                            case 14:
                                teamName = "England";
                                break;
                            case 15:
                                teamName = "Estonia";
                                break;
                            case 16:
                                teamName = "Faroe Islands";
                                break;
                            case 17:
                                teamName = "Finland";
                                break;
                            case 18:
                                teamName = "France";
                                break;
                            case 19:
                                teamName = "Georgia";
                                break;
                            case 20:
                                teamName = "Germany";
                                break;
                            case 21:
                                teamName = "Gibraltar";
                                break;
                            case 22:
                                teamName = "Greece";
                                break;
                            case 23:
                                teamName = "Hungary";
                                break;
                            case 24:
                                teamName = "Iceland";
                                break;
                            case 25:
                                teamName = "Italy";
                                break;
                            case 26:
                                teamName = "Ireland";
                                break;
                            case 27:
                                teamName = "Kazakhstan";
                                break;
                            case 28:
                                teamName = "Kosovo";
                                break;
                            case 29:
                                teamName = "Latvia";
                                break;
                            case 30:
                                teamName = "Liechtenstein";
                                break;
                            case 31:
                                teamName = "Lithuania";
                                break;
                            case 32:
                                teamName = "Luxembourg";
                                break;
                            case 33:
                                teamName = "Malta";
                                break;
                            case 34:
                                teamName = "Moldova";
                                break;
                            case 35:
                                teamName = "Montenegro";
                                break;
                            case 36:
                                teamName = "Netherlands";
                                break;
                            case 37:
                                teamName = "North Macedonia";
                                break;
                            case 38:
                                teamName = "Northern Ireland";
                                break;
                            case 39:
                                teamName = "Norway";
                                break;
                            case 40:
                                teamName = "Poland";
                                break;
                            case 41:
                                teamName = "Portugal";
                                break;
                            case 42:
                                teamName = "Romania";
                                break;
                            case 43:
                                teamName = "Russia";
                                break;
                            case 44:
                                teamName = "San Marino";
                                break;
                            case 45:
                                teamName = "Scotland";
                                break;
                            case 46:
                                teamName = "Serbia";
                                break;
                            case 47:
                                teamName = "Slovakia";
                                break;
                            case 48:
                                teamName = "Slovenia";
                                break;
                            case 49:
                                teamName = "Spain";
                                break;
                            case 50:
                                teamName = "Sweden";
                                break;
                            case 51:
                                teamName = "Switzerland";
                                break;
                            case 52:
                                teamName = "Turkey";
                                break;
                            case 53:
                                teamName = "Ukraine";
                                break;
                        }
                        break;

                    case 2: // Method asia from Class MenuNationalTeams
                        switch (getChooseTeamName())
                        {
                            case 1:
                                teamName = "Afghanistan";
                                break;
                            case 2:
                                teamName = "Australia";
                                break;
                            case 3:
                                teamName = "Bahrain";
                                break;
                            case 4:
                                teamName = "Bangladesh";
                                break;
                            case 5:
                                teamName = "Bhutan";
                                break;
                            case 6:
                                teamName = "Brunei Darussalam";
                                break;
                            case 7:
                                teamName = "Cambodia";
                                break;
                            case 8:
                                teamName = "China";
                                break;
                            case 9:
                                teamName = "Chinese Taipei";
                                break;
                            case 10:
                                teamName = "Guam";
                                break;
                            case 11:
                                teamName = "Hong Kong";
                                break;
                            case 12:
                                teamName = "India";
                                break;
                            case 13:
                                teamName = "Indonesia";
                                break;
                            case 14:
                                teamName = "Iran";
                                break;
                            case 15:
                                teamName = "Iraq";
                                break;
                            case 16:
                                teamName = "Japan";
                                break;
                            case 17:
                                teamName = "Jordan";
                                break;
                            case 18:
                                teamName = "Korea DPR";
                                break;
                            case 19:
                                teamName = "Korea Republic";
                                break;
                            case 20:
                                teamName = "Kuwait";
                                break;
                            case 21:
                                teamName = "Kyrgyz Republic";
                                break;
                            case 22:
                                teamName = "Laos";
                                break;
                            case 23:
                                teamName = "Lebanon";
                                break;
                            case 24:
                                teamName = "Macau";
                                break;
                            case 25:
                                teamName = "Malaysia";
                                break;
                            case 26:
                                teamName = "Maldives";
                                break;
                            case 27:
                                teamName = "Mongolia";
                                break;
                            case 28:
                                teamName = "Myanmar";
                                break;
                            case 29:
                                teamName = "Nepal";
                                break;
                            case 30:
                                teamName = "Oman";
                                break;
                            case 31:
                                teamName = "Pakistan";
                                break;
                            case 32:
                                teamName = "Palestine";
                                break;
                            case 33:
                                teamName = "Philippines";
                                break;
                            case 34:
                                teamName = "Qatar";
                                break;
                            case 35:
                                teamName = "Saudi Arabia";
                                break;
                            case 36:
                                teamName = "Singapore";
                                break;
                            case 37:
                                teamName = "Sri Lanka";
                                break;
                            case 38:
                                teamName = "Syria";
                                break;
                            case 39:
                                teamName = "Tajikistan";
                                break;
                            case 40:
                                teamName = "Thailand";
                                break;
                            case 41:
                                teamName = "Timor-Leste";
                                break;
                            case 42:
                                teamName = "Turkmenistan";
                                break;
                            case 43:
                                teamName = "United Arab Emirates";
                                break;
                            case 44:
                                teamName = "Uzbekistan";
                                break;
                            case 45:
                                teamName = "Vietnam";
                                break;
                            case 46:
                                teamName = "Yemen";
                                break;
                        }
                        break;

                    case 3: // Method africa from Class MenuNationalTeams
                        switch (getChooseTeamName())
                        {
                            case 1:
                                teamName = "Algeria";
                                break;
                            case 2:
                                teamName = "Angola";
                                break;
                            case 3:
                                teamName = "Benin";
                                break;
                            case 4:
                                teamName = "Botswana";
                                break;
                            case 5:
                                teamName = "Burkina Faso";
                                break;
                            case 6:
                                teamName = "Burundi";
                                break;
                            case 7:
                                teamName = "Cameroon";
                                break;
                            case 8:
                                teamName = "Cape Verde";
                                break;
                            case 9:
                                teamName = "Central African Republic";
                                break;
                            case 10:
                                teamName = "Chad";
                                break;
                            case 11:
                                teamName = "Comoros";
                                break;
                            case 12:
                                teamName = "Congo";
                                break;
                            case 13:
                                teamName = "Djibouti";
                                break;
                            case 14:
                                teamName = "DR Congo";
                                break;
                            case 15:
                                teamName = "Egypt";
                                break;
                            case 16:
                                teamName = "Equatorial Guinea";
                                break;
                            case 17:
                                teamName = "Eritrea";
                                break;
                            case 18:
                                teamName = "Eswatini";
                                break;
                            case 19:
                                teamName = "Ethiopia";
                                break;
                            case 20:
                                teamName = "Gabon";
                                break;
                            case 21:
                                teamName = "Gambia";
                                break;
                            case 22:
                                teamName = "Ghana";
                                break;
                            case 23:
                                teamName = "Guinea";
                                break;
                            case 24:
                                teamName = "Guinea-Bissau";
                                break;
                            case 25:
                                teamName = "Ivory Coast";
                                break;
                            case 26:
                                teamName = "Kenya";
                                break;
                            case 27:
                                teamName = "Lesotho";
                                break;
                            case 28:
                                teamName = "Liberia";
                                break;
                            case 29:
                                teamName = "Libya";
                                break;
                            case 30:
                                teamName = "Madagascar";
                                break;
                            case 31:
                                teamName = "Malawi";
                                break;
                            case 32:
                                teamName = "Mali";
                                break;
                            case 33:
                                teamName = "Mauritania";
                                break;
                            case 34:
                                teamName = "Morocco";
                                break;
                            case 35:
                                teamName = "Mozambique";
                                break;
                            case 36:
                                teamName = "Namibia";
                                break;
                            case 37:
                                teamName = "Niger";
                                break;
                            case 38:
                                teamName = "Nigeria";
                                break;
                            case 39:
                                teamName = "Réunion";
                                break;
                            case 40:
                                teamName = "Rwanda";
                                break;
                            case 41:
                                teamName = "São Tomé and Príncipe";
                                break;
                            case 42:
                                teamName = "Senegal";
                                break;
                            case 43:
                                teamName = "Seychelles";
                                break;
                            case 44:
                                teamName = "Sierra Leone";
                                break;
                            case 45:
                                teamName = "Somalia";
                                break;
                            case 46:
                                teamName = "South Africa";
                                break;
                            case 47:
                                teamName = "Sudan";
                                break;
                            case 48:
                                teamName = "South Sudan";
                                break;
                            case 49:
                                teamName = "Tanzania";
                                break;
                            case 50:
                                teamName = "Togo";
                                break;
                            case 51:
                                teamName = "Tunisia";
                                break;
                            case 52:
                                teamName = "Uganda";
                                break;
                            case 53:
                                teamName = "Zambia";
                                break;
                            case 54:
                                teamName = "Zanzibar";
                                break;
                            case 55:
                                teamName = "Zimbabwe";
                                break;
                        }
                        break;

                    case 4: // Method southAmerica from Class MenuNationalTeams // This case
                        switch (getChooseTeamName())
                        {
                            case 1:
                                teamName = "Argentina";
                                break;
                            case 2:
                                teamName = "Bolivia";
                                break;
                            case 3:
                                teamName = "Brazil";
                                break;
                            case 4:
                                teamName = "Chile";
                                break;
                            case 5:
                                teamName = "Colombia";
                                break;
                            case 6:
                                teamName = "Ecuador";
                                break;
                            case 7:
                                teamName = "Paraguay";
                                break;
                            case 8:
                                teamName = "Peru";
                                break;
                            case 9:
                                teamName = "Uruguay";
                                break;
                            case 10:
                                teamName = "Venezuela";
                                break;

                        }
                        break;
                    case 5: // Method northAmerica from Class MenuNationalTeams
                        switch (getChooseTeamName())
                        {
                            case 1:
                                teamName = "Anguilla";
                                break;
                            case 2:
                                teamName = "Antigua and Barbuda";
                                break;
                            case 3:
                                teamName = "Aruba";
                                break;
                            case 4:
                                teamName = "Bahamas";
                                break;
                            case 5:
                                teamName = "Barbados";
                                break;
                            case 6:
                                teamName = "Belize";
                                break;
                            case 7:
                                teamName = "Bermuda";
                                break;
                            case 8:
                                teamName = "Bonaire";
                                break;
                            case 9:
                                teamName = "British Virgin Islands";
                                break;
                            case 10:
                                teamName = "Canada";
                                break;
                            case 11:
                                teamName = "Cayman Islands";
                                break;
                            case 12:
                                teamName = "Costa Rica";
                                break;
                            case 13:
                                teamName = "Cuba";
                                break;
                            case 14:
                                teamName = "Curaçao";
                                break;
                            case 15:
                                teamName = "Dominica";
                                break;
                            case 16:
                                teamName = "Dominican Republic";
                                break;
                            case 17:
                                teamName = "El Salvador";
                                break;
                            case 18:
                                teamName = "French Guiana";
                                break;
                            case 19:
                                teamName = "Grenada";
                                break;
                            case 20:
                                teamName = "Guadeloupe";
                                break;
                            case 21:
                                teamName = "Guatemala";
                                break;
                            case 22:
                                teamName = "Guyana";
                                break;
                            case 23:
                                teamName = "Haiti";
                                break;
                            case 24:
                                teamName = "Honduras";
                                break;
                            case 25:
                                teamName = "Jamaica";
                                break;
                            case 26:
                                teamName = "Martinique";
                                break;
                            case 27:
                                teamName = "Mexico";
                                break;
                            case 28:
                                teamName = "Montserrat";
                                break;
                            case 29:
                                teamName = "Nicaragua";
                                break;
                            case 30:
                                teamName = "Panama";
                                break;
                            case 31:
                                teamName = "Puerto Rico";
                                break;
                            case 32:
                                teamName = "Saint Kitts and Nevis";
                                break;
                            case 33:
                                teamName = "Saint Lucia";
                                break;
                            case 34:
                                teamName = "Saint Martin";
                                break;
                            case 35:
                                teamName = "Saint Vincent and the Grenadines";
                                break;
                            case 36:
                                teamName = "Sint Maarten";
                                break;
                            case 37:
                                teamName = "Suriname";
                                break;
                            case 38:
                                teamName = "Trinidad and Tobago";
                                break;
                            case 39:
                                teamName = "Turks and Caicos Islands";
                                break;
                            case 40:
                                teamName = "United States";
                                break;
                        }
                        break;
                }
                break;

            // End National Teams

            // Start Clubs
            case 2: //
                switch (getChooseTeamRegion()) // EL qarat(5)
                {
                    case 1: // Europe
                        switch (getChooseClubLeague()) // Leages of Europe
                        {
                            case 1: // Method england Class MenuClubs
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Chelsea";
                                        break;
                                    case 2:
                                        teamName = "Liverpool";
                                        break;
                                    case 3:
                                        teamName = "Manchester City";
                                        break;
                                    case 4:
                                        teamName = "Manchester United";
                                        break;
                                    case 5:
                                        teamName = "Tottenham Hotspur";
                                        break;
                                }
                                break;

                            case 2: //
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Atlético Madrid";
                                        break;
                                    case 2:
                                        teamName = "FC Barcelona";
                                        break;
                                    case 3:
                                        teamName = "Real Madrid";
                                        break;
                                    case 4:
                                        teamName = "Sevilla FC";
                                        break;
                                    case 5:
                                        teamName = "Valencia CF";
                                        break;
                                }
                                break;
                            case 3:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Bayer Leverkusen";
                                        break;
                                    case 2:
                                        teamName = "Bayern Munich";
                                        break;
                                    case 3:
                                        teamName = "Borussia Dortmund";
                                        break;
                                    case 4:
                                        teamName = "Borussia Mönchengladbach";
                                        break;
                                    case 5:
                                        teamName = "RB Leipzig";
                                        break;
                                }
                                break;
                            case 4:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "AC Milan";
                                        break;
                                    case 2:
                                        teamName = "AS Roma";
                                        break;
                                    case 3:
                                        teamName = "Inter Milan";
                                        break;
                                    case 4:
                                        teamName = "Juventus";
                                        break;
                                    case 5:
                                        teamName = "Napoli";
                                        break;
                                }
                                break;
                            case 5:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "AS Monaco";
                                        break;
                                    case 2:
                                        teamName = "Lille OSC";
                                        break;
                                    case 3:
                                        teamName = "Olympique de Marseille";
                                        break;
                                    case 4:
                                        teamName = "Olympique Lyonnais";
                                        break;
                                    case 5:
                                        teamName = "Paris Saint-Germain";
                                        break;
                                }
                            break;
                            case 6:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Ajax";
                                        break;
                                    case 2:
                                        teamName = "AZ Alkmaar";
                                        break;
                                    case 3:
                                        teamName = "Feyenoord";
                                        break;
                                    case 4:
                                        teamName = "PSV Eindhoven";
                                        break;
                                    case 5:
                                        teamName = "Vitesse";
                                        break;
                                }
                                break;
                            case 7:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Braga";
                                        break;
                                    case 2:
                                        teamName = "FC Porto";
                                        break;
                                    case 3:
                                        teamName = "SL Benfica";
                                        break;
                                    case 4:
                                        teamName = "Sporting CP";
                                        break;
                                    case 5:
                                        teamName = "Vitória SC";
                                        break;
                                }
                                break;
                            case 8:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Başakşehir";
                                        break;
                                    case 2:
                                        teamName = "Beşiktaş";
                                        break;
                                    case 3:
                                        teamName = "Fenerbahçe";
                                        break;
                                    case 4:
                                        teamName = "Galatasaray";
                                        break;
                                    case 5:
                                        teamName = "Trabzonspor";
                                        break;
                                }
                                break;
                            case 9:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "CSKA Moscow";
                                        break;
                                    case 2:
                                        teamName = "Krasnodar";
                                        break;
                                    case 3:
                                        teamName = "Lokomotiv Moscow";
                                        break;
                                    case 4:
                                        teamName = "Spartak Moscow";
                                        break;
                                    case 5:
                                        teamName = "Zenit Saint Petersburg";
                                        break;
                                }
                        }
                        break;
                    case 2: // Asia
                        switch (getChooseClubLeague())
                        {
                            case 1:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Al-Ahli";
                                        break;
                                    case 2:
                                        teamName = "Al-Hilal";
                                        break;
                                    case 3:
                                        teamName = "Al-Ittihad";
                                        break;
                                    case 4:
                                        teamName = "Al-Nassr";
                                        break;
                                    case 5:
                                        teamName = "Al-Shabab";
                                        break;
                                }
                                break;
                            case 2:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Al-Ain";
                                        break;
                                    case 2:
                                        teamName = "Al-Jazira";
                                        break;
                                    case 3:
                                        teamName = "Al-Nasr";
                                        break;
                                    case 4:
                                        teamName = "Al-Wahda";
                                        break;
                                    case 5:
                                        teamName = "Shabab Al-Ahli";
                                        break;
                                }
                                break;
                            case 3:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Al-Duhail";
                                        break;
                                    case 2:
                                        teamName = "Al-Gharafa";
                                        break;
                                    case 3:
                                        teamName = "Al-Rayyan";
                                        break;
                                    case 4:
                                        teamName = "Al-Sadd";
                                        break;
                                    case 5:
                                        teamName = "Umm Salal";
                                        break;
                                }
                                break;
                            case 4:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "FC Seoul";
                                        break;
                                    case 2:
                                        teamName = "Jeonbuk Hyundai Motors";
                                        break;
                                    case 3:
                                        teamName = "Pohang Steelers";
                                        break;
                                    case 4:
                                        teamName = "Suwon Samsung Bluewings";
                                        break;
                                    case 5:
                                        teamName = "Ulsan Hyundai";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 3: // Africa
                        switch (getChooseClubLeague())
                        {
                            case 1:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Al Ahly";
                                        break;
                                    case 2:
                                        teamName = "Al Masry";
                                        break;
                                    case 3:
                                        teamName = "Ismaily";
                                        break;
                                    case 4:
                                        teamName = "Pyramids FC";
                                        break;
                                    case 5:
                                        teamName = "Zamalek";
                                        break;
                                }
                                break;
                            case 2:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Difaa El Jadidi ";
                                        break;
                                    case 2:
                                        teamName = "FAR Rabat";
                                        break;
                                    case 3:
                                        teamName = "Moghreb Tétouan";
                                        break;
                                    case 4:
                                        teamName = "Raja Casablanca";
                                        break;
                                    case 5:
                                        teamName = "Wydad Casablanca";
                                        break;
                                }
                                break;
                            case 3:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Club Africain";
                                        break;
                                    case 2:
                                        teamName = "Club Sportif de Hammam-Lif";
                                        break;
                                    case 3:
                                        teamName = "CS Sfaxien";
                                        break;
                                    case 4:
                                        teamName = "Espérance de Tunis";
                                        break;
                                    case 5:
                                        teamName = "Étoile du Sahel";
                                        break;
                                }
                                break;
                            case 4:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "CR Belouizdad";
                                        break;
                                    case 2:
                                        teamName = "CS Constantine";
                                        break;
                                    case 3:
                                        teamName = "ES Sétif";
                                        break;
                                    case 4:
                                        teamName = "MC Alger";
                                        break;
                                    case 5:
                                        teamName = "USM Alger";
                                        break;
                                }
                                break;
                            case 5:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Bidvest Wits";
                                        break;
                                    case 2:
                                        teamName = "Kaizer Chiefs";
                                        break;
                                    case 3:
                                        teamName = "Mamelodi Sundowns";
                                        break;
                                    case 4:
                                        teamName = "Orlando Pirates";
                                        break;
                                    case 5:
                                        teamName = "SuperSport United";;
                                        break;
                                }
                                break;
                        }

                        break;
                    case 4: // South America
                        switch (getChooseClubLeague())
                        {
                            case 1:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Boca Juniors";
                                        break;
                                    case 2:
                                        teamName = "Independiente";
                                        break;
                                    case 3:
                                        teamName = "Racing Club";
                                        break;
                                    case 4:
                                        teamName = "River Plate";
                                        break;
                                    case 5:
                                        teamName = "San Lorenzo";
                                        break;
                                }
                                break;
                            case 2:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Corinthians";
                                        break;
                                    case 2:
                                        teamName = "Flamengo";
                                        break;
                                    case 3:
                                        teamName = "Palmeiras";
                                        break;
                                    case 4:
                                        teamName = "Santos";
                                        break;
                                    case 5:
                                        teamName = "São Paulo";
                                        break;
                                }
                                break;
                            case 3:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Audax Italiano La Florida";
                                        break;
                                    case 2:
                                        teamName = "Cobresal";
                                        break;
                                    case 3:
                                        teamName = "Colo Colo";
                                        break;
                                    case 4:
                                        teamName = "Everton CD";
                                        break;
                                    case 5:
                                        teamName = "Universidad Católica";
                                        break;
                                }
                                break;
                            case 4:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Aguilas Doradas";
                                        break;
                                    case 2:
                                        teamName = "Atlético Nacional";
                                        break;
                                    case 3:
                                        teamName = "Independiente Medellín";
                                        break;
                                    case 4:
                                        teamName = "Millonarios";
                                        break;
                                    case 5:
                                        teamName = "Santa Fe";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 5: // North America
                        switch (getChooseClubLeague())
                        {
                            case 1:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Club América";
                                        break;
                                    case 2:
                                        teamName = "Cruz Azul";
                                        break;
                                    case 3:
                                        teamName = "Guadalajara";
                                        break;
                                    case 4:
                                        teamName = "Monterrey";
                                        break;
                                    case 5:
                                        teamName = "Tigres UANL";
                                        break;
                                }
                                break;
                            case 2:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Atlanta United";
                                        break;
                                    case 2:
                                        teamName = "LA Galaxy";
                                        break;
                                    case 3:
                                        teamName = "New York Red Bulls";
                                        break;
                                    case 4:
                                        teamName = "Portland Timbers";
                                        break;
                                    case 5:
                                        teamName = "Seattle Sounders FC";
                                        break;
                                }
                                break;
                            case 3:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Cartaginés";
                                        break;
                                    case 2:
                                        teamName = "Club Sport Herediano";
                                        break;
                                    case 3:
                                        teamName = "Deportiva San Carlos";
                                        break;
                                    case 4:
                                        teamName = "LD Alajuelense";
                                        break;
                                    case 5:
                                        teamName = "Deportivo Saprissa";
                                        break;
                                }
                                break;
                            case 4:
                                switch (getChooseTeamName())
                                {
                                    case 1:
                                        teamName = "Cavalry FC";
                                        break;
                                    case 2:
                                        teamName = "Forge FC";
                                        break;
                                    case 3:
                                        teamName = "Montreal Impact";
                                        break;
                                    case 4:
                                        teamName = "Toronto FC";
                                        break;
                                    case 5:
                                        teamName = "Vancouver Whitecaps FC";
                                        break;
                                }
                                break;
                        }
                }
        }
        return teamName;
    }
    @Override
    public String toString() {
        return getTeamName();
    }
}
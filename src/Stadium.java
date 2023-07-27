public class Stadium {
    private int chooseStadium;
    private String name;
    private String city;
    private int capacity;
    private HostCountry hostCountry;

    public void setHostCountry(HostCountry hostCountry) {
        this.hostCountry = hostCountry;
    }

    public void setChooseStadium(int chooseStadium) {
        this.chooseStadium = chooseStadium;
    }

    public int getChooseStadium() {
        return chooseStadium;
    }

    public String getName() {

        switch (hostCountry.getChooseHost()) {
            case 1:

                switch (getChooseStadium()) {
                    case 1:
                        name = "Wembley Stadium";
                        break;
                    case 2:
                        name = "Old Trafford";
                        break;
                    case 3:
                        name = "Tottenham Hotspur Stadium";
                        break;
                    case 4:
                        name = "Emirates Stadium";
                        break;

                    case 5:
                        name = "London Stadium";
                        break;
                    case 6:
                        name = "Etihad Stadium";
                        break;
                    case 7:
                        name = "Anfield";
                        break;
                    case 8:
                        name = "St James' Park";
                        break;
                }
                break;

            case 2:
                switch (getChooseStadium()) {
                    case 1:
                        name = "Camp Nou";
                        break;
                    case 2:
                        name = "Santiago Bernabéu Stadium";
                        break;
                    case 3:
                        name = "Metropolitano Stadium";
                        break;
                    case 4:
                        name = "Estadio Benito Villamarín";
                        break;
                    case 5:
                        name = "Estadi Olímpic Lluís Companys";
                        break;
                    case 6:
                        name = "Estadio La Cartuja";
                        break;
                    case 7:
                        name = "San Mamés Stadium";
                        break;
                    case 8:
                        name = "Mestalla Stadium";
                        break;
                }
                break;

            case 3:
                switch (getChooseStadium()) {
                    case 1:
                        name = "Signal iduna Park";
                        break;
                    case 2:
                        name = " Allianz Arena";
                        break;
                    case 3:
                        name = "Olympiastadion";
                        break;
                    case 4:
                        name = "Veltins-Arena";
                        break;
                    case 5:
                        name = "Mercedes-Benz Arena";
                        break;
                    case 6:
                        name = "RheinEnergieStadion";
                        break;
                    case 7:
                        name = "VolksparkStadion";
                        break;
                    case 8:
                        name = "Redbull Arena";
                        break;


                }
                break;

            case 4:
                switch (getChooseStadium()) {
                    case 1:
                        name = "San Siro";
                        break;
                    case 2:
                        name = " Stadio Olimpico";
                        break;
                    case 3:
                        name = "Stadio San Paolo";
                        break;
                    case 4:
                        name = "Stadio Artemio Franchi";
                        break;
                    case 5:
                        name = "Juventus Stadium";
                        break;
                    case 6:
                        name = "Stadio Luigi Ferraris";
                        break;
                    case 7:
                        name = "Stadio Olimpico Grande Torino";
                        break;
                    case 8:
                        name = "Stadio Luigi Ferraris";
                        break;
                }
                break;
            case 5:
                switch (getChooseStadium()) {
                    case 1:
                        name = "Stade de France";
                        break;
                    case 2:
                        name = "Stade Vélodrome";
                        break;
                    case 3:
                        name = "Parc Olympique Lyonnais";
                        break;
                    case 4:
                        name = "Stade Pierre-Mauroy";
                        break;
                    case 5:
                        name = "Parc des Princes";
                        break;
                    case 6:
                        name = "Matmut Atlantique";
                        break;
                    case 7:
                        name = "Allianz Riviera";
                        break;
                    case 8:
                        name = "Roazhon Park";
                        break;
                }
            case 6:
                switch (getChooseStadium()) {
                    case 1:
                        name = "Luzhniki Stadium";
                        break;
                    case 2:
                        name = " Saint Petersburg Stadium";
                        break;
                    case 3:
                        name = "Fisht Olympic Stadium";
                        break;
                    case 4:
                        name = "Volgograd Arena";
                        break;
                    case 5:
                        name = "Otkrytie Arena";
                        break;
                    case 6:
                        name = "Kazan Arena";
                        break;
                    case 7:
                        name = "Rostov Arena";
                        break;
                    case 8:
                        name = "Samara Arena";
                        break;
                }
                break;
            case 7:
                switch (getChooseStadium()) {
                    case 1:
                        name = "Maracanã Stadium";
                        break;
                    case 2:
                        name = " Estádio Nacional Mané Garrincha";
                        break;
                    case 3:
                        name = "Morumbi Stadium";
                        break;
                    case 4:
                        name = "Mineirão";
                        break;
                    case 5:
                        name = "Castelão";
                        break;
                    case 6:
                        name = "Beira-Rio Stadium";
                        break;
                    case 7:
                        name = "Arena Corinthians";
                        break;
                    case 8:
                        name = "Fonte Nova Arena";
                        break;
                }
                break;
            case 8:
                switch (getChooseStadium()) {
                    case 1:
                        name = "Lusail Iconic Stadium";
                        break;
                    case 2:
                        name = " Al Bayt Stadium";
                        break;
                    case 3:
                        name = "Khalifa International Stadium";
                        break;
                    case 4:
                        name = "Ahmed bin Ali Stadium";
                        break;
                    case 5:
                        name = "Education City Stadium";
                        break;
                    case 6:
                        name = "Al Thumama Stadium";
                        break;
                    case 7:
                        name = "Al Janoub Stadiums";
                        break;
                    case 8:
                        name = "Stadium 974";
                        break;
                }
                break;
        }
        return name;
    }

    public String getCity() {

        switch (hostCountry.getChooseHost())
        {
            case 1: // England
                switch (getChooseStadium())
                {
                    case 1:
                        city = "London";
                        break;
                    case 2:
                        city = "Manchester";
                        break;
                    case 3:
                        city = "London";
                        break;
                    case 4:
                        city = "London";
                        break;
                    case 5:
                        city = "London";
                        break;
                    case 6:
                        city = "Manchester";
                        break;
                    case 7:
                        city = "Liverpool";
                        break;
                    case 8:
                        city = "Newcastle upon Tyne";
                        break;
                }
                break;
            case 2: // Spain
                switch (getChooseStadium())
                {
                    case 1:
                        city = "Barcelona";
                        break;
                    case 2:
                        city = "Madrid";
                        break;
                    case 3:
                        city = "Madrid";
                        break;
                    case 4:
                        city = "Seville";
                        break;
                    case 5:
                        city = "Barcelona";
                        break;
                    case 6:
                        city = "Seville";
                        break;
                    case 7:
                        city = "Bilbao";
                        break;
                    case 8:
                        city = "Valencia";
                        break;
                }
                break;
            case 3: // Germany
                switch (getChooseStadium())
                {
                    case 1:
                        city = "Dortmund";
                        break;
                    case 2:
                        city = "Munich";
                        break;
                    case 3:
                        city = "Berlin";
                        break;
                    case 4:
                        city = "Gelsenkirchen";
                        break;
                    case 5:
                        city = "Stuttgart";
                        break;
                    case 6:
                        city = "Hamburg";
                        break;
                    case 7:
                        city = "Cologne";
                        break;
                    case 8:
                        city = "Leipzig";
                        break;
                }
                break;
            case 4: // Italy
                switch (getChooseStadium())
                {
                    case 1:
                        city = "Milan";
                        break;
                    case 2:
                        city = "Rome";
                        break;
                    case 3:
                        city = "Neples";
                        break;
                    case 4:
                        city = "Florence";
                        break;
                    case 5:
                        city = "Turin";
                        break;
                    case 6:
                        city = "Genoa";
                        break;
                    case 7:
                        city = "Turin";
                        break;
                    case 8:
                        city = "Bergamo";
                        break;
                }
                break;
            case 5: // France
                switch (getChooseStadium())
                {
                    case 1:
                        city = "Saint-Denis";
                        break;
                    case 2:
                        city = "Marseille ";
                        break;
                    case 3:
                        city = "Lyon";
                        break;
                    case 4:
                        city = "Lille";
                        break;
                    case 5:
                        city = "Paris";
                        break;
                    case 6:
                        city = "Bordeaux";
                        break;
                    case 7:
                        city = "Nice";
                        break;
                    case 8:
                        city = "Lyon ";
                        break;
                }
                break;
            case 6: // Russia
                switch (getChooseStadium())
                {
                    case 1:
                        city = "Moscow";
                        break;
                    case 2:
                        city = "Saint Petersburg";
                        break;
                    case 3:
                        city = "Sochi";
                        break;
                    case 4:
                        city = "Volgograd";
                        break;
                    case 5:
                        city = "Moscow";
                        break;
                    case 6:
                        city = "Kazan";
                        break;
                    case 7:
                        city = "Rostov-on-Don";
                        break;
                    case 8:
                        city = "Samara";
                        break;
                }
                break;

            case 7: // Brazil
                switch (getChooseStadium())
                {
                    case 1:
                        city = "Rio de Janeiro";
                        break;
                    case 2:
                        city = "Brasília";
                        break;
                    case 3:
                        city = "São Paulo";
                        break;
                    case 4:
                        city = "Belo Horizonte";
                        break;
                    case 5:
                        city = "Fortaleza";
                        break;
                    case 6:
                        city = "Porto Alegre";
                        break;
                    case 7:
                        city = "São Paulo";
                        break;
                    case 8:
                        city = "Salvador";
                        break;
                }
                break;
            case 8: // Qatar
                switch (getChooseStadium())
                {
                    case 1:
                        city = "Lusail";
                        break;
                    case 2:
                        city = "Al Khor";
                        break;
                    case 3:
                        city = "Doha";
                        break;
                    case 4:
                        city = "Al Rayyan";
                        break;
                    case 5:
                        city = "Al Rayyan";
                        break;
                    case 6:
                        city = "Doha";
                        break;
                    case 7:
                        city = "Al Wakrah";
                        break;
                    case 8:
                        city = "Doha";
                        break;
                }
                break;
        }
        return city;
    }
    public int getCapacity() {
        switch (hostCountry.getChooseHost())
        {
            case 1: // England
                switch (getChooseStadium())
                {
                    case 1:
                        capacity = 90000;
                        break;
                    case 2:
                        capacity = 74140;
                        break;
                    case 3:
                        capacity = 62303;
                        break;
                    case 4:
                        capacity = 60704;
                        break;
                    case 5:
                        capacity = 60000;
                        break;
                    case 6:
                        capacity = 55107;
                        break;
                    case 7:
                        capacity = 55394;
                        break;
                    case 8:
                        capacity = 52354;
                        break;
                }
                break;
            case 2: // Spain
                switch (getChooseStadium())
                {
                    case 1:
                        capacity = 99354;
                        break;
                    case 2:
                        capacity = 81044;
                        break;
                    case 3:
                        capacity = 68456;
                        break;
                    case 4:
                        capacity = 60720;
                        break;
                    case 5:
                        capacity = 60713;
                        break;
                    case 6:
                        capacity = 57619;
                        break;
                    case 7:
                        capacity = 53331;
                        break;
                    case 8:
                        capacity = 49430;
                        break;
                }
                break;
            case 3: // Germany
                switch (getChooseStadium())
                {
                    case 1:
                        capacity = 81365;
                        break;
                    case 2:
                        capacity = 75000;
                        break;
                    case 3:
                        capacity = 74475;
                        break;
                    case 4:
                        capacity = 62271;
                        break;
                    case 5:
                        capacity = 60449;
                        break;
                    case 6:
                        capacity = 52245;
                        break;
                    case 7:
                        capacity = 49698;
                        break;
                    case 8:
                        capacity = 42959;
                        break;
                }
                break;
            case 4: // Italy
                switch (getChooseStadium())
                {
                    case 1:
                        capacity = 75923;
                        break;
                    case 2:
                        capacity = 70634;
                        break;
                    case 3:
                        capacity = 54726;
                        break;
                    case 4:
                        capacity = 43147;
                        break;
                    case 5:
                        capacity = 41570;
                        break;
                    case 6:
                        capacity = 36599;
                        break;
                    case 7:
                        capacity = 25300;
                        break;
                    case 8:
                        capacity = 21300;
                        break;
                }

                break;
            case 5: // France
                switch (getChooseStadium())
                {
                    case 1:
                        capacity = 80698;
                        break;
                    case 2:
                        capacity = 67394;
                        break;
                    case 3:
                        capacity = 59186;
                        break;
                    case 4:
                        capacity = 50157;
                        break;
                    case 5:
                        capacity = 47929;
                        break;
                    case 6:
                        capacity = 42115;
                        break;
                    case 7:
                        capacity = 35624;
                        break;
                    case 8:
                        capacity = 29778;
                        break;
                }
                break;
            case 6: // Russia
                switch (getChooseStadium())
                {
                    case 1:
                        capacity = 81000;
                        break;
                    case 2:
                        capacity = 68134;
                        break;
                    case 3:
                        capacity = 47659;
                        break;
                    case 4:
                        capacity = 45568;
                        break;
                    case 5:
                        capacity = 45360;
                        break;
                    case 6:
                        capacity = 45379;
                        break;
                    case 7:
                        capacity = 41970;
                        break;
                    case 8:
                        capacity = 45145;
                        break;
                }
                break;
            case 7: // Brazil
                switch (getChooseStadium())
                {
                    case 1:
                        capacity = 78838;
                        break;
                    case 2:
                        capacity = 72788;
                        break;
                    case 3:
                        capacity = 67428;
                        break;
                    case 4:
                        capacity = 62547;
                        break;
                    case 5:
                        capacity = 60348;
                        break;
                    case 6:
                        capacity = 51300;
                        break;
                    case 7:
                        capacity = 49205;
                        break;
                    case 8:
                        capacity = 47907;
                        break;
                }
                break;
            case 8: // Qatar
                switch (getChooseStadium())
                {
                    case 1:
                        capacity = 88000;
                        break;
                    case 2:
                        capacity = 68895;
                        break;
                    case 3:
                        capacity = 45857;
                        break;
                    case 4:
                        capacity = 45032;
                        break;
                    case 5:
                        capacity = 44667;
                        break;
                    case 6:
                        capacity = 44400;
                        break;
                    case 7:
                        capacity = 44325;
                        break;
                    case 8:
                        capacity = 40000;
                        break;
                }
                break;
        }
        return capacity;
    }

    public String toString() {
        return
               getName()
               + " \t" +
               Design.boldText + "city: " + Design.resetColorText + getCity()
                ;
    }
}

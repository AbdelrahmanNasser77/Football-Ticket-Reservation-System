public class MenuStadiums {
    public static void hostCountries ()
    {
        String name = "";
        for (int i = 1; i <= 8; i++) {
            switch (i)
            {
                case 1:
                    name = "England";
                    break;
                case 2:
                    name = "Spain";
                    break;
                case 3:
                    name = "Germany";
                    break;
                case 4:
                    name = "Italy";
                    break;
                case 5:
                    name = "France";
                    break;
                case 6:
                    name = "Russia";
                    break;
                case 7:
                    name = "Brazil";
                    break;
                case 8:
                    name = "Qatar";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.println(name);
        }
    }
    public static void england()
    {
        String name = "";
        String city = "";
        String capacity = "";
        System.out.printf("%-32s%-20s%8s%n" , "\tStadium" , "City" , "Capacity");
        for (int i = 1; i <= 8; i++) {
            switch (i)
            {
                case 1:
                    name = "Wembley Stadium";
                    city = "London";
                    capacity = "90,000";
                    break;
                case 2:
                    name = "Old Trafford";
                    city = "Manchester";
                    capacity = "74,140";
                    break;
                case 3:
                    name = "Tottenham Hotspur Stadium";
                    city = "London";
                    capacity = "62,303";
                    break;
                case 4:
                    name = "Emirates Stadium";
                    city = "London";
                    capacity = "60,704";
                    break;
                case 5:
                    name = "London Stadium";
                    city = "London";
                    capacity = "60,000";
                    break;
                case 6:
                    name = "Etihad Stadium";
                    city = "Manchester";
                    capacity = "55,017";
                    break;
                case 7:
                    name = "Anfield";
                    city = "Liverpool";
                    capacity = "53,394";
                    break;
                case 8:
                    name = "St James' Park";
                    city = "Newcastle upon Tyne";
                    capacity = "52,354";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-30s%-22s%4s%n" , name , city , capacity);
        }
    }

    public static void spain()
    {
        String name = "";
        String city = "";
        String capacity = "";

        System.out.printf("%-34s%-20s%8s%n" , "\tStadium" , "City" , "Capacity");

        for (int i = 1; i <= 8; i++) {
            switch (i)
            {
                case 1:
                    name = "Camp Nou";
                    city = "Barcelona";
                    capacity = "99,354";
                    break;
                case 2:
                    name = "Santiago Bernabéu Stadium";
                    city = "Madrid";
                    capacity = "81,044";
                    break;
                case 3:
                    name = "Metropolitano Stadium";
                    city = "Madrid";
                    capacity = "68,456";
                    break;
                case 4:
                    name = "Estadio Benito Villamarín";
                    city = "Seville";
                    capacity = "60,720";
                    break;
                case 5:
                    name = "Estadi Olímpic Lluís Companys";
                    city = "Barcelona";
                    capacity = "60,713";
                    break;
                case 6:
                    name = "Estadio La Cartuja";
                    city = "Seville";
                    capacity = "57,619";
                    break;
                case 7:
                    name = "San Mamés Stadium";
                    city = "Bilbao";
                    capacity = "53,331";
                    break;
                case 8:
                    name = "Mestalla Stadium";
                    city = "Valencia";
                    capacity = "49,430";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-32s%-22s%4s%n" , name , city , capacity);
        }
    }

    public static void germany()
    {
        String name = "";
        String city = "";
        String capacity = "";
        System.out.printf("%-32s%-20s%8s%n" , "\tStadium" , "City" , "Capacity");
        for (int i = 1; i <= 8; i++) {
            switch (i)
            {
                case 1:
                    name = "Signal Iduna Park";
                    city = "Dortmund";
                    capacity = "81,365";
                    break;
                case 2:
                    name = "Allianz Arena";
                    city = "Munich";
                    capacity = "75,000";
                    break;
                case 3:
                    name = "Olympiastadion";
                    city = "Berlin";
                    capacity = "74,475";
                    break;
                case 4:
                    name = "Veltins-Arena";
                    city = "Gelsenkirchen";
                    capacity = "62,271";
                    break;
                case 5:
                    name = "Mercedes-Benz Arena";
                    city = "Stuttgart";
                    capacity = "60,449";
                    break;
                case 6:
                    name = "Volksparkstadion";
                    city = "Hamburg";
                    capacity = "52,245";
                    break;
                case 7:
                    name = "RheinEnergieStadion";
                    city = "Cologne";
                    capacity = "49,698";
                    break;
                case 8:
                    name = "Red Bull Arena";
                    city = "Leipzig";
                    capacity = "42,959";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-30s%-22s%4s%n" , name , city , capacity);
        }
    }


    public static void italy()
    {
        String name = "";
        String city = "";
        String capacity = "";
        System.out.printf("%-35s%-20s%8s%n" , "\tStadium" , "City" , "Capacity");
        for (int i = 1; i <= 8; i++) {
            switch (i)
            {
                case 1:
                    name = "San Siro";
                    city = "Milan";
                    capacity = "75,923";
                    break;
                case 2:
                    name = "Stadio Olimpico";
                    city = "Rome";
                    capacity = "70,634";
                    break;
                case 3:
                    name = "Stadio San Paolo";
                    city = "Neples";
                    capacity = "54,726";
                    break;
                case 4:
                    name = "Stadio Artemio Franchi";
                    city = "Florence";
                    capacity = "43,147";
                    break;
                case 5:
                    name = "Juventus Stadium";
                    city = "Turin";
                    capacity = "41,570";
                    break;
                case 6:
                    name = "Stadio Luigi Ferraris";
                    city = "Genoa";
                    capacity = "36,599";
                    break;
                case 7:
                    name = "Stadio Olimpico Grande Torino";
                    city = "Turin";
                    capacity = "25,300";
                    break;
                case 8:
                    name = "Stadio Atleti Azzurri d'Italia";
                    city = "Bergamo";
                    capacity = "21,300";
                    break;
            }

            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-34s%-21s%4s%n" , name , city , capacity);
        }
    }
    public static void france()
    {

        String name = "";
        String city = "";
        String capacity = "";

        System.out.printf("%-32s%-20s%8s%n" , "\tStadium" , "City" , "Capacity");

        for (int i = 1; i <= 8 ; i++) {
            switch (i)
            {
                case 1:
                    name = "Stade de France";
                    city = "Saint-Denis";
                    capacity = "80,698";
                    break;
                case 2:
                    name = "Stade Vélodrome";
                    city = "Marseille ";
                    capacity = "67,394";
                    break;
                case 3:
                    name = "Parc Olympique Lyonnais";
                    city = "Lyon";
                    capacity = "59,186";
                    break;
                case 4:
                    name = "Stade Pierre-Mauroy";
                    city = "Lille";
                    capacity = "50,157";
                    break;
                case 5:
                    name = "Parc des Princes";
                    city = "Paris";
                    capacity = "47,929";
                    break;
                case 6:
                    name = "Matmut Atlantique";
                    city = "Bordeaux";
                    capacity = "42,115";
                    break;
                case 7:
                    name = "Allianz Riviera";
                    city = "Nice";
                    capacity = "35,624";
                    break;
                case 8:
                    name = "Roazhon Park";
                    city = "Lyon ";
                    capacity = "29,778";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-30s%-22s%4s%n" , name , city , capacity);
        }
    }

    public static void russia()
    {
        String name = "";
        String city = "";
        String capacity = "";
        System.out.printf("%-33s%-20s%8s%n" , "\tStadium" , "City" , "Capacity");

        for (int i = 1; i <= 8; i++) {
            switch (i)
            {
                case 1:
                    name = "Luzhniki Stadium";
                    city = "Moscow";
                    capacity = "81,000";
                    break;
                case 2:
                    name = "Saint Petersburg Stadium";
                    city = "Saint Petersburg";
                    capacity = "68,134";
                    break;
                case 3:
                    name = "Fisht Olympic Stadium";
                    city = "Sochi";
                    capacity = "47,659";
                    break;
                case 4:
                    name = "Volgograd Arena";
                    city = "Volgograd";
                    capacity = "45,568";
                    break;
                case 5:
                    name = "Otkrytie Arena";
                    city = "Moscow";
                    capacity = "45,360";
                    break;
                case 6:
                    name = "Kazan Arena";
                    city = "Kazan";
                    capacity = "45,379";
                    break;
                case 7:
                    name = "Rostov Arena";
                    city = "Rostov-on-Don";
                    capacity = "41,970";
                    break;
                case 8:
                    name = "Samara Arena";
                    city = "Samara";
                    capacity = "45,145";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-32s%-21s%4s%n" , name , city , capacity);
        }
    }

    public static void brazil()
    {
        String name = "";
        String city = "";
        String capacity = "";
        System.out.printf("%-40s%-22s%8s%n", "\tStadium", "City", "Capacity");

        for (int i = 1; i <= 8; i++) {
            switch (i)
            {
                case 1:
                    name = "Maracanã Stadium";
                    city = "Rio de Janeiro";
                    capacity = "78,838";
                    break;
                case 2:
                    name = "Estádio Nacional Mané Garrincha";
                    city = "Brasília";
                    capacity = "72,788";
                    break;
                case 3:
                    name = "Morumbi Stadium";
                    city = "São Paulo";
                    capacity = "67,428";
                    break;
                case 4:
                    name = "Mineirão";
                    city = "Belo Horizonte";
                    capacity = "62,547";
                    break;
                case 5:
                    name = "Castelão";
                    city = "Fortaleza";
                    capacity = "60,348";
                    break;
                case 6:
                    name = "Beira-Rio Stadium";
                    city = "Porto Alegre";
                    capacity = "51,300";
                    break;
                case 7:
                    name = "Arena Corinthians";
                    city = "São Paulo";
                    capacity = "49,205";
                    break;
                case 8:
                    name = "Fonte Nova Arena";
                    city = "Salvador";
                    capacity = "47,907";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-36s%-26s%4s%n" , name , city , capacity);


        }
    }

    public static void qatar()
    {

        String name = "";
        String city = "";
        String capacity = "";
        System.out.printf("%-33s%-20s%8s%n" , "\tStadium" , "City" , "Capacity");

        for (int i = 1; i <= 8; i++) {

            switch (i)
            {
                case 1:
                    name = "Lusail Iconic Stadium";
                    city = "Lusail";
                    capacity = "88,000";
                    break;
                case 2:
                    name = "Al Bayt Stadium";
                    city = "Al Khor";
                    capacity = "68,895";
                    break;
                case 3:
                    name = "Khalifa International Stadium";
                    city = "Doha";
                    capacity = "45,857";
                    break;
                case 4:
                    name = "Ahmed bin Ali Stadium";
                    city = "Al Rayyan";
                    capacity = "45,032";
                    break;
                case 5:
                    name = "Education City Stadium";
                    city = "Al Rayyan";
                    capacity = "44,667";
                    break;
                case 6:
                    name = "Al Thumama Stadium";
                    city = "Doha";
                    capacity = "44,400";
                    break;
                case 7:
                    name = "Al Janoub Stadiums";
                    city = "Al Wakrah";
                    capacity = "44,325";
                    break;
                case 8:
                    name = "Stadium 974";
                    city = "Doha";
                    capacity = "40,000";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-32s%-21s%4s%n" , name , city , capacity);
        }

    }



}

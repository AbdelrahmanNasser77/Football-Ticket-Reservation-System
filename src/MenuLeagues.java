public class MenuLeagues {
    static String leagueName = "";
    static String country = "";

    public static void europe()
    {
        System.out.printf("%-30s%-1s%n" , "\t\tLeague " , "country");
        for (int i = 1; i <= 9; i++) {
            switch (i)
            {
                case 1:
                    leagueName = "Premier League";
                    country = "England";
                    break;
                case 2:
                    leagueName = "La Liga";
                    country = "Spain";
                    break;
                case 3:
                    leagueName = "Bundesliga";
                    country = "Germany";
                    break;
                case 4:
                    leagueName = "Serie A";
                    country = "Italy";
                    break;
                case 5:
                    leagueName = "Ligue 1";
                    country = "France" ;
                    break;
                case 6:
                    leagueName = "Eredivisie";
                    country = "Netherlands";
                    break;
                case 7:
                    leagueName = "Primeira Liga";
                    country = "Portugal";
                    break;
                case 8:
                    leagueName = "Süper Lig";
                    country = "Turkey";
                    break;
                case 9:
                    leagueName = "Russian Premier League";
                    country = "Russia";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-29s%-1s%n" , leagueName , country);
        }
    }
    public static void africa()
    {
        System.out.printf("%-36s%-1s%n" , "\t\tLeague " , "country");
        for (int i = 1; i <= 5; i++) {
            switch (i)
            {
                case 1:
                    leagueName = "Egyptian Premier League";
                    country = "Egypt";
                    break;
                case 2:
                    leagueName = "Botola Pro 1";
                    country = "Morocco";
                    break;
                case 3:
                    leagueName = "Tunisian Ligue Professionnelle 1";
                    country = "Tunisia";
                    break;
                case 4:
                    leagueName = "Algerian Ligue Professionnelle 1";
                    country = "Algeria";
                    break;
                case 5:
                    leagueName = "South African Premier Division";
                    country = "South Africa";
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-35s%-1s%n" , leagueName , country);
        }
    }
    public static void asia()
    {
        System.out.printf("%-34s%-1s%n" , "\t\tLeague " , "country");
        for (int i = 1; i <= 4; i++) {
            switch (i)
            {
                case 1:
                    leagueName = "Saudi Professional League";
                    country = "Saudi Arabia";
                    break;
                case 2:
                    leagueName = "UAE Pro League";
                    country = "United Arab Emirates";
                    break;
                case 3:
                    leagueName = "Qatar Stars League";
                    country = "Qatar";
                    break;
                case 4:
                    leagueName = "K League 1";
                    country = "South Korea";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-35s%-1s%n" , leagueName , country);
        }
    }
    public static void southAmerica()
    {
        System.out.printf("%-33s%-1s%n" , "\t\tLeague " , "country");
        for (int i = 1; i <= 4; i++) {
            switch (i)
            {
                case 1:
                    leagueName = "Argentine Primera División";
                    country = "Argentina";
                    break;
                case 2:
                    leagueName = "Campeonato Brasileiro Série A";
                    country = "Brazil";
                    break;
                case 3:
                    leagueName = "Primera División de Chile";
                    country = "Chile";
                    break;
                case 4:
                    leagueName = "Categoría Primera A";
                    country = "Colombia";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-35s%-1s%n" , leagueName , country);
        }
    }
    public static void northAmerica()
    {
        System.out.printf("%-34s%-1s%n" , Design.boldText + "\tLeague " , "country" + Design.resetColorText);

        for (int i = 1; i <= 4; i++) {
            switch (i)
            {
                case 1:
                    leagueName = "Liga MX";
                    country = "Mexico";
                    break;
                case 2:
                    leagueName = "MLS";
                    country = "United States";
                    break;
                case 3:
                    leagueName = "Liga FPD";
                    country = "Costa Rica";
                    break;
                case 4:
                    leagueName = "Canadian Premier League";
                    country = "Canada";
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
            System.out.printf("%-29s%-1s%n" , leagueName , country);
        }
    }
}

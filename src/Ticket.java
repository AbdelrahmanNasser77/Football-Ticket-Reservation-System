public class Ticket {

    private int chooseMatch;
    private int chooseCategory;
    private String category = "";
    private double minPrice;
    private double quantity;
    private HostCountry hostCountry;
    private MatchDetails matchDetails;
    private ChampionshipSystem championshipSystem;

    public void setChooseMatch(int chooseMatch) {
        this.chooseMatch = chooseMatch;
    }

    public int getChooseMatch() {
        chooseMatch -= 1;
        return chooseMatch;
    }

    public void setHostCountry(HostCountry hostCountry) {
        this.hostCountry = hostCountry;
    }

    public void setChampionshipSystem(ChampionshipSystem championshipSystem) {
        this.championshipSystem = championshipSystem;
    }

    public void setMatchDetails(MatchDetails matchDetails) {
        this.matchDetails = matchDetails;
    }

    public void setChooseCategory(int chooseCategory) {
        this.chooseCategory = chooseCategory;
    }
    public int getChooseCategory(){
        return chooseCategory;
    }

    public String getCategory() {
        switch (getChooseCategory())
        {
            case 1:
                category = "A" + Random.getRandomNumberCategoryA();
                break;
            case 2:
                category = "B"+ Random.getRandomNumberCategoryB();
                break;
            case 3:
                category = "C" + Random.getRandomNumberCategoryC();
                break;
        }
        return category;
    }


    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void MenuCategory()
    {
        System.out.printf("%-10s%-15s%-1s%n" , "" , "Category" , "Price/Ticket");

        for (int i = 1; i <= 3; i++) {
            String category = "";
            String priceEach = "";
            switch (i)
            {
                case 1:
                    category = "A";
                    priceEach = String.valueOf((getMinPrice() * 4));
                    break;
                case 2:
                    category = "B";
                    priceEach = String.valueOf((getMinPrice() * 2.5));
                    break;
                case 3:
                    category = "C";
                    priceEach = String.valueOf(getMinPrice());
                    break;
            }
            System.out.printf("%-10s%-15s%-1s%n" , "[" + i + "]" , category , priceEach);
        }
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return
                Design.centerText + Design.boldText +  championshipSystem.getRegionChampionship() + " " + hostCountry + Design.resetColorText + " " + Design.orangeText +  championshipSystem.getYear() + Design.resetColorText + "™" + "\n" +
                matchDetails + "\n" +
                Design.boldText + "Category: " + Design.resetColorText + getChooseCategory() + "\n" +
                Design.boldText  + "Seat Number: " + Design.resetColorText + getCategory() + "\n" +
                Design.boldText + "Quantity of Tickets: " + Design.resetColorText + getQuantity() + "\n"
                ;
    }
}


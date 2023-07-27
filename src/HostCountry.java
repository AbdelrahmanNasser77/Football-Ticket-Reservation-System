public class HostCountry {
    private int chooseHost;
    private String name;

    public void setChooseHost(int chooseHost) {
        this.chooseHost = chooseHost;
    }

    public int getChooseHost() {
        return chooseHost;
    }

    public String getName() {
        switch (getChooseHost())
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

        return name;
    }

    @Override
    public String toString() {
        return
                Design.blueText + getName() + Design.resetColorText;
    }
}

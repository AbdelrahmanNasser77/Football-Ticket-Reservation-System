public class Date {
    private int year;
    private int month;
    private int day;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getMonth() {
        String Month = "";

        switch (month)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                Month += "0";
        }
        Month += String.valueOf(month);

        return Month;

    }

    public void setDay(int day) {
        this.day = day;
    }

    public String  getDay() {
        String Day = "";
        switch (day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                Day += "0";
        }
        Day += String.valueOf(day);
        return Day;
    }


    @Override
    public String toString() {
        return  Design.boldText + "Date: " + Design.resetColorText +
                getDay() +
                "/" + getMonth()+
                "/" + getYear()
                ;
    }
}

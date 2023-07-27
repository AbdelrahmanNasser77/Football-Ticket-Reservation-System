public class Time {
    private int startHour;
    private int startMin;

    private String StartMinute;


    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public String getStartHour() {
        return String.valueOf(startHour);
    }

    public void setStartMin(int startMin) {
        this.startMin = startMin;
    }

    public int getStartMin() {
        return startMin;
    }

    public String getStartMinute() {
        if (getStartMin() == 0)
            StartMinute = "00";
        else
            StartMinute = String.valueOf(startMin);

        return StartMinute;
    }

    @Override
    public String toString() {
        return  Design.boldText +"Kick off: " + Design.resetColorText  +
                getStartHour() +
                ":" + getStartMinute()
                ;
    }
}

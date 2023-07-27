public class QualifiedFan extends Person{
    private String name;
    private int ID;
    private String nationality;
    private Ticket ticket;


    public void setAgeQualified(int Age)
    {
        this.Age = Age;
    }

    public int getAgeQualified() {
        return Age;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return
                ticket +
                Design.boldText + "Name: " + Design.resetColorText + name + "\n" +
                Design.boldText + "Age:  " + Design.resetColorText +  getAgeQualified() + "\n" +
                Design.boldText + "Nationality: " + Design.resetColorText +  getNationality() + "\n" +
                Design.boldText + "ID: " + Design.resetColorText + ID + "\n"
                ;
    }
}

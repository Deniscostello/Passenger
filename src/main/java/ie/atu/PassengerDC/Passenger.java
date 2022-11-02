package ie.atu.PassengerDC;

public class Passenger {
    private String Title;
    private String Name;
    private String ID;
    private String Phone;
    private int Age;

    public Passenger(String title, String Name, String ID, String Phone, int Age){
        setTitle(title);
        this.Name = Name;
        this.ID = ID;
        this.Phone = Phone;
        this.Age = Age;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        if("Mr".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title)){
            Title = title;
        }
       else{
           throw new IllegalArgumentException("Please enter 'Mr' , 'Mrs' or 'Ms' ");
        }
    }
}

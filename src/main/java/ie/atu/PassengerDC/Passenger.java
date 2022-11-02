package ie.atu.PassengerDC;

public class Passenger {
    private String Title;
    private String Name;
    private String ID;
    private String Phone;
    private int Age;

    public Passenger(String title, String Name, String ID, String Phone, int Age){
        setTitle(title);
        setName(Name);
        this.ID = ID;
        this.Phone = Phone;
        this.Age = Age;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        int nameSize = name.length();
        if(nameSize > 2){
            Name = name;
        }
        else{
            throw new IllegalArgumentException("Name must be a minimum of 3 characters");
        }
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

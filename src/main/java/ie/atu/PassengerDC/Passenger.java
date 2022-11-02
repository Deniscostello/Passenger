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
        setID(ID);
        setPhone(Phone);
        setAge(Age);
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        int idSize = ID.length();
        if(idSize > 9){
            this.ID = ID;
        }
        else{
            throw new IllegalArgumentException("ID must be a minimum of 10 characters");
        }
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        int phoneSize = phone.length();
        if(phoneSize > 6) {
            Phone = phone;
        }
        else{
            throw new IllegalArgumentException("Phone number must be 7 characters minimum");
        }
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if(age > 16) {
            Age = age;
        }
        else{
            throw new IllegalArgumentException("Must be over 16 to fly");
        }
    }
}

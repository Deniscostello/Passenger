package ie.atu.PassengerDC;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    //Passenger pass1;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testTitleSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678", 20);
        assertEquals("Mr", pass1.getTitle());
    }

    @Test
    void testTitleFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> {new Passenger("M", "Denis", "12345678910", "12345678", 20);});
        assertEquals("Please enter 'Mr' , 'Mrs' or 'Ms' ", exMessage.getMessage());
    }

    @Test
    void testNameSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678", 20);
        assertEquals("Denis", pass1.getName());
    }

    @Test
    void testNameFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> {new Passenger("Mr", "De", "12345678910", "12345678", 20);});
        assertEquals("Name must be a minimum of 3 characters", exMessage.getMessage());
    }

    @Test
    void testIDSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678", 20);
        assertEquals("12345678910", pass1.getID());
    }

    @Test
    void testIDFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> {new Passenger("Mr", "Denis", "12345", "12345678", 20);});
        assertEquals("ID must be a minimum of 10 characters", exMessage.getMessage());
    }

    @Test
    void testPhoneSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678", 20);
        assertEquals("12345678", pass1.getPhone());
    }

    @Test
    void testPhoneFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{new Passenger("Mr", "Denis","12345678910", "1234", 20);});
        assertEquals("Phone number must be 7 characters minimum", exMessage.getMessage());
    }

    @Test
    void testAgeSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678",20);
        assertEquals(20, pass1.getAge());
    }

    @Test
    void testAgeFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> {new Passenger("Mr", "Denis", "12345678910", "12345678", 2);});
        assertEquals("Must be over 16 to fly", exMessage.getMessage());
    }
    @AfterEach
    void tearDown() {
    }
}
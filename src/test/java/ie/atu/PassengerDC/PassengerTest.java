package ie.atu.PassengerDC;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger pass1;

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
    @AfterEach
    void tearDown() {
    }
}
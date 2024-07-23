package AirTrip;

import Session6.Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class AirTrip {
    private String destination;
    private Integer flightNumber;
    private String flightTime;
    public  String flightStatus;
    private  int AircraftCapacity=289;

    public  void flightStatusTime() throws IOException {
        System.out.println("Pls Enter flightTime");
        String result = Input();
        System.out.println("WhenWasTheFlight?");
        String UserInput=Input();
        if(UserInput.equals(result)){
            flightStatus="The Flight Was On Tme";
            System.out.println(flightStatus);
        }
        else if(!UserInput.equals(result)){
            flightStatus="The Flight Was Off Tme";
            System.out.println(flightStatus);
        }
        else {
            System.out.println("TheFlightHasTakenOff");
        }

    } //وضعیت تاخیر پرواز

    private static String Input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result=reader.readLine();
        return result;
    }  //متد دریاقت ورودی از کاربر


    public void FlightStatusOfTheAircraft() throws IOException {
        System.out.println("Pls Enter flightCapacity");
        Integer Capacity = Integer.valueOf(Input());
        if(Capacity==AircraftCapacity){
            flightStatus="Full Capacity";
            System.out.println("The AirPlain Status is "+ flightStatus); // مسافرگیری انجام شد
        }
        else {
            flightStatus="Not Full Capacity";
            System.out.println("The AirPlain Status is "+flightStatus); //هواپیما در حال مسافر گیری
        }
    }//وضعیت پرواز هواپیما
public void ChengStatus(){

}

}

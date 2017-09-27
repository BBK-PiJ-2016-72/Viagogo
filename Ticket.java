/**
 * Created by mmkeri on 27/09/2017.
 */
public class Ticket {

    private double price;
    private int eventCode;

    public Ticket(double price, int eventCode){
        this.price = price;
        this.eventCode = eventCode;
    }

    public double getPrice(){
        return price;
    }

    public int getEventCode(){
        return eventCode;
    }
}

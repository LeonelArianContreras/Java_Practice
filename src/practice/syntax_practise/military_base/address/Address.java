package practice.syntax_practise.military_base.address;

public class Address {

    private String street; // Just for filling
    private String city; // Just for filling
    private String state; // Just for filling
    private double latitude;
    private double longitude;

    public Address(String street, String city, String state, double latitude, double longitude) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
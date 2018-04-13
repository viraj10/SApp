package societyapp.model;

import societyapp.valueType.PropertyDetails;

public class Address {
    private final String DEFAULT_STATE = "MAHARASHTRA";
    private final String DEFAULT_COUNTRY = "INDIA";

    private String streetAddress;
    private String town;
    private String state;
    private String country;
    private int pincode;

    public Address(String streetAddress, String town, String state, String country, int pincode) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public Address(String streetAddress, String town, int pincode) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.pincode = pincode;
        country=DEFAULT_COUNTRY;
        state=DEFAULT_STATE;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getTown() {
        return town;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getPincode() {
        return pincode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Address address = (Address) o;
        String lowerCaseAddress1 = address.toString().toLowerCase();
        String lowerCaseAddress2 = toString().toLowerCase();
        return lowerCaseAddress1.equals(lowerCaseAddress2);
    }

    @Override
    public int hashCode() {
        int result = streetAddress.hashCode();
        result = 31 * result + town.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + pincode;
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", town='" + town + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public static Address extractPropertyDetails(PropertyDetails propertyDetails, Society society) {
        Address socAdd = society.getAddress();
        Address address = new Address(propertyDetails.toString()+socAdd.getStreetAddress(),
                socAdd.town,
                socAdd.state,
                socAdd.country,
                socAdd.pincode);
        return address;
    }
}

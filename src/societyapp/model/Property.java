package societyapp.model;

import societyapp.valueType.PropertyDetails;
import societyapp.valueType.Term;

import java.util.Map;
import java.util.TreeMap;

public class Property {

    private Society society;
    private TreeMap<Term,Member> termOwnerMap;
    private TreeMap<Term,Member> termTenantMap;
    private PropertyDetails propertyDetails;


    public void changeTenant()
    {
    //TODO update term object
    }

    public void changeOwner()
    {
    //TODO update term object
    }

    public boolean isCurrentOwner(Member member) {
        //check is rented and last owner is member?
        //TODO update term object
        return false;
    }

    public boolean isCurrentTenant(Member member) {
        //check is rented and last owner is member?
     //search   termMemberMap where currentterm true;
        return false;
    }

    public Address getAddress() {
        return Address.extractPropertyDetails(propertyDetails,society);
    }
}

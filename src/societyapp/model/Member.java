package societyapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**there are two types of members one is tenant another is owner
*
* */
public abstract class Member {

    private String firstName;
    private String lastName;
    private List<IdentityNumbers> identityNumbersList;
    private String email;
    /*depending on @staysInSociety we can either retrieve address from property
    * or give the stored on.*/
    private Address address;

    /*if member staysInSociety than check this properties
    if they are rented and dates of ownership*/
    private List<Property> propertyList;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<IdentityNumbers> getIdentityNumbersList() {
        return identityNumbersList;
    }

    public void addToIdentityNumbersList(IdentityNumbers identityNumber) {
        if (this.identityNumbersList == null)
            this.identityNumbersList = new ArrayList<>();
        this.identityNumbersList.add(identityNumber);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress(){
        return address;
    }

    public abstract Address getContactAddress(); /*{
        //if (staysInSociety) {
            Optional<Property> property = propertyList.stream().
                    filter(p -> p.isCurrentOwner(this)).
                    findFirst();
            property.orElseThrow(() -> new IllegalStateException("Member does not stay in society"));
            return property.get().getAddress();
        //}
        //return address;
    }*/

    public void setAddress(Address address) {
        this.address = address;
    }


    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }
}

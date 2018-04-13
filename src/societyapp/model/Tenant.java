package societyapp.model;

public class Tenant extends Member {
    @Override
    public Address getContactAddress() {
        return getAddress();
    }
}

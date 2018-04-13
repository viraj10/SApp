package societyapp.model;

import java.util.Optional;

public class Owner extends Member {

    private boolean staysInSociety;

    public boolean isStaysInSociety() {
        return staysInSociety;
    }

    public void setStaysInSociety(boolean staysInSociety) {
        this.staysInSociety = staysInSociety;
    }

    @Override
    public Address getContactAddress() {
        {
            if (staysInSociety) {
                Optional<Property> property = getPropertyList().stream().
                        filter(p -> p.isCurrentOwner(this)).
                        findFirst();
                property.orElseThrow(() -> new IllegalStateException("Member does not stay in society"));
                return property.get().getAddress();
            }
            return getAddress();
        }
    }
}

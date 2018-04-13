package societyapp.valueType;

public class PropertyDetails {

    /**
     * flat number or equvivalent
     */
    private String propertyId;

    private String buildingNumber;

    private Integer floor;

    private String wing;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PropertyDetails)) return false;

        PropertyDetails that = (PropertyDetails) o;

        if (!propertyId.equals(that.propertyId)) return false;
        if (buildingNumber != null ? !buildingNumber.equals(that.buildingNumber) : that.buildingNumber != null)
            return false;
        if (floor != null ? !floor.equals(that.floor) : that.floor != null) return false;
        return wing != null ? wing.equals(that.wing) : that.wing == null;
    }

    @Override
    public int hashCode() {
        int result = propertyId.hashCode();
        result = 31 * result + (buildingNumber != null ? buildingNumber.hashCode() : 0);
        result = 31 * result + (floor != null ? floor.hashCode() : 0);
        result = 31 * result + (wing != null ? wing.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PropertyDetails{" +
                "propertyId= " + propertyId +
                (buildingNumber != null ? ", buildingNumber=" + buildingNumber : "") +
                (floor != null ? ", floor=" + floor : "") +
                (wing != null ? ", wing= " + wing : "") +
                "}";
    }
}

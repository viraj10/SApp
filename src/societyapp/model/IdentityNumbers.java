package societyapp.model;

public class IdentityNumbers {

    /*can this be enum?? will it limit user functionality*/
    public static final String PAN = "PAN";
    public static final String AADHAR = "Aadhar";
    public static final String ELECTION_ID = "Election card";
    public static final String DRIVING_LICENSE = "Driving License";

    /*PAN or Aadhar or user defined*/
    private String identificationType;
    private String identificationNumber;

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdentityNumbers)) return false;

        IdentityNumbers that = (IdentityNumbers) o;

        if (!identificationType.equals(that.identificationType)) return false;
        return identificationNumber.equals(that.identificationNumber);
    }

    @Override
    public int hashCode() {
        int result = identificationType.hashCode();
        result = 31 * result + identificationNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "IdentityNumbers{" +
                "identificationType='" + identificationType + '\'' +
                ", identificationNumber='" + identificationNumber + '\'' +
                '}';
    }
}

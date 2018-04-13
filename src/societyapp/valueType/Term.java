package societyapp.valueType;

import java.time.LocalDate;

public class Term implements Comparable {

    /**Mandatory field*/
    private LocalDate startDate;

    /**if null points to present*/
    private LocalDate endDate;

    private Boolean currentTerm;


    public Term(LocalDate startDate) {
        this.startDate = startDate;
        currentTerm = Boolean.TRUE;
    }

    public Term(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Term)) return false;

        Term term = (Term) o;

        if (!startDate.equals(term.startDate)) return false;
        return endDate != null ? endDate.equals(term.endDate) : term.endDate == null;
    }

    @Override
    public int hashCode() {
        int result = startDate.hashCode();
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Term{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Term otherTerm= (Term) o;
        if(this.currentTerm && otherTerm.currentTerm)
            return 0;
        if (this.currentTerm)
            return 1;
        if (otherTerm.currentTerm)
            return -1;

        return this.endDate.compareTo(otherTerm.endDate);
    }
}

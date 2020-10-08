package day59_OOPReview;

import java.time.LocalDate;

public class Encapsulation {

    private int ssn;
    private  final LocalDate published = LocalDate.of(2020,9,8);
    // we cannot create setters for final variables

    public int getSsn(){  // READ-ONLY
        return ssn;
    }

    public void setSsn(int ssn){    // MODIFY-ONLY
        this.ssn = ssn;
    }

    public LocalDate getPublished() {
        return published;
    }
}

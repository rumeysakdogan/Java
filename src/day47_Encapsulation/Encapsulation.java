package day47_Encapsulation;

public class Encapsulation {

    private long ssn = 12345678;


    public long getSsn(){   // to read ONLY
        return ssn;
    }

    public void setSsn(long ssn){   // to modify ONLY
        this.ssn = ssn;
    }
}

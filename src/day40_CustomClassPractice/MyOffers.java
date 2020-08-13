package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();


        offer1.setOfferInfo(100000,"VA", true, true, true, "SDET", true);
        offer2.setOfferInfo(120000,"VA", true, true, true, "SDET", false);
        offer3.setOfferInfo(112000,"TX", true, false, false, "SDET", true);
        offer4.setOfferInfo(130000,"VA", false, true, true, "QA", true);
        offer5.setOfferInfo(115000,"VA", true, true, true, "QA", true);
        offer6.setOfferInfo(100500,"CA", true, false, false, "Senior SDET", true);
        offer7.setOfferInfo(110000,"TX", true, true, true, "QA", false);

        ArrayList<Offer> jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        for (Offer each : jobOffers){
            each.getOfferInfo();
        }

//        jobOffers.removeIf(p -> p.salary < 110000);
//        System.out.println( "Number of offers: " + jobOffers.size() );

//        String myLocation = "VA";
//        jobOffers.removeIf(p -> p.salary < 110500 || !p.state.equals(myLocation));
//        System.out.println( "Number of offers: " + jobOffers.size() );

        jobOffers.removeIf(p -> p.hasPTO == false || p.isFullTime == false || p.hasBenefit == false);
        System.out.println( "Number of offers: " + jobOffers.size() );
    }
}

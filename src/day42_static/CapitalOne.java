package day42_static;
/*
 1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
                    Answer the interview question "Tell me about your scrum team"
 */
public class CapitalOne {

    public static void main(String[] args) {

        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Ramazan", "Hamit", "Ismail");

        Testers[] testers = { new Testers(), new Testers(), new Testers()};
            testers[0].setInfo("Bulent",'M',1891l,"SDET",120000);
            testers[1].setInfo("Altynai",'F',1768l,"SDET",110000);
            testers[2].setInfo("Shirzat",'M',1564l,"QA",100000);
//            testers[3].setInfo("Dusan",'M',,"QA",105000);
//            testers[4].setInfo("Burcu",'F',,"SDET",110000);

        Developers[] developers = { new Developers(), new Developers(), new Developers(), new Developers(), new Developers() };
            developers[0].setInfo("Cihat",'M',2008l,"Frontend Dev",150000);
            developers[1].setInfo("Rumeysa",'F',2187l,"Fullstack Dev",170000);
            developers[2].setInfo("Ibrahim",'M',2035l,"Backend Dev",150000);
            developers[3].setInfo("Vlad",'M',2009l,"Fullstack Dev",180000);
            developers[4].setInfo("Roman",'M',2007l,"Frontend Dev",160000);


        team1.addTesters(testers);
        team1.addDevelopers(developers);

        System.out.println( team1 );
    }
}

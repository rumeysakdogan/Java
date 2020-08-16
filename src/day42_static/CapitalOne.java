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

        System.out.println("=====================================================");

        for( Testers each : team1.testers){
            System.out.println(each.name+" : $"+each.salary);
        }
        System.out.println("=====================================================");

        for( Developers each : team1.developers){
            System.out.println(each.name+" : $"+each.salary);
        }
        System.out.println("=====================================================");

        team1.removeTester(1891);
        team1.removeDeveloper(2007);
        team1.removeDeveloper(2035);
        System.out.println( team1 );

        System.out.println("=====================================================");

        Developers dev1 = new Developers();
            dev1.setInfo("Burak",'M',6543L,"Frontend Dev",153000);
        team1.addDeveloper(dev1);
        System.out.println( team1 );

        System.out.println("=====================================================");

        ScrumTeam[] scrumTeams = { team1, new ScrumTeam(), new ScrumTeam() };
        /*
        print all the devs and testers from scrum team
        find maximum salary of devs, maximum salary of testers
         */

//        scrumTeams[1].addDevelopers(devs);
//
//        Developers[] devs = {new Developers(), new Developers(), new Developers(), new Developers(), new Developers()};
//            dev2.setInfo("Ali",'M',2018l,"Frontend Dev",150000);
//            devs[1].setInfo("John",'M',2237l,"Fullstack Dev",179000);
//            devs[2].setInfo("Hasan",'M',2085l,"Backend Dev",165000);
//            devs[3].setInfo("Cindy",'F',2709l,"Fullstack Dev",180000);
//            devs[4].setInfo("Kyle",'M',2000l,"Frontend Dev",165000);
//
//        scrumTeams[2].addDevelopers(developers2);
//
//        Developers[] developers2 = {new Developers(), new Developers(), new Developers(), new Developers(), new Developers()};
//            developers2[0].setInfo("Cihat",'M',2908l,"Frontend Dev",150000);
//            developers2[1].setInfo("Rumeysa",'F',2587l,"Fullstack Dev",170000);
//            developers2[2].setInfo("Tuba",'F',2135l,"Backend Dev",158000);
//            developers2[3].setInfo("Vlad",'M',2209l,"Fullstack Dev",180000);
//            developers2[4].setInfo("Rama",'F',2307l,"Frontend Dev",148000);

    }
}

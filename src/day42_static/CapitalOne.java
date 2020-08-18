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
            testers[1].setInfo("Altynai",'F',1768l,"SDET",113000);
            testers[2].setInfo("Shirzat",'M',1564l,"QA",100000);


        Developers[] developers = { new Developers(), new Developers(), new Developers(), new Developers(), new Developers() };
            developers[0].setInfo("Cihat",'M',2008l,"Frontend Dev",150000);
            developers[1].setInfo("Rumeysa",'F',2187l,"Fullstack Dev",170000);
            developers[2].setInfo("Ibrahim",'M',2035l,"Backend Dev",150000);
            developers[3].setInfo("Vlad",'M',2009l,"Fullstack Dev",189000);
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



        Developers[] devs = {new Developers(), new Developers(), new Developers(), new Developers(), new Developers()};
            devs[0].setInfo("Ali",'M',2018l,"Frontend Dev",150000);
            devs[1].setInfo("John",'M',2237l,"Fullstack Dev",179000);
            devs[2].setInfo("Hasan",'M',2085l,"Backend Dev",165000);
            devs[3].setInfo("Cindy",'F',2709l,"Fullstack Dev",180000);
            devs[4].setInfo("Kyle",'M',2000l,"Frontend Dev",165000);

        Testers[] tests = { new Testers(), new Testers() };
            tests[0].setInfo("Dusan",'M',2435l,"QA",105000);
            tests[1].setInfo("Burcu",'F',3242,"SDET",110000);

        scrumTeams[1].addDevelopers(devs);
        scrumTeams[1].addTesters(tests);


        Developers[] developers2 = {new Developers(), new Developers(), new Developers(), new Developers(), new Developers()};
            developers2[0].setInfo("Agit",'M',2908l,"QA",130000);
            developers2[1].setInfo("Daniella",'F',2587l,"Fullstack SDET",110000);
            developers2[2].setInfo("Tom",'M',2135l,"SDET",128000);

        Testers[] testers2 = { new Testers()};
            tests[0].setInfo("Samuel",'M',2435l,"QA",102000);

        scrumTeams[2].addDevelopers(developers2);
        scrumTeams[2].addTesters(testers2);

// max salary of testers:

        double maxTsalary = scrumTeams[0].testers.get(0).salary;

        for (int i = 0; i < scrumTeams.length; i++) {
            for ( Testers each : scrumTeams[i].testers) {
                if (each.salary > maxTsalary) {
                    maxTsalary = each.salary;
                }
            }
        }

        for (int i = 0; i < scrumTeams.length; i++) {
            for ( Testers each : scrumTeams[i].testers) {
                if (each.salary == maxTsalary) {
                    System.out.println( each.name + " : " + each.salary);
                }
            }
        }

        System.out.println("=====================================================");

// max salary of developers:

        double maxDsalary = scrumTeams[0].developers.get(0).salary;

        for (int i = 0; i < scrumTeams.length; i++) {
            for ( Developers each : scrumTeams[i].developers) {
                if (each.salary > maxDsalary) {
                    maxDsalary = each.salary;
                }
            }
        }

        for (int i = 0; i < scrumTeams.length; i++) {
            for ( Developers each : scrumTeams[i].developers) {
                if (each.salary == maxDsalary) {
                    System.out.println( each.name + " : " + each.salary);
                }
            }
        }


    }
}

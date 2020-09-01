package day49_Inheritance.scrumTeamTask;


/*
  create a class called AppleInc:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
public class AppleInc {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Bulent", 27, 'M', 115000,123,"SDET");
        Tester tester2 = new Tester("Altynai", 25, 'F', 100000, 124,"SDET");

        Tester[] testers = { tester1, tester2};

        Developer developer1 = new Developer("Vlad", 26, 'M', 150000, 125, "Front-End Dev");
        Developer developer2 = new Developer("Cihat", 26, 'M', 140000, 126, "Front-End Dev");
        Developer developer3 = new Developer("Ibrahim", 35, 'M', 145000,127,"Back-End Dev");
        Developer developer4 = new Developer("Roman", 26, 'M', 155000,128,"Front-End Dev");
        Developer developer5 =   new Developer("Rumeysa", 33, 'F', 170000,129,"Full-Stack Dev");

        Developer[] developers = { developer1, developer2, developer3, developer4, developer5 };

        ScrumTeam scrum1 = new ScrumTeam(testers, developers);
        scrum1.removeTester(123);

        System.out.println( scrum1 );

        Tester[] testers2 = { new Tester("Mehary", 35, 'M', 1300000, 123456, "SDET"),
                new Tester("Alex", 35, 'F', 135000, 9112356, "SDET")};

        Developer[] developers2 = {
                new Developer("Kalbi",38,'F',230000,323434,"Senior developer"),
                new Developer("Ramazan Sevindik", 30, 'M', 150000, 123456, "DEV LEAD"),
                new Developer("Musa", 31,'M', 155000, 111,"DevLead")};

        ScrumTeam scrum2 = new ScrumTeam(testers2, developers2);

        System.out.println( scrum2 );
        scrum2.removeDeveloper(123456);

        ScrumTeam[] allScrumTeam = { scrum1, scrum2};

        System.out.println("======================================");
        System.out.println("Testers: ");
        for (ScrumTeam eachScrum : allScrumTeam){
            for (Tester eachTester : eachScrum.testers){
                System.out.println(eachTester.name + " : " + eachTester.salary);
            }
        }

        System.out.println("======================================");
        System.out.println("Developers: ");
        for (ScrumTeam eachScrum : allScrumTeam){
            for (Developer eachDeveloper : eachScrum.developers){
                System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
            }
        }

    }
}

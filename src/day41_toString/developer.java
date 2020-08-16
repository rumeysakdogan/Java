package day41_toString;

class Developer {

    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender, int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixBugs(){
        System.out.println(name + " is crying");
    }

    public String toString(){
        return "Name: "+name + ", Age: " + age + ", Gender: " + gender + ", Salary: " + salary;
    }
}

class DeveloperObject{

    public static void main(String[] args) {

        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};

        developers[0].setInfo("Ahmet", 125000, "Male", 30);
        developers[1].setInfo("Ayse", 150000, "Female", 35);
        developers[2].setInfo("John", 135000, "Male", 32);
        developers[3].setInfo("Jennifer", 128000, "Female", 28);
        developers[4].setInfo("Brian", 147000, "Male", 34);

        for (Developer each : developers){
            each.coding();
        }

        System.out.println("==========================================");

        for (int i = 0; i < developers.length; i++) {
            developers[i].fixBugs();
        }
    }
}

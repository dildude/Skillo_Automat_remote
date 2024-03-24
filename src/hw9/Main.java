package hw9;

public class Main {
    public static void main(String[] args) {

        Person Joan = new Person("Joan", 'm',"Catholic","Spanish","","Mexican","8803133344","Mexico" );

        System.out.println("Joan");
        Joan.sayHallo();
        Joan.isAdult();
        Joan.canTakeLoan();
        Joan.setCountryOfResidence("USA");
        Joan.setJob("Mechanic");
        Joan.isAdult();
        Joan.canTakeLoan();
        Joan.celebrateEaster();

        System.out.println("\n");

        Bulgarian Mincho = new Bulgarian("Mincho", 'm', "Orthodox","QA","9411039874","Bulgaria");
        System.out.println("Mincho");
        Mincho.drivingSide();

        System.out.println("\n");

        Italian Josepe = new Italian("Josepe",'m',"Driver","9912126548","Unknown");
        System.out.println("Josepe");
        Josepe.carsMadeInTheCountry();
        Josepe.sayHallo();

        System.out.println("\n");

        American Bob = new American("Bob",'e',"Doesn't have", "English","","0199116549","USA");
        System.out.println("Bob");
        Bob.sayHallo();
        Bob.canTakeLoan();
        Bob.spreadingDemocracy();

        System.out.println("\n");

        Child Kid = new Child("Olivia", 'f', "Non","Bulgarian", "American","2243159865","Bulgaria" );

        System.out.println("Olivia");
        Kid.sayHallo();
        Kid.isGoingToSchool();
        Kid.setJob("Something");
        Kid.celebrateEaster();

        System.out.println("\n");
    }
}

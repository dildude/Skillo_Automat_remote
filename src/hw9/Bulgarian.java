package hw9;

public class Bulgarian extends Person{
    public Bulgarian(String name, char sex, String religion, String job, String egn, String countryOfResidence) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", egn, countryOfResidence);
    }

    @Override
    public void sayHallo() {
        System.out.println("Здравей");
    }

    public void drivingSide(){
        System.out.println("Bulgarians drive from the right-hand side of the road");
    }

}

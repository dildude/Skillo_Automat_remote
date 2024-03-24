package hw9;

public class Italian extends Person{
    public Italian(String name, char sex, String job, String egn, String countryOfResidence) {
        super(name, sex, "Catholic", "Italian", job, "Italian", egn, countryOfResidence);
    }

    @Override
    public void sayHallo() {
        System.out.println("Ciao ragazzi");
    }

    public void carsMadeInTheCountry(){
        System.out.println("Italians are well known for making Ferrari, Lamborghini, Maserati and a lot more");
    }
}

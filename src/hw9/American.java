package hw9;

public class American extends Person{
    public American(String name, char sex, String religion, String languageSpoken, String job, String egn, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, job, "American", egn, countryOfResidence);
    }


    @Override
    public void canTakeLoan() {
        System.out.println("Its complicated, but the history know kids with loans.");
    }

    public void spreadingDemocracy(){
        System.out.println("If you country have Oil, we are coming to give you Democracy :D!");
    }
}

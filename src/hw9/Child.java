package hw9;

public class Child extends Person{

    public Child(String name, char sex, String religion, String languageSpoken, String nationality, String egn, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, "", nationality, egn, countryOfResidence);
    }

    @Override
    public void setJob(String job) {
        throw new IllegalArgumentException("Can't set a job to a Child!!!");
    }

    public void isGoingToSchool(){
        System.out.println("The child is going to School");
    }
}

package hw9;
import java.time.LocalDate;
public class Person {
    private String name;
    private char sex;
    private String religion;
    private String languageSpoken;
    private String job;
    private String nationality;
    private String egn;
    private LocalDate dateOfBirth;
    private int age;
    private String countryOfResidence;

    public Person(String name, char sex, String religion, String languageSpoken,
                  String job, String nationality, String egn, String countryOfResidence) {
        this.name = name;
        try {
            this.validateSex(sex);
        } catch (Exception e ){
            System.out.println("The provided sex is invalid");
        }
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        this.egn = validateEGN(egn);
        this.countryOfResidence = countryOfResidence;
        this.dateOfBirth = getDateOfBirth(egn);
        this.age = getAge(dateOfBirth);

    }
    private void validateSex(char sex) {
            if (sex != 'm' && sex != 'f') {
               throw new IllegalArgumentException();
            }
    }

    private int getAge(LocalDate dateOfBirth) {
      return  LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    private LocalDate getDateOfBirth(String egn){
        int year = Integer.parseInt(egn.substring(0,2));
        int month = Integer.parseInt(egn.substring(2,4));
        int day = Integer.parseInt(egn.substring(4,6));

        if (month > 40 && month < 53) {
            year = year + 2000;
            month = month - 40;
        }else{
            year = year + 1900;
        }

        return LocalDate.of(year, month, day);
    }

    private String validateEGN(String egn){
        if (egn.length() == 10 && containOnlyDigits(egn) && validateCorrectRangeDigitsOfEGN(egn)){
            return egn;
        }else {
            throw new IllegalArgumentException("The provided EGN is not Valid! " +
                                                "The EGN must contain exactly 10 digits");
        }

    }

    private boolean containOnlyDigits(String egn) {
        try {
            return Long.parseLong(egn)> 0;
        }catch (NumberFormatException e){
           return false;
        }
    }

    // Допълнително решение което е out of scope от заданието но Димитар Таркаланов го даде като бонус
    private boolean validateCorrectRangeDigitsOfEGN(String egn){
        int mount = Integer.parseInt(egn.substring(2,4));
        if (mount < 13 && mount != 0 ){
            return true;
        } else if (mount < 53 && mount > 40) {
            return true;
        }else {
        return false;
        }
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public void sayHallo(){

        switch (nationality.toLowerCase()){
            case "bulgarian" :
                System.out.println("Зравей");
            break;
            case "italian" :
                System.out.println("Ciao");
            break;
            default:
                System.out.println("Hello");
        }

    }

    public void celebrateEaster(){
        if(religion.equalsIgnoreCase("Orthodox") || religion.equalsIgnoreCase("catholic")){
            System.out.println("You celebrate Easter");
        }else {
            System.out.println("You most likely don't have Easter");
        }

    }

    public void isAdult(){
        if (countryOfResidence.equalsIgnoreCase("bulgaria") || countryOfResidence.equalsIgnoreCase("italy")){
            if(age >= 18){
                System.out.println("This person is adult!");
            }else {
                System.out.println("This person is underage!");
            }
        } else if (countryOfResidence.equalsIgnoreCase("usa")) {
            if(age >= 21){
                System.out.println("This person is adult!");
            }else {
                System.out.println("This person is underage!");
            }
        }else {
            System.out.println("Unknown age of maturity for this country!");
        }
    }

    public void canTakeLoan(){
        if(job.isEmpty() || age < 16){
            System.out.println("Can't take a Loan!");
        }else {
            System.out.println("Can take a Loan");
        }
    }



}

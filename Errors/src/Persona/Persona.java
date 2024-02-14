package Persona;

public class Persona {
    String firstName, lastName, surName, birthDate;
    char gender;
    Long phoneNumber;

    public Persona() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return (lastName + " " + firstName + " " + surName + " " + birthDate + " " + phoneNumber + " " + gender);
    }

    public void setPersona(String input) throws NumberFormatException{
        String[] inputArr = input.split(" ");
        for (int i = 0; i < inputArr.length; i++) {
            this.lastName = inputArr[0];
            this.firstName = inputArr[1];
            this.surName = inputArr[2];
            this.birthDate = inputArr[3];
            this.phoneNumber = Long.parseLong(inputArr[4]);
            this.gender = inputArr[5].charAt(0);
        }
    }

    public String getLastName() {
        return lastName;
    }
    public Character gerGender(){
        return gender;
    }

}
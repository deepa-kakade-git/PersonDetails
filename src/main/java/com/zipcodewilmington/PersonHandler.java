package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */


public class PersonHandler {
    private final Person[] personArray;
    private String expected;
//    Person person1 = new Person("Leon", "Hunter");
//    Person person2 = new Person("Tariq", "Hook");
//    Person person3 = new Person("Dolio", "Durant");
//    Person[] personArray = {person1, person2, person3};


    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // Method to concatenate first and last names of persons using a while loop
    public String whileLoop() {
        String result = "";
        int counter = 0;
        while (counter < personArray.length) { // begin loop
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            String stringRepresentation = "";

            stringRepresentation += "\n";

            stringRepresentation += "My first name is " +currentPerson.getFirstName();
            stringRepresentation = stringRepresentation +"\nMy last name is " + currentPerson.getLastName();
            // append `stringRepresentation` to `result` variable
            result += stringRepresentation;
            // append `stringRepresentation` to `result` variable
            counter++;
        } // end loop
        return result;
    }

    // Method to concatenate first and last names of persons using a for loop
    public String forLoop() {
        String result = "";
        // declare for-loop signature
        for (int counter = 0; counter < personArray.length; counter++) { // begin loop
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            String stringRepresentation = "";

            stringRepresentation += "\n";

            stringRepresentation += "My first name is " +currentPerson.getFirstName();
            stringRepresentation = stringRepresentation +"\nMy last name is " + currentPerson.getLastName();
            // append `stringRepresentation` to `result` variable
            result += stringRepresentation;

        } // end loop
        return result;
    }

    // Method to concatenate first and last names of persons using a for-each loop
    public String forEachLoop() {
        String result = "";
        // declare for-each-loop signature
        for (Person currentPerson : personArray) { // begin loop
            // get `string Representation` of `currentPerson`
            String stringRepresentation = "";

            stringRepresentation += "\n";

            stringRepresentation += "My first name is " +currentPerson.getFirstName();
            stringRepresentation = stringRepresentation +"\nMy last name is " + currentPerson.getLastName();
            result += stringRepresentation;

        } // end loop
        return result;
    }

    // Getter method for personArray
    public Person[] getPersonArray() {
        return personArray;
    }

    // Getter method for expected result
    public String getExpected() {
        return expected;
    }

    // Setter method for expected result
    public void setExpected(String expected) {
        this.expected = expected;
    }

     //Method to initialize the objects
    public void setup() {
        // : Given
        Person person1 = new Person("Leon", "Hunter");
        Person person2 = new Person("Tariq", "Hook");
        Person person3 = new Person("Dolio", "Durant");
        Person[] personArray = {person1, person2, person3};


    }
}

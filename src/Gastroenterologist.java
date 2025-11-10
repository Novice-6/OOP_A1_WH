/**
 * Part 2 – Child class 2
 * Represents a Gastroenterologist (specialist doctor) who focuses on digestive system issues.
 */
public class Gastroenterologist extends HealthProfessional {
    // Additional instance variable specific to a Gastroenterologist
    private String hospitalAffiliation;

    // Default constructor
    public Gastroenterologist() {
        super();
        this.hospitalAffiliation = "Not assigned";
    }

    // Constructor initializing all instance variables
    public Gastroenterologist(int id, String name, String qualification, String hospitalAffiliation) {
        super(id, name, qualification);
        this.hospitalAffiliation = hospitalAffiliation;
    }

    // Method to print all details including type
    @Override
    public void printDetails() {
        System.out.println("The health professional details are (Gastroenterologist):");
        super.printDetails();
        System.out.println("Hospital Affiliation: " + hospitalAffiliation);
        System.out.println();
    }
}

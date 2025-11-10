/**
 * Part 2 – Child class 1
 * Represents a General Practitioner (GP) who can handle general medical issues.
 */
public class GeneralPractitioner extends HealthProfessional {
    // Additional instance variable specific to a General Practitioner
    private String clinicLocation;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.clinicLocation = "Not assigned";
    }

    // Constructor initializing all instance variables
    public GeneralPractitioner(int id, String name, String qualification, String clinicLocation) {
        super(id, name, qualification);
        this.clinicLocation = clinicLocation;
    }

    // Method to print all details including type
    @Override
    public void printDetails() {
        System.out.println("The health professional details are (General Practitioner):");
        super.printDetails();
        System.out.println("Clinic Location: " + clinicLocation);
        System.out.println();
    }
}
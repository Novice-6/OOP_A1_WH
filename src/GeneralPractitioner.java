/**
 * Part 2 – Child class 1
 * Represents a General Practitioner (GP) who can handle general medical issues.
 */
public class GeneralPractitioner extends HealthProfessional {
    // Additional instance variable specific to a General Practitioner
    private String clinicLocation;

    /**
     * Default constructor
     * Calls the superclass default constructor to initialize the clinic location as "unallocated".
     */
    public GeneralPractitioner() {
        super();
        this.clinicLocation = "Not assigned";
    }

    /**
     * All-argument constructor
     * Initialize all information about the general practitioner (including basic information inherited from the parent class and the location of its own clinic)
     */
    public GeneralPractitioner(int id, String name, String qualification, String clinicLocation) {
        super(id, name, qualification);
        this.clinicLocation = clinicLocation;
    }

    /**
     * Override the parent method to print the full information for the general practitioner
     * Call the parent printDetails() class to print the basic information and then fill in the clinic location
     */
    @Override
    public void printDetails() {
        System.out.println("The health professional details are (General Practitioner):");
        super.printDetails();
        System.out.println("Clinic Location: " + clinicLocation);
        System.out.println();
    }

}

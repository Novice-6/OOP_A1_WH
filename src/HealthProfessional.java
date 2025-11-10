/**
 * Part 1 – Base class
 * This class represents a general health professional.
 * It will be extended by specific types of health professionals.
 */
public class HealthProfessional {
    // Instance variables common to all health professionals
    protected int id;
    protected String name;
    protected String qualification;

    /**
     * Default constructor
     * Initialize the default information for the health professional (ID 0, name and qualifications "unknown")
     */
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.qualification = "Not specified";
    }

    /**
     * All-argument constructor
     * Initialize all the basic information of the health professionals
     */
    public HealthProfessional(int id, String name, String qualification) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
    }

    /**
     * Print the basic information (ID number, name, qualification certificates) of the health professionals.
     * Subclasses can override this method to add specific information.
     */
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
    }
}


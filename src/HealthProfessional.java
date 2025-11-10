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

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.qualification = "Not specified";
    }

    // Constructor that initializes all instance variables
    public HealthProfessional(int id, String name, String qualification) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
    }
}

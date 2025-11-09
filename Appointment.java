import java.time.LocalTime;

/**
 * Part 4 – Appointment class
 * Represents an appointment made by a patient with a health professional.
 */
public class Appointment {
    private String patientName;
    private String mobilePhone;
    private LocalTime preferredTime;
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "0000000000";
        this.preferredTime = LocalTime.of(9, 0);
        this.selectedDoctor = null;
    }

    // Constructor initializing all instance variables
    public Appointment(String patientName, String mobilePhone, LocalTime preferredTime, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTime = preferredTime;
        this.selectedDoctor = selectedDoctor;
    }

    // Method to print all appointment details
    public void printDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Preferred Time: " + preferredTime);
        System.out.println("Selected Doctor:");
        if (selectedDoctor != null) {
            selectedDoctor.printDetails();
        } else {
            System.out.println("No doctor assigned.");
        }
        System.out.println("------------------------------");
    }

    // Getter methods for cancellation feature
    public String getMobilePhone() {
        return mobilePhone;
    }
}

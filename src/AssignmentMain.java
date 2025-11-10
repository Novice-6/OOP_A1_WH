import java.time.LocalTime;
import java.util.ArrayList;

/**
 * AssignmentOne
 * This is the main class that demonstrates all parts of the assignment.
 * Author: yourusername
 */
public class AssignmentMain {

    // Collection to store appointments
    private static ArrayList<Appointment> appointmentList = new ArrayList<>();

    // Method to create an appointment
    public static void createAppointment(String patientName, String mobilePhone, LocalTime preferredTime, HealthProfessional doctor) {
        if (patientName == null || mobilePhone == null || doctor == null) {
            System.out.println("Error: Missing information. Appointment not created.");
            return;
        }
        Appointment newAppointment = new Appointment(patientName, mobilePhone, preferredTime, doctor);
        appointmentList.add(newAppointment);
        System.out.println("Appointment successfully created for " + patientName + ".");
    }

    // Method to print all existing appointments
    public static void printExistingAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Existing Appointments:");
            for (Appointment app : appointmentList) {
                app.printDetails();
            }
        }
    }

    // Method to cancel a booking using patient's mobile phone
    public static void cancelBooking(String mobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).getMobilePhone().equals(mobilePhone)) {
                appointmentList.remove(i);
                System.out.println("Appointment with mobile " + mobilePhone + " has been cancelled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found with mobile " + mobilePhone);
        }
    }

    public static void main(String[] args) {

        // ---------------------------------------------
        // Part 3 – Using classes and objects
        // ---------------------------------------------
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Wang", "MBBS", "The First Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Li", "MBBS", "The Second Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Zhao", "MBBS", "The Third Clinic");

        Gastroenterologist gastro1 = new Gastroenterologist(4, "Dr. Sun", "MBBS, Gastroenterology Specialty Certification", "The First Hospital");
        Gastroenterologist gastro2 = new Gastroenterologist(5, "Dr. Zhang", "MBBS, Gastroenterology Specialty Certification", "The Second Hospital");

        System.out.println("Printing all health professionals:");
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        gastro1.printDetails();
        gastro2.printDetails();

        System.out.println("------------------------------");

        // ---------------------------------------------
        // Part 5 – Collection of appointments
        // ---------------------------------------------
        createAppointment("Harvey", "1111111111", LocalTime.of(9, 0), gp1);
        createAppointment("WangHao", "2222222222", LocalTime.of(10, 30), gp2);
        createAppointment("ZhangSan", "3333333333", LocalTime.of(11, 15), gastro1);
        createAppointment("Bob", "4444444444", LocalTime.of(13, 45), gastro2);

        System.out.println("------------------------------");
        printExistingAppointments();

        System.out.println("------------------------------");
        cancelBooking("3333333333"); // Cancel ZhangSan's appointment

        System.out.println("------------------------------");
        printExistingAppointments();
    }
}
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Patient {
    private int patientId;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String email;
    private String mailingAddress;
    private String dateOfBirth;

    public Patient() {

    }

    public Patient(int id, String firstName, String lastName, String phoneNo,
                   String email, String mailingAddress, String dateOfBirth) {
        this.patientId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
        LocalDate today = LocalDate.now();

        return Period.between(birthDate, today).getYears();
    }

    public String toJson() {
        return "{\n" +
                "  \"id\": " + patientId + ",\n" +
                "  \"firstName\": \"" + firstName + "\",\n" +
                "  \"lastName\": \"" + lastName + "\",\n" +
                "  \"phoneNo\": \"" + phoneNo + "\",\n" +
                "  \"email\": \"" + email + "\",\n" +
                "  \"mailingAddress\": \"" + mailingAddress + "\",\n" +
                "  \"dateOfBirth\": \"" + dateOfBirth + "\",\n" +
                "  \"age\": " + getAge() + "\n" +
                "}";
    }

    public int getPatientId() {
        return patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", mailingAddress='" + mailingAddress + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}

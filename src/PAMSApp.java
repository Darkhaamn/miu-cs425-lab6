public class PAMSApp {
    public static void main(String[] args) {

        Patient[] patients = {
                new Patient(
                        1,
                        "Daniel",
                        "Agar",
                        "(641) 123-0009",
                        "dagar@m.as",
                        "1 N Street",
                        "1987-1-19"
                ),

                new Patient(
                        2,
                        "Ana",
                        "Smith",
                        "",
                        "amsith@te.edu",
                        "",
                        "1948-12-5"
                ),

                new Patient(
                        3,
                        "Marcus",
                        "Garvey",
                        "(123) 292-0018",
                        "",
                        "4 East Ave",
                        "2001-9-18"
                ),

                new Patient(
                        4,
                        "Jeff",
                        "Goldbloom",
                        "(999) 165-1192",
                        "jgold@es.co.za",
                        "",
                        "1995-2-28"
                ),

                new Patient(
                        5,
                        "Mary",
                        "Washington",
                        "",
                        "",
                        "30 W Burlington",
                        "1932-5-31"
                )
        };

        for (Patient patient : patients) {
            System.out.println(patient);
        }

        System.out.println("[");

        for (int i = 0; i < patients.length; i++) {
            System.out.print(patients[i].toJson());

            if (i < patients.length - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }

        System.out.println("]");
    }
}
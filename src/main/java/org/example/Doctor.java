package org.example;

public class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void examinePatient(String patientName) {
        System.out.println(name + " is examining the patient " + patientName + ".");

    }

    public void prescribeMedication(String patientName, String medication) {
        System.out.println(name + " is prescribing " + medication + " for the patient " + patientName + ".");

    }


}

    public class Nurse {
        private String name;
        private int yearsOfExperience;

        public Nurse(String name, int yearsOfExperience) {
            this.name = name;
            this.yearsOfExperience = yearsOfExperience;
        }

        public void assistDoctor(Doctor doctor, String patientName) {
            System.out.println(name + " is assisting " + doctor.getName() + " with the patient " + patientName + ".");

        }

        public void administerMedication(String patientName, String medication) {
            System.out.println(name + " is administering " + medication + " to the patient " + patientName + ".");

        }


    public class Hospital {
        public static void main(String[] args) {
            Doctor cardiologist = new Doctor("Dr. Smith", "Cardiologist");
            Nurse headNurse = new Nurse("Nurse Johnson", 5);

            String patientName = "John Doe";

            cardiologist.examinePatient(patientName);
            headNurse.assistDoctor(cardiologist, patientName);
            cardiologist.prescribeMedication(patientName, "Aspirin");
            headNurse.administerMedication(patientName, "Aspirin");
        }
    }
}

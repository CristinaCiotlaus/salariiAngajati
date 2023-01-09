package com.skillbrain;

public class TehnicianRisk extends Technician implements EmployeeRisk{

    TehnicianRisk(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate, reference);
    }

    @Override
    public void handleRisk() {
        System.out.println("Lucrez intr-un mediu de risc si beneficiez de un salariu extra.");
    }

    @Override
    public double calculateSalary() {
        return 2 * reference + monthlyPremium;
    }
}

package com.skillbrain;

import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
Staff staff = new Staff();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti salariul minim pe economie din tara dumneavoastra in lei: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Valoarea introdusa nu este un numar valid! Mai incercati o data! ");
        }
        int salariuMinim = scanner.nextInt();

        System.out.println("Introduceti salariul mediu pe economie in tara dvoastra in lei: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Valoarea introdusa nu este un numar valid! Mai incercati o data! ");
        }
        int salariuMediu = scanner.nextInt();

        int salariuMinimPeOra =  salariuMinim / 160;
        int salariuMediuPeOra = salariuMediu / 160;

        staff.addEmployee( new Seller("Alina", "Bostan", 45, "1995",
                salariuMinim));

        staff.addEmployee( new Technician("Leonard", "Veres", 28,"2010",
                salariuMediu));

        staff.addEmployee( new Warehouseman("Cosmin", "ureche", 35, "2015",
                salariuMinim));

        staff.addEmployee( new TehnicianRisk("Anastasia", "Matilda", 30, "2009",
                salariuMediu));

        staff.addEmployee( new HandlingRisk("Marius", "Cos", 42, "2004",
                salariuMediuPeOra));

        staff.showSalaries();
        System.out.println("Salariul mediu in companie este: " + staff.averageSalary() + " lei.");


    }
}
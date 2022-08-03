public class Main {
    public static void main(String[] args) {
        int oldMashaSalary = 67760;
        int oldDenisSalary = 83690;
        int oldKristinaSalary = 76230;

        double increasingSalary = 1.1;

        double newMashaSalary = oldMashaSalary * increasingSalary;
        String masha = String.format("%.2f",newMashaSalary);
        double newDenisSalary = oldDenisSalary * increasingSalary;
        String denis = String.format("%.2f",newDenisSalary);
        double newKristinaSalary = oldKristinaSalary * increasingSalary;
        String kristina = String.format("%.2f",newKristinaSalary);

        double increasingMashaSalaryPerMonth = newMashaSalary - oldMashaSalary;
        double increasingDenisSalaryPerMonth = newDenisSalary - oldDenisSalary;
        double increasingKristinaSalaryPerMonth = newKristinaSalary - oldKristinaSalary;

        int monthPerYear = 12;

        double increasingMashaSalaryPerYear = increasingMashaSalaryPerMonth * monthPerYear;
        String risingMasha = String.format("%.2f",increasingMashaSalaryPerYear);
        double increasingDenisSalaryPerYear = increasingDenisSalaryPerMonth * monthPerYear;
        String risingDenis = String.format("%.2f",increasingDenisSalaryPerYear);
        double increasingKristinaSalaryPerYear = increasingKristinaSalaryPerMonth * monthPerYear;
        String risingKristina = String.format("%.2f",increasingKristinaSalaryPerYear);

        System.out.println("Маша теперь получает " + masha + " рублей. Годовой доход вырос на " + risingMasha +" рублей.");
        System.out.println("Денис теперь получает " + denis + " рублей. Годовой доход вырос на " + risingDenis +" рублей.");
        System.out.println("Кристина теперь получает " + kristina + " рублей. Годовой доход вырос на " + risingKristina +" рублей.");
    }
}
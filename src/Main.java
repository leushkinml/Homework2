public class Main {
    public static void main(String[] args) {
     // 1 вариант
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        double totalBoxersWeight = boxerWeight1 + boxerWeight2;
        double deltaBoxersWeight = boxerWeight2 - boxerWeight1;

        System.out.println("Общий вес двух бойцов " + totalBoxersWeight + " кг.");
        System.out.println("Разница между весами бойцов " + deltaBoxersWeight + " кг.");

     // 2 вариант

        double boxWeight1 = 78.2;
        double boxWeight2 = 82.7;

        System.out.println("Общий вес двух бойцов " + (boxWeight1 + boxWeight2) + " кг.");
        System.out.println("Разница между весами бойцов " + (boxWeight2 - boxWeight1) + " кг.");

    }
}
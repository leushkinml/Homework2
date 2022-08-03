public class Main {
    public static void main(String[] args) {

        // Задание 3

        int bananas = 5;
        int bananaWeight = 80;
        int milk = 200;
        double milkWeight = (105.00 / 100.00);
        int ice_cream = 2;
        int ice_creamWeight = 100;
        int egs = 4;
        int egsWeight = 70;

        double mixedWeightInGramm = (bananas * bananaWeight) + (milk * milkWeight) + (ice_cream * ice_creamWeight) + (egs * egsWeight);
        double mixedWeightInKg = mixedWeightInGramm / 1000;

        System.out.println("Вес спорт-завтрака в граммах " + mixedWeightInGramm + ".");
        System.out.println("Вес спорт-завтрака в килограммах " + mixedWeightInKg + ".");

    }
}
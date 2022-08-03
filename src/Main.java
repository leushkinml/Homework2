public class Main {
    public static void main(String[] args) {
        // Задание 4
        int weightToLoose = (7 * 1000);
        int bigLoosing = 500;
        int smoleLoosing = 250;
        int slowlyLoosing = weightToLoose / smoleLoosing;
        int fastLoosing = weightToLoose / bigLoosing;

        System.out.println("Для похудания по 250 грамм в день понадобится " + slowlyLoosing + " дней.");
        System.out.println("Для похудания по 500 грамм в день понадобится " + fastLoosing + " дней.");
        System.out.println("В среднем для похудания понадобится " + ((slowlyLoosing + fastLoosing) / 2)+ " дней.");
    }
}
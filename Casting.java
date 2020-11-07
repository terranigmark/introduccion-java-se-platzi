public class Casting {
    public static void main(String[] args) {

        // en un anno ubicar 30 perritos
        // cuanto perritos fueron ubicados al mes
        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);

        // estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // exactitud
        int a = 30;
        int b = 30;

        System.out.println((double) a/b);

        double c = a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(n);
        System.out.println(nI);
    }
}
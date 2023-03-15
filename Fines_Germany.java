import java.util.*;
public class Fines_Germany {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Система расчёта штрафов в Германии");

        int carSpeed = sc.nextInt();
        boolean isTown = sc.nextBoolean();

        if (isTown) {
            finesInTown.townFine(carSpeed);
        } else {
            finesInCountry.countryFine(carSpeed);
        }


    }
}
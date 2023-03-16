
public class Mainn {
    public static void main (String[] args)
    {
        System.out.println("Система расчёта штрафов");

        check(60, 0);
        check(90, 500);
        check(110, 1000);
        check(130, 2000);
        check(150, 5000);
    }

    public static void check(int carSpeed, int fine)
    {
        if(calculateFine(carSpeed) != fine) {
            System.out.println("Неверный штраф " + fine + " для скорости " + carSpeed);
        }
        else {
            System.out.println("Штраф " + fine + " для скорости " + carSpeed + " рассчитан верно");
        }
    }

    public static int calculateFine(int carSpeed)
    {
        int fineFor20to40 = 500;
        int fineFor40to60 = 1000;
        int fineFor60to80 = 2000;
        int fineFor80andMore = 5000;

        int townSpeed = 60;

        int overSpeed = carSpeed - townSpeed;

        if(overSpeed < 20) {
            return 0;
        }

        if(overSpeed >= 20 && overSpeed < 40) {
            return fineFor20to40;
        }

        if(overSpeed >= 40 && overSpeed < 60) {
            return fineFor40to60;
        }

        if(overSpeed >= 60 && overSpeed < 80) {
            return fineFor60to80;
        }

        return fineFor80andMore;
    }
}


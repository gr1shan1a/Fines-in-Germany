public class finesInTown {
    final static int townSpeed = 60;
    final static int fineFor1to10 = 30;
    final static int fineFor11to15 = 50;
    final static int fineFor16to20 = 70;
    final static int fineFor21to25 = 115;
    final static int fineFor26to30 = 180;
    final static int fineFor31to40 = 260;
    final static int fineFor41to50 = 400;
    final static int fineFor51to60 = 560;
    final static int fineFor61to70 = 700;
    final static int fineFor70andMore = 800;




    public static void townFine(int carSpeed) {
        int overSpeed = carSpeed - townSpeed;

        if(overSpeed < 1) {
            System.out.println("Скорость не превышена или превышена незначительно");
        }
        else if(overSpeed >= 1 && overSpeed <= 10) {
            System.out.println("Штраф: " + fineFor1to10 + " евро");
        }
        else if(overSpeed >= 10 && overSpeed <= 15) {
            System.out.println("Штраф: " + fineFor11to15 + " евро");
        }
        else if(overSpeed >= 16 && overSpeed <= 20) {
            System.out.println("Штраф: " + fineFor16to20 + " евро");
        }
        else if(overSpeed >= 21 && overSpeed <= 25) {
            System.out.println("Штраф: " + fineFor21to25 + " евро");
        }
        else if(overSpeed >= 26 && overSpeed <= 30) {
            System.out.println("Штраф: " + fineFor26to30 + " евро");
        }
        else if(overSpeed >= 31 && overSpeed <= 40) {
            System.out.println("Штраф: " + fineFor31to40 + " евро");
        }
        else if(overSpeed >= 41 && overSpeed <= 50) {
            System.out.println("Штраф: " + fineFor41to50 + " евро");
        }
        else if(overSpeed >= 51 && overSpeed <= 60) {
            System.out.println("Штраф: " + fineFor51to60 + " евро");
        }
        else if(overSpeed >= 61 && overSpeed <= 70) {
            System.out.println("Штраф: " + fineFor61to70 + " евро");
        }
        else if(overSpeed > 70) {
            System.out.println("Штраф: " + fineFor70andMore + " евро");
        }

    }
}

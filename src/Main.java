public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int Bmi1 = (int) service.calculate(180, 80 );
        System.out.println("expected result:24, actual result: " + Bmi1);

        int Bmi2 = service.calculate(200, 120);
        System.out.println("expected result:30, actual result: " + Bmi2);
    }
}

public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int bmi1 = (int) service.calculate(180, 80 );
        System.out.println("expected result:24, actual result: " + bmi1);

        int bmi2 = service.calculate(200, 120);
        System.out.println("expected result:30, actual result: " + bmi2);
    }
}

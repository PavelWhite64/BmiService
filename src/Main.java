public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98;
        double heightMetre = 1.87;

        int bmi = service.calculate(weightKg, heightMetre);

        System.out.println("BMI Индекс = " + bmi);
    }
}

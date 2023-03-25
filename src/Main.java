public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // Рост в метрах
        double weight = 98.0; // Вес в килограммах

        int bmi = service.calculate(height, weight);

        System.out.println("Индекс массы тела = " + bmi);
    }
}
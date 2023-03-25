public class BmiService {
    public int calculate(double height, double weight) {

        double a = weight;
        double b = height * height;
        int index = (int) (a / b);

        return index;
    }
}

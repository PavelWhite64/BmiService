public class BmiService {
    public int calculate(double weightKg, double heightMetre){

    double result = weightKg / (heightMetre * heightMetre);

    return(int) result;
    }
}

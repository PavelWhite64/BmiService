public class BmiService {
    public int calculate(double weightKg, double heightMetre){

    double resultat = weightKg / (heightMetre * heightMetre);

    return(int) resultat;
    }
}

public class LataOleo {
    double V;
    float R;
    float A;

    public void ValorLata(){
        V =  3.14159 * R * R * A;
        System.out.printf("O valor do volume da lata é de %.2f m³", V);
    }
}

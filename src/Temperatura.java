public class Temperatura {

    double C;
    double K;
    double F;
    double Re;
    double Ra;

    Temperatura(){
        this.C = C;
    }
    public void Kelvin(){
        K = C + 273.15;
        System.out.println("A temperatura em Kelvin é "+K);
    }
     void Fahrenheit(){
         F = C * 1.8 + 32;
         System.out.println("A temperatura em Fahrenheit é "+F);
     }
    void Reaumur(){
        Re = C * 0.8;
        System.out.println("A temperatura em Fahrenheit é "+Re);
    }
    void Rankine(){
        Ra = C * 1.8 + 32 + 459.67;
        System.out.println("A Temperatura em Rankine é: "+Ra);
    }

}

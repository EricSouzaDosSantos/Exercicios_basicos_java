public class HomensEMulheres {
    int sexo;
    int QMulheres;
    int QHomens;
    double Altura;
    double somaH = 0;
    double MediaH;
    double Maior = 0;
    double Menor = 0;
    
    public void Altura() {
        System.out.println("A maior altura do grupo é de " + Maior + " e a menor altura do grupo é de " + Menor);
    }
    
    public void MediaAltura() {
        MediaH = somaH / QHomens;
        System.out.println("A média da altura dos homens é de " + MediaH);
    }
    
    public void NumeroMulheres(int quantidadeMulheres) {
        System.out.println("O número de mulheres é de " + quantidadeMulheres);
    }
}

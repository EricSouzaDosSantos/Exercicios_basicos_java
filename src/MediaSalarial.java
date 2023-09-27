import java.awt.*;

public class MediaSalarial {
    double n1;
    double n2;
    double n3;
    double n4;
    double media;
    String[] texto = {"Digite o salario do primeiro funcionario",
            "Digite o salario do segundo funcionario",
            "Digite o salario do terceiro funcionario",
            "Digite o salario do quarto funcionario"};

    MediaSalarial(){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }
    public void Valor(String texto){
            System.out.println(texto);
    }

    public void Media(){
        media = (n1 + n2 + n3 +n4)/4;
        System.out.println("A Meida salarial dessa empresa é de: "+media);
    }


}

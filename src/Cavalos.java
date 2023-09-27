public class Cavalos {
    double massa;
    double altura;
    double tempo;
    double cavalos;
    int i = 0;

    public void Quantidade(){
        cavalos = (massa * altura / tempo) / 745.6999;
        if(cavalos > 0){
            cavalos = i++ + 1;
        } System.out.printf("A Quantidade necessaria de cavalos é de %.0f", cavalos);
    }
}

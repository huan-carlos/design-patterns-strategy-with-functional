import RetornoBoleto.LeituraRetornoBancoBrasil;
import RetornoBoleto.ProcessarBoletos;

public class Principal {
    public static void main(String[] args) {
        var processarBoleto = new ProcessarBoletos(LeituraRetornoBancoBrasil::lerArquivo);
        processarBoleto.processar("banco-brasil-1.csv");
    }
}

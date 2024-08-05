package RetornoBoleto;

import lombok.Setter;

import java.util.List;
import java.util.function.Function;

@Setter
public class ProcessarBoletos {
    private Function<String, List<Boleto>> leituraRetorno;

    public ProcessarBoletos(Function<String, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(String nomeArquivo){
        var listaBoletos = leituraRetorno.apply(nomeArquivo);
        System.out.println(listaBoletos);

        String nome = "  String  ";
        Function<String, String> trim = String::trim;
        Function<String, String> trimLowerCase = trim.andThen(String::toLowerCase);
        System.out.println(trimLowerCase.apply(nome));
    }
}

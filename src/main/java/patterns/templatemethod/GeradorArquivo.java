package patterns.templatemethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorArquivo {

    public final void geradorArquivo(String nome, Map<String, Object> propriedades) throws IOException {
        String conteudo = gerarConteudo(propriedades);
        byte[] bytes = conteudo.getBytes();
        bytes = processar(bytes);
        FileOutputStream fileOutputStream = new FileOutputStream(nome);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    protected abstract byte[] processar(byte[] bytes) throws IOException;

    protected abstract String gerarConteudo(Map<String, Object> propriedades);
}

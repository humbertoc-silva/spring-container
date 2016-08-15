package br.com.hcs.spring.container;

import java.util.List;

public class FonteDadosArquivoStringList implements IFonteDados {
    private List<String> arquivos;

    public List<String> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<String> arquivos) {
        this.arquivos = arquivos;
    }
}

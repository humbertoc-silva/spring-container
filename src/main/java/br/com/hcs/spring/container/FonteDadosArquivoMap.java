package br.com.hcs.spring.container;

import java.util.Map;

public class FonteDadosArquivoMap implements IFonteDados {
    private Map<String, Object> arquivos;

    public Map<String, Object> getArquivos() {
        return arquivos;
    }

    public void setArquivos(Map<String, Object> arquivos) {
        this.arquivos = arquivos;
    }
}

package br.com.hcs.spring.container;

public class FonteDadosArquivo implements IFonteDados {
    private String arquivo;

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}

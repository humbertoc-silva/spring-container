package br.com.hcs.spring.container;

public class FonteDadosArquivo implements IFonteDados {
    private String arquivo;
    private int maxNumArquivos;
    
    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public int getMaxNumArquivos() {
        return maxNumArquivos;
    }

    public void setMaxNumArquivos(int maxNumArquivos) {
        this.maxNumArquivos = maxNumArquivos;
    }
}

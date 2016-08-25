package br.com.hcs.spring.container;

import java.io.File;
import java.util.List;

public class FonteDadosArquivoFileList implements IFonteDados {
    private List<File> arquivos;
    private int maxNumArquivos;

    public List<File> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<File> arquivos) {
        this.arquivos = arquivos;
    }

    public int getMaxNumArquivos() {
        return maxNumArquivos;
    }

    public void setMaxNumArquivos(int maxNumArquivos) {
        this.maxNumArquivos = maxNumArquivos;
    }
}

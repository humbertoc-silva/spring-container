package br.com.hcs.spring.container;

import java.io.File;
import java.util.List;

public class FonteDadosArquivoFileList implements IFonteDados {
    private List<File> arquivos;

    public List<File> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<File> arquivos) {
        this.arquivos = arquivos;
    }
}

package br.com.hcs.spring.container;

public class ProcessadorInjecaoMista {
    private IFonteDados fonteDados;
    private IImpressor impressor;
    
    public ProcessadorInjecaoMista(IFonteDados fonteDados, IImpressor impressor) {
        this.fonteDados = fonteDados;
        this.impressor = impressor;
    }

    public IFonteDados getFonteDados() {
        return fonteDados;
    }

    public void setFonteDados(IFonteDados fonteDados) {
        this.fonteDados = fonteDados;
    }

    public IImpressor getImpressor() {
        return impressor;
    }

    public void setImpressor(IImpressor impressor) {
        this.impressor = impressor;
    }
}

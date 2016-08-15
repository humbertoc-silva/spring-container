package br.com.hcs.spring.container;

public class ProcessadorInjecaoConstructor {
    private IFonteDados fonteDados;
    private IImpressor impressor;
    
    public ProcessadorInjecaoConstructor(IFonteDados fonteDados, IImpressor impressor) {
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
    
    public void processar() {
        System.out.println("Processador com injeção de dependências por constructor.");
    }
}

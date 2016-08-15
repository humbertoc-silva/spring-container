package br.com.hcs.spring.container;

public class FonteDadosArquivoDestroyMethod implements IFonteDados {
    public void destroy() {
        System.out.println("Liberação de recursos e operação de limpeza utilizando o atributo destroy-method da tag bean.");
    }
}

package br.com.hcs.spring.container;

public class FonteDadosArquivoInitMethod implements IFonteDados {
    public void init() {
        System.out.println("Inicializando o bean utilizando o atributo init-method da tag bean.");
    }
}

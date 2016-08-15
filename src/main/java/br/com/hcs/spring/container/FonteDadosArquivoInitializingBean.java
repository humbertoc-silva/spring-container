package br.com.hcs.spring.container;

import org.springframework.beans.factory.InitializingBean;

public class FonteDadosArquivoInitializingBean implements IFonteDados, InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inicializando o bean utilizando a interface InitializingBean.");
    }
}

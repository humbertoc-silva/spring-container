package br.com.hcs.spring.container;

import org.springframework.beans.factory.DisposableBean;

public class FonteDadosArquivoDisposableBean implements IFonteDados, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Liberação de recursos e operação de limpeza utilizando a interface DisposableBean.");
    }
}

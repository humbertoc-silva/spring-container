package br.com.hcs.spring.container.teste;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hcs.spring.container.FonteDadosArquivoDestroyMethod;
import br.com.hcs.spring.container.FonteDadosArquivoDisposableBean;

/**
 * Testando a destruição dos beans.
 * 
 * @author Humberto
 *
 */
public class TesteDestruicao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        FonteDadosArquivoDisposableBean fonteDadosArquivoDisposableBean = context
                .getBean("fonteDadosDisposableBean", FonteDadosArquivoDisposableBean.class);
        fonteDadosArquivoDisposableBean = null;
        FonteDadosArquivoDestroyMethod fonteDadosArquivoDestroyMethod = context
                .getBean("fonteDadosDestroyMethod", FonteDadosArquivoDestroyMethod.class);
        fonteDadosArquivoDisposableBean = null;
    }
}

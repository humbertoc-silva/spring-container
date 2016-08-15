package br.com.hcs.spring.container.teste;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hcs.spring.container.FonteDadosArquivoInitMethod;
import br.com.hcs.spring.container.FonteDadosArquivoInitializingBean;

/**
 * Testando a inicialização dos beans.
 * 
 * @author Humberto
 *
 */
public class TesteInicializacao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        FonteDadosArquivoInitializingBean fonteDadosArquivoInitializingBean = context
                .getBean("fonteDadosInitializingBean", FonteDadosArquivoInitializingBean.class);
        FonteDadosArquivoInitMethod dadosArquivoInitMethod = context
                .getBean("fonteDadosInitMethod", FonteDadosArquivoInitMethod.class);
    }
}

package br.com.hcs.spring.container.teste;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hcs.spring.container.FonteDadosArquivo;

/**
 * Testando o escopo.
 * 
 * @author Humberto
 */
public class TesteEscopo {
    public static void main(String[] args) {
        String[] configLocations = {"spring.xml", "modularizando_configuracao.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocations, true);
        
        FonteDadosArquivo fonteDadosArquivoSingleton1 = context.getBean("fonteDadosEscopoSingleton",
                FonteDadosArquivo.class);
        FonteDadosArquivo fonteDadosArquivoSingleton2 = context.getBean("fonteDadosEscopoSingleton",
                FonteDadosArquivo.class);

        assert fonteDadosArquivoSingleton1 == fonteDadosArquivoSingleton2;

        FonteDadosArquivo fonteDadosArquivoPrototype1 = context.getBean("fonteDadosEscopoPrototype",
                FonteDadosArquivo.class);
        FonteDadosArquivo fonteDadosArquivoPrototype2 = context.getBean("fonteDadosEscopoPrototype",
                FonteDadosArquivo.class);

        assert fonteDadosArquivoPrototype1 != fonteDadosArquivoPrototype2;
    }
}

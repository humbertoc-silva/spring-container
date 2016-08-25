package br.com.hcs.spring.container.teste;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hcs.spring.container.FonteDadosArquivo;
import br.com.hcs.spring.container.FonteDadosRandomico;
import br.com.hcs.spring.container.ProcessadorInjecaoSetter;

/**
 * Testando a utilização da herança na definição dos beans.
 * 
 * @author Humberto
 *
 */
public class TesteHerancaBean {
    public static void main(String[] args) {
        String[] configLocations = {"spring.xml", "modularizando_configuracao.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocations, true);
        
        ProcessadorInjecaoSetter processadorPai = context.getBean("processadorPai", ProcessadorInjecaoSetter.class);
        ProcessadorInjecaoSetter processadorFilho = context.getBean("processadorFilho", ProcessadorInjecaoSetter.class);
        
        assert processadorPai.getFonteDados().getClass().isAssignableFrom(FonteDadosArquivo.class);
        assert processadorFilho.getFonteDados().getClass().isAssignableFrom(FonteDadosRandomico.class);
    }
}

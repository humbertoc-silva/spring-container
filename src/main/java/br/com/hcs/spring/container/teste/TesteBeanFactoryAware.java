package br.com.hcs.spring.container.teste;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hcs.spring.container.ProcessadorAware;

/**
 * Testando o bean que implementa a interface BeanFactoryAware.
 * 
 * @author Humberto
 *
 */
public class TesteBeanFactoryAware {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ProcessadorAware processadorAware1 = context.getBean(ProcessadorAware.class);
        ProcessadorAware processadorAware2 = context.getBean(ProcessadorAware.class);
        
        assert processadorAware1 == processadorAware2;
        assert processadorAware1.getImpressor() != processadorAware1.getImpressor();
    }
}

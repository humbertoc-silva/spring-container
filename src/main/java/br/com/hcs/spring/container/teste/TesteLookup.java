package br.com.hcs.spring.container.teste;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hcs.spring.container.ProcessadorInjecaoConstructor;
import br.com.hcs.spring.container.ProcessadorInjecaoSetter;

/**
 * Obtendo beans - Lookup
 * 
 * @author Humberto
 */
public class TesteLookup {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Obtendo beans através do id.
        ProcessadorInjecaoSetter processadorInjecaoSetter1 = (ProcessadorInjecaoSetter) context
                .getBean("processadorInjecaoSetter");

        processadorInjecaoSetter1.processar();

        ProcessadorInjecaoSetter processadorInjecaoSetter2 = context.getBean("processadorInjecaoSetter",
                ProcessadorInjecaoSetter.class);

        processadorInjecaoSetter2.processar();

        // Obtendo beans através da classe.
        ProcessadorInjecaoConstructor processadorInjecaoConstructor1 = context
                .getBean(ProcessadorInjecaoConstructor.class);

        processadorInjecaoConstructor1.processar();

        Map<String, ProcessadorInjecaoConstructor> processadorInjecaoConstructorMap = context
                .getBeansOfType(ProcessadorInjecaoConstructor.class);

        ProcessadorInjecaoConstructor processadorInjecaoConstructor2 = processadorInjecaoConstructorMap
                .get("processadorInjecaoConstructor");

        if (processadorInjecaoConstructor2 != null) {
            processadorInjecaoConstructor2.processar();
        }
    }
}

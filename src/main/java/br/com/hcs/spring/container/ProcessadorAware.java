package br.com.hcs.spring.container;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class ProcessadorAware implements BeanFactoryAware {
    private BeanFactory beanFactory;

    public IImpressor getImpressor() {
        return beanFactory.getBean("impressorAware", Impressor.class);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}

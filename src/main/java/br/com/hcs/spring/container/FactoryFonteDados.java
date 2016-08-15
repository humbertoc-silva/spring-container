package br.com.hcs.spring.container;

/**
 * 
 * @author Humberto
 *
 */
public class FactoryFonteDados {
    /**
     * Factory method utilizado para exemplificar a instanciação de um bean por factory method sem parâmetros.
     * Após a instanciação do bean, é realizada a injeção de valor no atributo arquivo.
     * 
     * @return Uma instância de {@link FonteDadosArquivo}.
     */
    public FonteDadosArquivo criarFonteDadosArquivo() {
        return new FonteDadosArquivo();
    }
    
    /**
     * Factory method utilizado para exemplificar a instanciação de um bean por factory method
     * utilizando uma instância da classe factory.
     * 
     * @param nome Identificador da classe que será instanciada.
     * @return Uma instância de uma classe que implementa a interface {@link IFonteDados}, definida
     *         de acordo com o valor do parâmetro {@code nome}.
     */
    public IFonteDados criarFonteDadosInstancia(String nome) {
        IFonteDados fonteDados = null;
        
        if (nome.equals("arquivo")) {
            fonteDados = new FonteDadosArquivo();
        }
        if (nome.equals("randomico")) {
            fonteDados = new FonteDadosRandomico();
        }
        
        return fonteDados;
    }
    
    /**
     * Factory method utilizado para exemplicar a instanciação de um bean por factory method estático.
     * @param nome Identificador da classe que será instanciada.
     * @return Uma instância de uma classe que implementa a interface {@link IFonteDados}, definida
     *         de acordo com o valor do parâmetro {@code nome}.
     */
    public static IFonteDados criarFonteDadosEstatico(String nome) {
        IFonteDados fonteDados = null;
        
        if (nome.equals("arquivo")) {
            fonteDados = new FonteDadosArquivo();
        }
        if (nome.equals("randomico")) {
            fonteDados = new FonteDadosRandomico();
        }
        
        return fonteDados;
    }
}

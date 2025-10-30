package padroescomportamentais.observer;

import java.util.Observable;

public class Acao extends Observable {
    private String ticker;
    private String empresa;
    private Double preco;

    public Acao(String ticker, String empresa, Double preco) {
        this.ticker = ticker;
        this.empresa = empresa;
        this.preco = preco;
    }

    public void atualizarPreco(Double novoPreco) {
        this.preco = novoPreco;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Acao{" +
                "ticker='" + ticker + '\'' +
                ", empresa='" + empresa + '\'' +
                ", preco=" + preco +
                '}';
    }
}

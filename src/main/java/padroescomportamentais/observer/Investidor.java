package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Investidor implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Investidor(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void acompanhar(Acao acao) {
        acao.addObserver(this);
    }

    public void update(Observable acao, Object arg1) {
        this.ultimaNotificacao = this.nome + ", preço atualizado na " + acao.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}

package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AcaoTest {
    @Test
    void deveNotificarUmInvestidor() {
        Acao acao = new Acao("PETR4", "Petrobras", 28.5);
        Investidor investidor = new Investidor("Investidor 1");
        investidor.acompanhar(acao);
        acao.atualizarPreco(29.0);
        assertEquals("Investidor 1, preço atualizado na Acao{ticker='PETR4', empresa='Petrobras', preco=29.0}", investidor.getUltimaNotificacao());
    }

    @Test
    void deveNotificarInvestidores() {
        Acao acao = new Acao("VALE3", "Vale", 80.0);
        Investidor inv1 = new Investidor("Investidor 1");
        Investidor inv2 = new Investidor("Investidor 2");
        inv1.acompanhar(acao);
        inv2.acompanhar(acao);
        acao.atualizarPreco(81.5);
        assertEquals("Investidor 1, preço atualizado na Acao{ticker='VALE3', empresa='Vale', preco=81.5}", inv1.getUltimaNotificacao());
        assertEquals("Investidor 2, preço atualizado na Acao{ticker='VALE3', empresa='Vale', preco=81.5}", inv2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarInvestidor() {
        Acao acao = new Acao("ITUB4", "Itaú", 25.0);
        Investidor investidor = new Investidor("Investidor 1");
        acao.atualizarPreco(25.5);
        assertEquals(null, investidor.getUltimaNotificacao());
    }

    @Test
    void deveNotificarApenasAcaoEspecifica() {
        Acao acaoA = new Acao("ABCD3", "Empresa A", 10.0);
        Acao acaoB = new Acao("EFGH4", "Empresa B", 20.0);
        Investidor inv1 = new Investidor("Investidor 1");
        Investidor inv2 = new Investidor("Investidor 2");
        inv1.acompanhar(acaoA);
        inv2.acompanhar(acaoB);
        acaoA.atualizarPreco(11.0);
        assertEquals("Investidor 1, preço atualizado na Acao{ticker='ABCD3', empresa='Empresa A', preco=11.0}", inv1.getUltimaNotificacao());
        assertEquals(null, inv2.getUltimaNotificacao());
    }
}

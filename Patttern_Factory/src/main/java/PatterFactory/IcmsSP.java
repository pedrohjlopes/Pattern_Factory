package PatterFactory;

import Model.Orcamento;

import java.math.BigDecimal;

public class IcmsSP implements CalculoPorRegiao {
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.17"));
    }
}

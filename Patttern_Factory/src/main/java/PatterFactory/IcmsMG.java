package PatterFactory;

import Model.Orcamento;

import java.math.BigDecimal;

public class IcmsMG implements CalculoPorRegiao {
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.18"));
    }
}

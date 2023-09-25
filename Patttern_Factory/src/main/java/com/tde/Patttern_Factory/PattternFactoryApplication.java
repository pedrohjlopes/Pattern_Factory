package com.tde.Patttern_Factory;


import Model.Orcamento;
import PatterFactory.IcmsFactory;

import java.math.BigDecimal;

public class PattternFactoryApplication {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000.0"), "ICMS_MG");
		IcmsFactory icmsFactory = new IcmsFactory();
		BigDecimal resultado = icmsFactory.getIcmsPorRegiao("Icms_MG").calculoPorRegiao(orcamento);
		System.out.println(resultado);

	}

}

package br.com.cod3r.abstractfactory.apple.model.certificate;

import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;

public class BrazilianCertificate implements Certificate {

	public String applyCertification() {
		return "\t- Calibrating Brasilian rules\n\t- Applying Anatel's Stamp";
	}

}

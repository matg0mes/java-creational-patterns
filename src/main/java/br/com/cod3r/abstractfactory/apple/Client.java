package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesFactory();

        IPhoneFactory genXFactory = new IPhoneXFactory(rules);
        IPhone11Factory gen11Factory = new IPhone11Factory(rules);

        System.out.println("Ordering iphone X factory");
        IPhone iPhone = genXFactory.orderIPhone("standard");

        System.out.println("Ordering iphone 11 factory highEnd");
        IPhone iPhone2 = gen11Factory.orderIPhone("highEnd");

    }
}

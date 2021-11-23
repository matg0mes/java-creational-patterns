package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
        IPhone11ProFactory iPhone11ProFactory = new IPhone11ProFactory();

        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = iPhoneXFactory.createIPhone();
        iPhone.getHardware();

        System.out.println("### Ordering an iPhone 11 HighEnd");
        IPhone iPhone2 = iPhone11ProFactory.createIPhone();
        iPhone2.getHardware();

    }
}

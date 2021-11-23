package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.model.*;

public class Client {

    public static void main(String[] args) {
        IPhoneSimpleFactory iPhoneSimpleFactory = new IPhoneSimpleFactory();

        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = iPhoneSimpleFactory.orderIphone("X", "standard");

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone2 = iPhoneSimpleFactory.orderIphone("11", "highEnd");

    }
}

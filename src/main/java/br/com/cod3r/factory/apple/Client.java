package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.model.*;

public class Client {

    public IPhone orderIphone(String generation, String level) {
        IPhone device = null;

        if (generation.equals("X")) {
            if (level.equals(("standard"))) {
                device = new IPhoneX();
            } else {
                device = new IPhoneXSMax();
            }
        } else if (generation.equals("11")) {
            if (level.equals(("standard"))) {
                device = new IPhone11();
            } else if (level.equals(("highEnd"))) {
                device = new IPhone11Pro();
            }
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    public static void main(String[] args) {
        Client client = new Client();

        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = client.orderIphone("X", "standard");
        System.out.println(iPhone);

        System.out.println("### Ordering an iPhone 11 HighEnd");
        IPhone iPhone2 = client.orderIphone("11", "highEnd");
        System.out.println(iPhone2);

    }
}

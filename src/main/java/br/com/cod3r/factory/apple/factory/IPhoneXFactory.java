package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhoneX();
    }

}

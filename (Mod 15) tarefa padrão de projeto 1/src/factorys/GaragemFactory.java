package factorys;

import Locations.Garagem;

public abstract class GaragemFactory implements AbstractFactory{

    public static AbstractFactory getFactory(Garagem.Localidades localidade){

        AbstractFactory factory;

        if(localidade.equals(Garagem.Localidades.EUA)){
            factory = new GaragemEUAFactory();
        } else if (localidade.equals(Garagem.Localidades.FRANCA)) {
            factory = new GaragemFrancaFactory();
        } else if(localidade.equals(Garagem.Localidades.BRASIL)){
            factory = new GaragemBrasilFactory();
        } else{
            System.err.println("Localidade não identificada.");
            return null;
        }
        return factory;
    }
}

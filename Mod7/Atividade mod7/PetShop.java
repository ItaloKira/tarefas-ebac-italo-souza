/**
 * @author Ítalo Souza
 */
public class PetShop {
    //criei três instâncias a partir da classe "Pets"
    public static void main(String[] args) {
    Pets pitbul = new Pets();
    Pets pincher = new Pets();
    Pets poodle = new Pets();
    Pets viraLata = new Pets();
    
    //Atribuí os valores para cada uma das 4 propriedades em cada uma das instâncias.

    pitbul.cadastrarNome("Kira");
    pitbul.setPeso(7);
    pitbul.setIdade(5);
    pitbul.setRaça("Pitbul");
    System.out.println(pitbul.toString());

    pincher.setNome("Kay");
    pincher.setIdade(9);
    pincher.setPeso(8);
    pincher.setRaça("Pincher");
    System.out.println(pincher.toString());
    
    poodle.setNome("Pingo");
    poodle.setIdade(4);
    poodle.setPeso(3);
    poodle.setRaça("Poodle");
    System.out.println(poodle.toString());

    viraLata.setNome("Mel");
    viraLata.setIdade(11);
    viraLata.setPeso(8);
    viraLata.setRaça("viraLata");
    System.out.println(viraLata.toString());
    
    // ao final imprimi os valores todos ao mesmo tempo separadamente.
    }
};
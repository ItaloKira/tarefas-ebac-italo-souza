package DAO;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private String cor;
    private short ano;
    private boolean novo;
    private float quilometragem;
    private Short cod;

   // public abstract void especificacoesMotor();


    public Veiculo(String marca, String modelo, String cor, short ano, boolean novo, short quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.novo = novo;
        this.quilometragem = quilometragem;
    }

    public Short getCod() {
        return cod;
    }

    public void setCod(Short cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString(){
        StringBuffer info = new StringBuffer();

        info.append("________________________________" + "\n");
        info.append("           VEÍCULO" + "\n");
        info.append("________________________________" + "\n");
        info.append("Marca: " + marca + "\n");
        info.append("Modelo: " + modelo + "\n");
        info.append("Cor: " + cor + "\n");
        info.append("Ano: " + ano + "\n");
        if(novo == true){
            info.append("Novo: sim" + "\n");
        } else {
            info.append("Novo: não" + "\n");
        }
        info.append("Quilometragem: " + quilometragem + " KM" + "\n");

        return info.toString();
    }
}

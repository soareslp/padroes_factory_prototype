package prototype;

public class Raca implements Cloneable{

    private String nomeRaca;
    private String porteRaca;
    private String personalidadeRaca;

    public Raca(String nomeRaca, String porteRaca, String personalidadeRaca) {
        this.nomeRaca = nomeRaca;
        this.porteRaca = porteRaca;
        this.personalidadeRaca = personalidadeRaca;
    }

    public String getNomeRaca() {
        return nomeRaca;
    }

    public void setNomeRaca(String nomeRaca) {
        this.nomeRaca = nomeRaca;
    }

    public String getPorteRaca() {
        return porteRaca;
    }

    public void setPorteRaca(String porteRaca) {
        this.porteRaca = porteRaca;
    }

    public String getPersonalidadeRaca() {
        return personalidadeRaca;
    }

    public void setPersonalidadeRaca(String personalidadeRaca) {
        this.personalidadeRaca = personalidadeRaca;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Raca{" +
                "nomeRaca='" + nomeRaca + '\'' +
                ", porteRaca='" + porteRaca + '\'' +
                ", personalidadeRaca='" + personalidadeRaca + '\'' +
                '}';
    }
}

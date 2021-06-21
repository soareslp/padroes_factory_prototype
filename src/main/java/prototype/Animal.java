package prototype;

public class Animal implements Cloneable {

    private String nomeAnimal;
    private float pesoAnimal;
    private String tipoSanguineoAnimal;
    private Raca racaAnimal;

    public Animal(String nomeAnimal, float pesoAnimal, String tipoSanguineoAnimal, Raca racaAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.pesoAnimal = pesoAnimal;
        this.tipoSanguineoAnimal = tipoSanguineoAnimal;
        this.racaAnimal = racaAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public float getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(float pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public String getTipoSanguineoAnimal() {
        return tipoSanguineoAnimal;
    }

    public void setTipoSanguineoAnimal(String tipoSanguineoAnimal) {
        this.tipoSanguineoAnimal = tipoSanguineoAnimal;
    }

    public Raca getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(Raca racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        Animal animalClone = (Animal) super.clone();
        animalClone.racaAnimal = (Raca) animalClone.racaAnimal.clone();
        return animalClone;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nomeAnimal='" + nomeAnimal + '\'' +
                ", pesoAnimal=" + pesoAnimal +
                ", tipoSanguineoAnimal='" + tipoSanguineoAnimal + '\'' +
                ", racaAnimal=" + racaAnimal +
                "}";
    }
}

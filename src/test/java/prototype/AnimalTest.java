package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Animal animal = new Animal("Lunna", 15, "A",  new Raca("Bulldog", "Grande", "Manso"));

        Animal animalClone = animal.clone();
        animalClone.setPesoAnimal(20);
        animalClone.setTipoSanguineoAnimal("O");
        animalClone.getRacaAnimal().setPorteRaca("Médio");

        assertEquals("Animal{nomeAnimal='Lunna', pesoAnimal=15.0, tipoSanguineoAnimal='A', racaAnimal=Raca{nomeRaca='Bulldog', porteRaca='Grande', personalidadeRaca='Manso'}}", animal.toString());
        assertEquals("Animal{nomeAnimal='Lunna', pesoAnimal=20.0, tipoSanguineoAnimal='O', racaAnimal=Raca{nomeRaca='Bulldog', porteRaca='Médio', personalidadeRaca='Manso'}}", animalClone.toString());
    }
}
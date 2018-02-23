package model;

import model.pets.Pet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class PetStore {
    private HashMap<String, ArrayList<Pet>> animals = new HashMap<>();
    //EFFECTS: adds p to the petstore
    public void addPet(Pet p){
        ArrayList<Pet> pets = animals.get(p.getSpecies());
        if (pets==null) {
            pets = new ArrayList<>();
        }
        pets.add(p);
        animals.put(p.getSpecies(), pets);
    }

    //EFFECTS: finds a pet matching this species and color, if it exists in the store
    public Pet findMatchingPet(String species, String color){
        ArrayList<Pet> pets = animals.get(species);

        if (pets==null){
            return null;
        }

        Pet p = new Pet(species, color, 0.00);

        if (pets.contains(p)){
            int i = pets.indexOf(p);
            return pets.get(i);
        }
        return null;
    }

    public void displayAllPetsWithAttributes(boolean friendly, boolean needsAttention, double price) {
        Collection<ArrayList<Pet>> allPets = animals.values();

        for (ArrayList<Pet> PetsMas: allPets)
        {
            displayOneSpeciesWithAttributes(PetsMas, friendly, needsAttention, price);
        };

    }

    public void displayOneSpeciesWithAttributes(ArrayList<Pet> petList, boolean friendly, boolean needsAttention, double price) {
        for (Pet pet: petList){
            if (pet.isFriendly() == friendly && pet.needsAttention() == needsAttention && pet.getPrice() <= price)
            System.out.println("Has attributes: " + pet);
        }
    }

}

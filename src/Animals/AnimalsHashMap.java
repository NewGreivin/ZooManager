/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import Lists.List;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Ricardo Chaves
 */
public class AnimalsHashMap implements List<Animal>{
    HashMap<String, Animal> map;

    public AnimalsHashMap() {
        this.map = new HashMap<>();
    }
    
    @Override
    public Animal find(Object id) {
        String idt = String.valueOf(id);
        return map.get(idt);
    }

    @Override
    public boolean remove(Animal t) {
        if(!map.containsKey(t.getId())) return false;
        map.remove(t.getId(), t);
        return true;
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Animal t) {
        if(map.containsKey(t.getId())) {
            return false;  
        }
        
        map.put(t.getId(), t);
        return true;
    }

    public HashSet<String> getEspecies(){
        HashSet<String> set = new HashSet<>();
        for (Animal animal:map.values()) {
            set.add(animal.getSpecies());
        }
        return set;
    }
}

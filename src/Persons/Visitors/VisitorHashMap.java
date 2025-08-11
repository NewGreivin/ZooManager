/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;

import Lists.List;
import java.util.HashMap;

/**
 *
 * @author Ricardo Chaves
 */
public class VisitorHashMap implements List<Visitor> {

    HashMap<String, Visitor> map;

    public VisitorHashMap() {
        this.map = new HashMap<>();
    }
    
    @Override
    public Visitor find(Object id) {
        String idt = String.valueOf(id);
        return map.get(idt);
    }

    @Override
    public boolean remove(Visitor t) {
        if(!map.containsKey(t.getId())) return false;
        map.remove(t.getId(), t);
        return true;
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Visitor t) {
        if(map.containsKey(t.getId())) return false;
        map.remove(t.getId());
        return true;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;

import Lists.List;
import java.util.HashMap;

/**
 *
 * @author Ricardo Chaves
 */
public class VisitHashMap implements List<Visit> {

    HashMap<String, Visit> map;

    public VisitHashMap() {
        this.map = new HashMap<>();
    }
    
    @Override
    public Visit find(Object Visit) {
        String idt = String.valueOf(Visit);
        return map.get(idt);
    }

    @Override
    public boolean remove(Visit t) {
        if(!map.containsKey(t.getId())) return false;
        map.remove(t.getId(), t);
        return true;
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Visit t) {
        if(map.containsKey(t.getId())) return false;
        map.remove(t.getId());
        return true;
    }
}

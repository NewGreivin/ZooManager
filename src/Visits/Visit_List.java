/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;

import Lists.List;

/**
 *
 * @author Ricardo Chaves
 */
public class Visit_List implements List<Visit> {
    private Visit list[];
    
    public Visit_List() {
        this.list = new Visit[100];
    }
    
    @Override
    public Visit find(Object id) {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if(list[i].getId().equals(id)){
                return list[i];
            }
        }
        return null;
    }

    @Override
    public boolean remove(Visit t) {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if(list[i]!=null){
                if(list[i]==t){
                    list[i]= null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void showAll() {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if(list[i]!=null){
                System.out.println(list[i].toString());
            }
        }
    }

    @Override
    public boolean add(Visit t) {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if(list[i]==null){
                list[i]=t;
                return true;
            }
        }
        return false;
    }
    
}


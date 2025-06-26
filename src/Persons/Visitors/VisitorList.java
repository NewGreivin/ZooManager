/**
 * @author Greivin
 */
package Persons.Visitors;

import Lists.List;

public class VisitorList implements List<Visitor> {
    private Visitor List[];

    public VisitorList() {
        this.List = new Visitor[100];
    }
    
    @Override
    public Visitor find(Object id) {
        String idt = String.valueOf(id);
        int max = List.length;
        for (int i = 0; i < max; i++) {
            if(List[i].getId().equals(idt)){
                return List[i];
            }
        }
        return null;
    }

    @Override
    public boolean remove(Visitor t) {
       int max = List.length;
        for (int i = 0; i < max; i++) {
            if(List[i ]== t){
            List[i] = null;
            return true;
            }
        }
        return false;
    }

    @Override
    public void showAll() {
        int max = List.length;
        for (int i = 0; i < max; i++) {
            if (List[i] != null) {
                System.out.println(List[i].toString());
            }
        }
    }

    @Override
    public boolean add(Visitor t) {
        int max = List.length;
        for (int i = 0; i < max; i++) {
            if(List[i ]== null){
            List[i] = t;
            return true;
            }
        }
        return false;
    }
    
}

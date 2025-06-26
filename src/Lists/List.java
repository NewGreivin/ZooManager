package Lists;
public interface List <T> {
    
    public T find(Object id);
    public boolean remove(T t);

    
    public void showAll();

    public boolean add(T t);

}
    
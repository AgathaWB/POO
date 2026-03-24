
import java.util.List;

public class ObjectDAOLista implements ObjectDAO{
    private List<Object> objects;

    public ObjectDAOLista() {
        this.objects = new java.util.ArrayList<>();
    }

    @Override
    public void inserir(Object object) {
        objects.add(object);
    }

    @Override
    public List<Object> listar() {
        return objects;
    }

    @Override
    public Object buscarPorId(int id) {
      for (Object o : objects) {
            if (o.getId() == id) {
                return o;
            }
        }
        return null;
    }

    @Override
    public void remover(int id) {
        Object o = buscarPorId(id);
        if(o != null){
            objects.remove(o);
            System.out.println("Produto encontrado!");
        }else{
            System.out.println("Produto não encontrado!");
        }
    }

}
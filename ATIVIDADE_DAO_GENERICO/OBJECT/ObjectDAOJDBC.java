import java.util.ArrayList;
import java.util.List;

public class ObjectDAOJDBC implements ObjectDAO {
    
    @Override
    public void inserir(Object object){
        
    }

    @Override
    public List<Object> listar(){
    
        return new ArrayList<>();
    }

    @Override
    public Object buscarPorId(int id){
        return null;
    }

    @Override
    public void remover(int id){
        return;
    }
}

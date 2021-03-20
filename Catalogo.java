import java.util.ArrayList;

public class Catalogo {
    
    ArrayList<Veiculo> cat = null;

    public Catalogo(){
        cat = new ArrayList<Veiculo>();
    }

    public void addVeiculo(Veiculo v){
        cat.add(v);   
    }

    public int size(){
        return cat.size();
    }
}

import java.util.List;
import java.util.ArrayList;

public class Jogador {
    private List<Peca> pecas;
    private String nome;
    
    public Jogador(String nome) {
        this.nome = nome;
        pecas = new ArrayList<>();
    }
    
    public void adicionarPeca(Peca p) {
        p.setJogadorDono(this);
        pecas.add(p);
    }
    
    public void removerPeca(Peca p) {
        pecas.remove(p);
    }
    
    public String getNome() {
        return nome;
    }
    
    public List<Peca> getListaPecas() {
        return pecas;
    }
    
    public boolean buscarPeca(Peca p) {
        if(pecas.contains(p)) {
            return true;
        } else {
            //System.out.println("Peça não encontrada!");
            return false;
        }
    }
}
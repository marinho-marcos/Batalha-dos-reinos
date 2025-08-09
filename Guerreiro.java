public class Guerreiro extends Peca {
    
    public Guerreiro(int x, int y) {
        super("Guerreiro", "🗡️ ", x, y);
    }
    
    @Override
    public boolean podeMoverPara(int novoX, int novoY) {
        int dx = Math.abs(novoX - this.posicaoX);
        int dy = Math.abs(novoY - this.posicaoY);
    
        // Movimento horizontal (dx = 0) ou vertical (dy = 0), até 3 casas
        return (dx == 0 && dy > 0 && dy <= 3) || (dy == 0 && dx > 0 && dx <= 3);
    }

}


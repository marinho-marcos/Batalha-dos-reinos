public class Arqueiro extends Peca {
    
    public Arqueiro(int x, int y) {
        super("Arqueiro", "🏹", x, y);
    }
    
    @Override
    public boolean podeMoverPara(int novoX, int novoY) {
        int dx = Math.abs(novoX - this.posicaoX);
        int dy = Math.abs(novoY - this.posicaoY);
    
        // Movimento diagonal: dx == dy, até 2 casas
        return dx == dy && dx > 0 && dx <= 2;
    }

}

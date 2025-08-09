public class Cavaleiro extends Peca {
    
    public Cavaleiro(int x, int y) {
        super("Cavaleiro", "🐴", x, y);
    }
    
    @Override
    public boolean podeMoverPara(int novoX, int novoY) {
        int dx = Math.abs(novoX - this.posicaoX);
        int dy = Math.abs(novoY - this.posicaoY);
    
        // Movimento em L: 2x1 ou 1x2
        return (dx <= 2 && dy <= 1) || (dx <= 1 && dy <= 2);
    }

}

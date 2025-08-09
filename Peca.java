public abstract class Peca {
    protected String nome;
    protected String simbolo;
    protected int posicaoX;
    protected int posicaoY;
    protected Jogador jogadorDono;
    
    public Peca(String nome, String simbolo, int posicaoX, int posicaoY) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }
    
    public abstract boolean podeMoverPara(int novoX, int novoY);
    
    public void moverPara(int novoX, int novoY) {
        //logica de movimentacao
        this.posicaoX = novoX;
        this.posicaoY = novoY;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getSimbolo() {
        return simbolo;
    }
    
    public int getPosicaoX() {
        return posicaoX;
    }
    
    public int getPosicaoY() {
        return posicaoY;
    }
    
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }
    
    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public void setJogadorDono(Jogador dono){
        jogadorDono = dono;
    }
    
}
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Jogo {
    private Peca[][] tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorDaVez;     
    private Jogador jogadorAdversario; 
    
    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        tabuleiro = new Peca[8][8];
        
        criarJogo();
    }
    
    private void criarJogo() {
        // posiciona as pecas do jogador 1
        for(Peca p: jogador1.getListaPecas()) {
            tabuleiro[p.getPosicaoX()][p.getPosicaoY()] = p;
        }
        
        // posiciona as pecas do jogador 2
        for(Peca p : jogador2.getListaPecas()) {
            tabuleiro[p.getPosicaoX()][p.getPosicaoY()] = p;
        }
    }
    
    public void executarJogo() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        this.jogadorDaVez = (random.nextBoolean()) ? jogador1 : jogador2;
        this.jogadorAdversario = (jogadorDaVez == jogador1) ? jogador2 : jogador1;
        
        System.out.println("\n===== ⚔️ INICIANDO A BATALHA ⚔️ =====\n");
        
        while(jogador1.getListaPecas().size() > 0 && jogador2.getListaPecas().size() > 0) {
            exibirTabuleiro();
            
            List<Peca> pecas = jogadorDaVez.getListaPecas();
            System.out.println("🕹️  Vez de " + jogadorDaVez.getNome() + ":\n");
            System.out.println("Suas peças disponíveis: ");
            
            // exibe as pecas disponíveis do jogador da vez
            for(int i = 0; i < pecas.size(); i++) {
                System.out.println("(" + (i+1) + ") - " + pecas.get(i).getNome());
            }
            
            System.out.print("Informe a peça que deseja utilizar: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
            
            Peca pecaDaVez = null;      
            
            // validando a escolha do usuário
            if (opcao > 0 && opcao <= pecas.size()) {
                pecaDaVez = pecas.get(opcao - 1);
            } else {
                System.out.println("Opção inválida. Tente novamente!\n");
                continue; // pula para a proxima iteração do loop
            }
            
            // coordenadas atuais da peça da Vez
            int posicaoX = pecaDaVez.getPosicaoX();
            int posicaoY = pecaDaVez.getPosicaoY();
            
            // solicitando nova posicao para a peca Da Vez
            System.out.println("\nAgora informe a nova linha da peça: ");
            int novaPosicaoX = scanner.nextInt();
            System.out.println("\nAgora informe a nova coluna da peça: ");
            int novaPosicaoY = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
            
            // verificando se movimento é valido
            if(!pecaDaVez.podeMoverPara(novaPosicaoX, novaPosicaoY)) {
                System.out.println("Movimento inválido. tente novamente!\n");
                continue;
            }
            
            Peca pecaNoDestino = tabuleiro[novaPosicaoX][novaPosicaoY];     // guarda o objeto da posicao de destino
            
            // Verificando se já existe uma peça do mesmo jogador na nova posição
            if(pecaNoDestino != null && jogadorDaVez.buscarPeca(pecaNoDestino)) {                        
                System.out.println("Já existe outra peça sua nessa posição. Tente outro movimento...\n");
                continue;
            }
            
            //if(pecaNoDestino != null && jogadorDaVez.buscarPeca(pecaNoDestino)
            
            // realizando movimento da peca
            System.out.println("\nMovendo peça...");
            pecaDaVez.moverPara(novaPosicaoX, novaPosicaoY);
            
            // logica para captura (se houver)
            if(pecaNoDestino != null) {
                System.out.println("Peça " + pecaDaVez.getNome() + pecaDaVez.getSimbolo() +" derrubou a peça " + pecaNoDestino.getNome() + pecaNoDestino.getSimbolo() + " do adversário!\n");
                jogadorAdversario.removerPeca(pecaNoDestino);
            }
            
            // atualizando tabuleiro
            tabuleiro[novaPosicaoX][novaPosicaoY] = pecaDaVez;
            tabuleiro[posicaoX][posicaoY] = null;                   
            
            alternarTurno();
        }
        
        // após um dos jogadores ficarem sem peças, informar o vencedor
        exibirTabuleiro();
        anunciarVencedor();

        scanner.close();
    }
    
    private void alternarTurno() {
        Jogador temp = this.jogadorDaVez;
        this.jogadorDaVez = this.jogadorAdversario;
        this.jogadorAdversario = temp;
    }
    
    private void exibirTabuleiro() {
        System.out.println("\n --- Jogador 1 ---");
        for(int i = 0; i < 8; i++) {
            System.out.print(i + "");
            
            for(int j = 0; j < 8; j++) {
                if(tabuleiro[i][j] != null) {
                    System.out.print(tabuleiro[i][j].getSimbolo() + " ");
                } else {
                    System.out.print("⬜ "); 
                }
                
            }
            System.out.println(" ");
        }
        System.out.println(" --- Jogador 2 ---\n");
    }
    
    private void anunciarVencedor() {
        if (jogador1.getListaPecas().isEmpty()) {
            System.out.println("🏆 O jogador " + jogador2.getNome() + " venceu a partida!!!");
        } else {
            System.out.println("🏆 O jogador " + jogador1.getNome() + " venceu a partida!!!");
        }
    }
}
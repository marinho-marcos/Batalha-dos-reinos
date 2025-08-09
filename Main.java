import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== ⚔️  BEM-VINDO A BATALHA DOS REINOS ⚔️ =====\n");
        
        // solicitando os dados do jogador 1
        System.out.println("Informe o nome do Jogador 1: ");
        String nome1 = scanner.nextLine();
        Jogador jogador1 = new Jogador(nome1);
        
        jogador1.adicionarPeca(new Guerreiro(0, 2));
        jogador1.adicionarPeca(new Arqueiro(0, 3));
        jogador1.adicionarPeca(new Cavaleiro(0, 4));
        
        // solicitando os dados do jogador 1
        System.out.println("Informe o nome do Jogador 2: ");
        String nome2 = scanner.nextLine();
        Jogador jogador2 = new Jogador(nome2);
        
        jogador2.adicionarPeca(new Guerreiro(7, 2));
        jogador2.adicionarPeca(new Arqueiro(7, 3));
        jogador2.adicionarPeca(new Cavaleiro(7, 4));
        
        Jogo jogo = new Jogo(jogador1, jogador2);
        jogo.executarJogo();

        scanner.close();
    }
}
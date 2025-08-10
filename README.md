# ⚔️ Batalha dos Reinos

> Um jogo de estratégia em turnos para dois jogadores, executado via console e construído inteiramente com Java.

![Demonstração do Jogo](https://i.imgur.com/3c8iWqJ.gif)
---

## 📝 Sobre o Projeto

**Batalha dos Reinos** é um jogo de tabuleiro estratégico onde dois jogadores se enfrentam com o objetivo de eliminar todas as peças do adversário. O projeto foi desenvolvido em Java puro, com foco em aplicar os princípios da **Programação Orientada a Objetos (OOP)** para criar uma lógica de jogo robusta e modular.

Cada jogador controla um exército de peças com habilidades de movimentação únicas, em um tabuleiro de 8x8. O jogo demonstra a implementação de lógica de turnos, validação de movimentos, sistema de captura e condições de vitória, tudo isso em uma interface de console interativa.

---

## ✨ Funcionalidades

* **Jogabilidade em Turnos:** O controle passa de um jogador para o outro a cada movimento.
* **Início Aleatório:** O jogador que começa a partida é escolhido aleatoriamente.
* **Tabuleiro Interativo:** O estado do jogo é exibido no console após cada jogada, mostrando a posição de todas as peças.
* **Sistema de Captura:** Mova uma de suas peças para uma casa ocupada por uma peça inimiga para capturá-la e removê-la do jogo.
* **Validação de Movimentos:** O jogo verifica se o movimento desejado obedece às regras da peça selecionada.
* **Condição de Vitória:** O jogo termina quando um dos jogadores captura todas as peças do oponente, declarando o jogador restante como vencedor.

---

## ♟️ As Peças e Seus Movimentos

Cada peça possui um padrão de movimento único, definido em sua respectiva classe.

* **Guerreiro (🗡️):** Move-se na horizontal ou na vertical, até 3 casas por turno.
* **Arqueiro (🏹):** Move-se na diagonal, até 2 casas por turno.
* **Cavaleiro (🐴):** _(Adicione aqui a regra de movimento do cavaleiro quando implementá-la)._

---

## 🚀 Tecnologias Utilizadas

* **Linguagem:** [Java](https://www.java.com/pt-BR/)
* **Paradigmas:** Programação Orientada a Objetos (OOP)
* **Ferramentas:** Estruturas de Dados (Matrizes, Listas), Manipulação de Console
* **Versionamento:** [Git](https://git-scm.com/)

---

## ▶️ Como Executar o Projeto

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina o **[Java JDK 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)** ou superior.

### Rodando o Jogo

Como o projeto não utiliza gerenciadores de dependência, a compilação e execução são feitas diretamente via terminal.

```bash
# 1. Clone este repositório
$ git clone [https://github.com/marinho-marcos/Batalha-dos-reinos](https://github.com/marinho-marcos/Batalha-dos-reinos)

# 2. Acesse a pasta do projeto no terminal/cmd
$ cd Batalha-dos-reinos

# 3. Compile todos os arquivos .java
# (Este comando compila todos os arquivos Java na pasta)
$ javac *.java

# 4. Execute a classe principal para iniciar o jogo
$ java Main

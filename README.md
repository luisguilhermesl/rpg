# JogoRPG

Este é um projeto de um jogo RPG simples em Java, que utiliza programação orientada a objetos. O objetivo do jogo é ajustar os atributos de três personagens: Mago, Guerreiro e Arqueiro, de acordo com os requisitos especificados.

## Descrição do Jogo

- **Mago**: Deve ter 10 de magia e 10 de defesa.
- **Guerreiro**: Deve ter 10 de ataque e 10 de defesa.
- **Arqueiro**: Deve ter 10 de ataque.

## Funcionalidades

- Escolha de personagem (Mago, Guerreiro, Arqueiro).
- Visualização e ajuste dos atributos dos personagens.
- Equipar itens que modificam os atributos dos personagens.
- Conexão com banco de dados MySQL para salvar e carregar os atributos dos personagens.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

1. `Esfolha`: Classe principal que inicia o jogo.
2. `Personagem`: Classe base para os personagens com atributos comuns.
3. `Mago`, `Guerreiro`, `Arqueiro`: Classes específicas para cada tipo de personagem.
4. `Inventario`: Classe responsável pela lógica do jogo, incluindo a escolha de personagens e equipamentos.
5. `Database`: Classe responsável pela conexão com o banco de dados MySQL e operações de CRUD.

## Pré-requisitos

- Java 8 ou superior
- MySQL
- Conector JDBC para MySQL

## Configuração do Banco de Dados

Execute o seguinte script SQL para criar o banco de dados e a tabela necessária:

```sql
-- Criar o banco de dados
CREATE DATABASE JogoRPG;

-- Usar o banco de dados criado
USE JogoRPG;

-- Criar a tabela personagens
CREATE TABLE personagens (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    ataque INT NOT NULL,
    stamina INT NOT NULL,
    vida INT NOT NULL,
    defesa INT NOT NULL
);
```

## Configuração do Projeto

Clone o repositório:

```sh
git clone https://github.com/seu-usuario/JogoRPG.git
cd JogoRPG
```

Adicione o conector JDBC para MySQL ao seu projeto.

Atualize as credenciais do banco de dados na classe Database:

```java
private static final String URL = "jdbc:mysql://localhost:3306/";
private static final String USER = "seu_usuario";
private static final String PASSWORD = "sua_senha";
```

Compile e execute o programa:
```sh
javac Esfolha.java
java Esfolha
```

## Uso
Ao iniciar o jogo, você verá as seguintes opções:

1. Escolha de personagem (Mago, Guerreiro, Arqueiro).
2. Visualização dos atributos do personagem selecionado.
3. Equipar itens para modificar os atributos dos personagens.
4. Salvar e carregar os atributos dos personagens do banco de dados.
   
## Exemplo de Jogo

```java

Olá! Sua missão é ajustar os atributos dos personagens.
Aperte 'enter' para começar.

Selecione a classe:
1. Mago
2. Arqueiro
3. Guerreiro

# Escolha '1' para Mago

Mago:
1. Ver atributos
2. Equipar item
3. Voltar

# Escolha '2' para Equipar item

Escolha o item para equipar:
1. Cajado (+4 Ataque)
2. Poção de Energia (+3 Stamina)
3. Ervas Medicinais (+0 Vida)
4. Poção Mágica (+5 Magia)
5. Armadura (+5 Defesa)

# Após equipar itens, veja os atributos atualizados e verifique a missão.

```

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença
Este projeto está licenciado sob a MIT License.

## Contato
Autor: Seu Nome
Email: seu-email@example.com














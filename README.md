# Exercícios de POO em Java

## Índice
1. [Visão Geral](#visão-geral)
2. [Como Executar](#como-executar)
3. [Atividades](#atividades)
5. [Licença](#licença)

## Visão Geral
Este repositório foi criado para praticar os principais conceitos de **Orientação a Objetos (POO)** utilizando a linguagem **Java**, integrando-os com lógica de programação fundamental. Cada exercício abordará um aspecto diferente da POO, enquanto trabalha com estruturas como condições, laços de repetição, arrays, e operadores.

## Como Executar
Para rodar os exercícios em **Java 8+** em uma IDE (como IntelliJ IDEA, Eclipse, NetBeans ou outra), siga os seguintes passos:

**Clone o repositório**:

- Clone o repositório usando o comando Git abaixo, ou baixe o código como arquivo ZIP e extraia-o em seu computador.
```bash
git clone https://github.com/lrsanttos-dev/lp-java-2024.git
```

**Abra a IDE**:

- Abra sua IDE de preferência (como IntelliJ IDEA, Eclipse, ou NetBeans).

**Importe o projeto**:

- Se estiver usando o IntelliJ IDEA ou Eclipse, abra o projeto clonando o repositório diretamente ou selecionando a pasta onde você extraiu o código.
- No IntelliJ IDEA: `File -> Open` e selecione o diretório do projeto.
- No Eclipse: `File -> Import` e escolha a opção para importar um projeto existente.

**Compile e execute o código**:

- Após importar o projeto na IDE, você pode simplesmente clicar com o botão direito no arquivo da atividade (ex: `Exercicio1.java`) e selecionar a opção de **Run** ou **Executar**.
- Sua IDE automaticamente irá compilar o código e executar o programa.

## Atividades
### 1. **Classe Simples e Atributos**
Crie uma classe *Produto* com os atributos *nome*, *preco* e *quantidadeEmEstoque*. Adicione métodos *adicionarEstoque(int quantidade)* e *removerEstoque(int quantidade)*. Use um laço de repetição no método *adicionarEstoque* para garantir que o estoque seja adicionado corretamente.

### 2. **Modificadores de Acesso e Getters/Setters**
Crie uma classe *ContaBancaria* com os atributos *saldo* e *titular*. Utilize modificadores de acesso para proteger os dados e crie os métodos *depositar(double valor)* e *sacar(double valor)*. Use estruturas     condicionais para impedir que o saque ultrapasse o saldo.

### 3. **Sobrecarga de Métodos**

Crie uma classe *Calculadora* com dois métodos *somar()*, um que recebe dois parâmetros e outro que recebe três parâmetros. Aplique sobrecarga de métodos para somar esses valores e mostre o resultado.

### 4. **Estruturas Condicionais e Métodos**

Crie uma classe *Aluno* com o atributo *notaFinal*. Implemente um método *verificarAprovacao()* que imprime "Aprovado" se a nota for maior ou igual a 6, caso contrário, imprime "Reprovado". Utilize estrutura condicional (if-else).

### 5. **Laços de Repetição e Arrays**

 Crie uma classe *NotaAluno* que recebe um array de notas de 5 alunos. Calcule e imprima a média de cada aluno, utilizando um laço de repetição (for).

### 6. **Associação entre Objetos**

Crie duas classes: *Carro* e *Motor*. A classe *Carro* deve ter um atributo do tipo  *Motor (associação)*. No método *exibirDetalhes*, mostre as informações do carro e do motor. Utilize laços de repetição para exibir múltiplos carros com motores diferentes.

### 7. **Herança e Sobrescrita de Métodos**

Crie uma classe *Animal* com o método *fazerSom()*. Crie as subclasses *Cachorro* e *Gato*, que sobrescrevem esse método. Dentro do método *fazerSom()* use condicional para decidir qual som é emitido, dependendo do animal.

### 8. **Classe Abstrata**

Crie uma classe abstrata *Funcionario* com o método abstrato *calcularSalario()*. Implemente duas subclasses *FuncionarioHorista* e *FuncionarioMensalista*, que calculam o salário de maneira diferente. Dentro de cada método, utilize condicionais para verificar o tipo de pagamento.

### 9. **Interfaces e Implementação**

Crie uma interface *Imprimivel* com o método *imprimir()*. Crie duas classes, *Relatorio* e *Fatura*, que implementam a interface. No método *imprimir()*, utilize laços de repetição para imprimir a lista de itens.

### 10. **Polimorfismo**

Crie uma classe *Forma* com o método *calcularArea()*. Crie as subclasses *Círculo* e *Retângulo*, que implementam esse método. Demonstre polimorfismo chamando o método *calcularArea()* de diferentes formas (círculo e retângulo) e utilizando operadores aritméticos para calcular as áreas.

### 11. **Uso de Exceções Personalizadas**

Crie uma classe *ContaCorrente* com o método *sacar(double valor)*. Lançar uma exceção personalizada *SaldoInsuficienteException* caso o valor solicitado para saque seja maior que o saldo. Utilize estruturas condicionais para verificar a situação do saldo.

###  12. **Herança com Array de Objetos**

Crie as classes *Funcionario* e *Gerente* (herança). Em um método na classe *Main*, crie um array de objetos de *Funcionario* (que pode conter tanto Funcionario quanto Gerente) e calcule o salário de cada um com base nos respectivos atributos. Use laços de repetição para iterar sobre o array.

### 13. **Modificadores de Acesso e Array de Objetos**

Crie a classe *Aluno* com atributos nome e nota. Crie um array de objetos *Aluno* e exiba o nome de todos os alunos que possuem uma nota maior que 7, utilizando estrutura condicional e laço de repetição.

### 14. **Métodos Estáticos e Arrays**

Crie uma classe *Estatisticas* com um método estático calcularMedia(int[] notas)*.* No método principal, crie um array de inteiros com 10 notas e calcule a média utilizando o método estático. Use operadores aritméticos para calcular a média.

### 15. **Associação e Laços de Repetição**

Crie as classes *Biblioteca* e *Livro*. A classe *Biblioteca* deve conter um array de livros. Crie um método *exibirLivros()* que percorre o array e imprime o título de cada livro utilizando um laço de repetição.

### 16. **Polimorfismo com Array de Objetos**

Crie uma classe *FormaGeometrica* com um método *desenhar()*. Crie as subclasses *Círculo* e *Quadrado*, que implementam esse método de maneira diferente. Utilize um array de objetos de *FormaGeometrica* e faça um laço de repetição para chamar o método *desenhar()* de cada objeto, demonstrando polimorfismo.

### 17. **Uso de Exceções com Arrays**

Crie um programa que recebe 10 números inteiros e os armazena em um array. Caso o usuário digite um valor não numérico, lance uma exceção *InputMismatchException* e trate essa exceção adequadamente. Use laços de repetição para coletar os números.

### 18. **Sobrecarga de Métodos e Condicional**

Crie uma classe *Impressora* com dois métodos *imprimir()*. Um método deve receber um array de strings e o outro um único valor de string. Dentro dos métodos, utilize estruturas condicionais para exibir a mensagem correta dependendo do tipo de entrada.

### 19. **Interfaces com Laços de Repetição**

Crie uma interface *Calculavel* com o método *calcularPreco()*. Crie duas classes que implementam essa interface: *Produto* e *Servico*. Crie um array de objetos do tipo *Calculavel* e percorra o array para calcular o preço total dos itens, utilizando laços de repetição.

### 20. **Uso de Exceções com Arrays**

Crie uma classe *Carteira* com um método *removerDinheiro(double valor)*. Se o valor a ser removido for maior que o saldo, lance uma exceção *SaldoInsuficienteException*. Utilize estruturas condicionais para verificar se a carteira tem saldo suficiente antes de tentar remover o valor.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](./LICENSE) para mais detalhes.

Atividade de TPA - Array
Explicação da lógica dos 7 exercícios

Exercício 1 - Array armazenando 10 nomes e indexando em ordem crescente:

Definir o Pacote:
Primeiro, eu começo definindo o pacote do meu programa como ex1_array. Isso organiza o código dentro de uma estrutura de pacotes em Java.

Importar Bibliotecas:
Em seguida, eu importo as bibliotecas necessárias. Importo java.util.Arrays, que me permitirá usar métodos de manipulação de arrays, e java.util.Scanner, que vou usar para ler a entrada do usuário.

Criar a Classe:
Eu defino uma classe chamada ex1_array. No Java, tudo precisa estar dentro de uma classe, então essa será a estrutura principal do meu código.

Método Principal:
Dentro da classe, eu crio o método main, que é o ponto de entrada do programa. Este é o método que será executado quando eu rodar o programa.

Criar o Scanner:
Eu crio um objeto Scanner chamado sc. Isso me permitirá capturar as entradas do usuário a partir do console.

Declarar o Array:
Eu declaro um array de String chamado nomes com tamanho 10. Esse array será usado para armazenar os 10 nomes que o usuário vai inserir.

Solicitar Nomes:
Eu imprimo uma mensagem no console pedindo para o usuário digitar 10 nomes. Isso ajuda a orientar o usuário sobre o que fazer.

Preencher o Array:
Em seguida, eu uso um loop for que itera de 0 até 9 (o comprimento do array menos um).
Dentro do loop, eu uso sc.nextLine() para ler cada nome que o usuário digita e armazená-lo na posição correspondente do array nomes.

Ordenar os Nomes:
Após o loop, eu uso Arrays.sort(nomes) para ordenar o array nomes em ordem alfabética. Esse método organiza os elementos do array, facilitando a visualização.

Exibir os Nomes Ordenados:
Eu imprimo uma mensagem no console informando que agora vou mostrar os nomes em ordem crescente.
Em seguida, uso outro loop for-each para percorrer o array ordenado. Para cada nome no array, eu imprimo o nome no console.

Exercício 2 - Array armazenando 20 nomes e indexando em ordem decrescente:

Definir o Pacote:
Eu começo definindo o pacote do meu programa como ex2_array. Isso mantém meu código organizado dentro de uma estrutura de pacotes em Java.

Importar Bibliotecas:
Em seguida, eu importo as bibliotecas necessárias. Importo java.util.Collections para que eu possa usar métodos de manipulação de coleções, java.util.Arrays para manipular arrays, e java.util.Scanner para ler a entrada do usuário.

Criar a Classe:
Eu defino uma classe chamada ex2_array. Assim como no primeiro código, isso serve como a estrutura principal do meu programa.

Método Principal:
Dentro da classe, eu crio o método main, que é o ponto de entrada do programa. Este método será executado quando eu rodar o programa.

Criar o Scanner:
Eu crio um objeto Scanner chamado sc, que vai me permitir capturar as entradas do usuário a partir do console.

Declarar o Array:
Eu declaro um array de String chamado nomes com tamanho 20. Esse array será utilizado para armazenar os 20 nomes que o usuário irá inserir.

Solicitar Nomes:
Eu imprimo uma mensagem no console pedindo para o usuário digitar 20 nomes. Essa mensagem é para orientar o usuário sobre o que fazer.

Preencher o Array:
Eu uso um loop for que itera de 0 até 19 (o comprimento do array menos um).
Dentro do loop, eu uso sc.nextLine() para ler cada nome que o usuário digita e armazená-lo na posição correspondente do array nomes.

Ordenar os Nomes:
Após o loop, eu uso Arrays.sort(nomes, Collections.reverseOrder()) para ordenar o array nomes em ordem decrescente. Esse método organiza os elementos do array de forma que os nomes apareçam do maior para o menor.

Exibir os Nomes Ordenados:
Eu imprimo uma mensagem no console informando que agora vou mostrar os nomes em ordem decrescente.
Em seguida, uso um loop for-each para percorrer o array ordenado. Para cada nome no array, eu imprimo o nome no console.

Exercício 3 - Array armazenando 50 números e indexando em ordem crescente:

Definir o Pacote:
O código começa com a definição do pacote ex3_array, que organiza o código dentro de uma estrutura de pacotes.

Importar Bibliotecas:
Em seguida, eu importo as bibliotecas necessárias. Importo java.util.Arrays, que me permitirá usar métodos de manipulação de arrays, e java.util.Scanner, que vou usar para ler a entrada do usuário.

Criar a Classe:
Eu defino uma classe chamada ex3_array. Toda a lógica do programa estará contida nessa classe.

Método Principal:
Dentro da classe, eu crio o método main, que é o ponto de entrada do programa. Esse método é o que será executado ao iniciar o programa.

Criar o Scanner:
Eu crio um objeto Scanner chamado sc, que me permite ler a entrada do usuário a partir do console.

Declarar o Array:
Eu declaro um array de int chamado numeros com tamanho 50. Esse array será usado para armazenar os 50 números que o usuário irá digitar.

Solicitar Números:
Eu imprimo uma mensagem no console pedindo para o usuário digitar 50 números. Essa mensagem orienta o usuário sobre o que deve fazer.

Preencher o Array:
Eu uso um loop for que itera de 0 a 49 (o comprimento do array menos um).
Dentro do loop, eu uso sc.nextInt() para ler cada número que o usuário digita e armazená-lo na posição correspondente do array numeros.

Ordenar o Array:
Após o loop, eu uso Arrays.sort(numeros) para ordenar o array numeros em ordem crescente. Esse método organiza os elementos do array de forma que fiquem do menor para o maior.

Exibir os Números Ordenados:
Eu imprimo uma mensagem no console informando que agora vou mostrar os números em ordem crescente.
Em seguida, uso um loop for-each para percorrer o array ordenado. Para cada numero no array, eu imprimo o número no console.

Exercício 4 - Array armazenando 50 números e indexando em ordem decrescente:

Definir o Pacote:
O código começa com a definição do pacote ex4_array, organizando o código em uma estrutura de pacotes.

Importar Bibliotecas:
Em seguida, eu importo as bibliotecas necessárias. Importo java.util.Arrays, que me permitirá usar métodos de manipulação de arrays, e java.util.Scanner, que vou usar para ler a entrada do usuário.

Criar a Classe:
Eu defino uma classe chamada ex4_array, onde toda a lógica do programa estará contida.

Método Principal:
Dentro da classe, eu crio o método main, que é o ponto de entrada do programa. Este método será executado ao iniciar o programa.

Criar o Scanner:
Eu crio um objeto Scanner chamado sc, permitindo ler a entrada do usuário a partir do console.

Declarar o Array:
Eu declaro um array de int chamado numeros com tamanho 50. Esse array será usado para armazenar os 50 números que o usuário digitar.

Solicitar Números:
Eu imprimo uma mensagem no console pedindo ao usuário que digite 50 números. Essa mensagem serve para orientar o usuário.

Preencher o Array:
Eu uso um loop for que itera de 0 a 49 (o comprimento do array menos um).
Dentro do loop, uso sc.nextInt() para ler cada número digitado pelo usuário e armazená-lo na posição correspondente do array numeros.

Ordenar o Array:
Após o loop, eu uso Arrays.sort(numeros) para ordenar o array numeros em ordem crescente. Esse método organiza os números do menor para o maior.

Inverter o Array:
Eu uso um loop for que itera até a metade do array (numeros.length / 2).
Dentro desse loop, eu troco os elementos: o primeiro elemento é trocado com o último, o segundo com o penúltimo, e assim por diante. Para isso, uso uma variável temporária (temp) para realizar a troca.

Exibir os Números Ordenados:
Eu imprimo uma mensagem no console informando que agora vou mostrar os números em ordem decrescente.
Em seguida, uso um loop for-each para percorrer o array. Para cada numero no array, imprimo o número no console.

Exercício 5 - Array armazenando 100 números e indexando números pares:

Definir o Pacote:
O código começa com a definição do pacote ex5_array, que organiza o código em uma estrutura de pacotes.

Importar Bibliotecas:
Em seguida, eu importo as bibliotecas necessárias. Importo java.util.Arrays, que me permitirá usar métodos de manipulação de arrays, e java.util.Scanner, que vou usar para ler a entrada do usuário.

Criar a Classe:
Eu defino uma classe chamada ex5_array, onde toda a lógica do programa estará contida.

Método Principal:
Dentro da classe, eu crio o método main, que é o ponto de entrada do programa. Este método será executado ao iniciar o programa.

Criar o Scanner:
Eu crio um objeto Scanner chamado sc, permitindo ler a entrada do usuário a partir do console.

Declarar o Array:
Eu declaro um array de int chamado numero com tamanho 100. Esse array será utilizado para armazenar os 100 números que o usuário irá digitar.

Solicitar Números:
Eu imprimo uma mensagem no console pedindo para o usuário digitar 100 números. Essa mensagem orienta o usuário sobre o que deve fazer.

Preencher o Array:
Eu uso um loop for que itera de 0 a 99 (o comprimento do array menos um).
Dentro do loop, imprimo a mensagem "Número" seguido pelo índice atual + 1 (para tornar a contagem amigável ao usuário) e uso sc.nextInt() para ler cada número digitado e armazená-lo na posição correspondente do array numero.

Ordenar o Array:
Após o loop, uso Arrays.sort(numero) para ordenar o array numero em ordem crescente. Esse método organiza os números do menor para o maior.

Exibir Números Pares:
Eu uso outro loop for para percorrer o array numero.
Dentro desse loop, uso uma estrutura condicional if para verificar se cada número é par (usando numero[i] % 2 == 0).
Se o número for par, imprimo a mensagem "Os números pares são: " seguida pelo número par.

Exercício 6 - Array armazenando 100 números e indexando números impares:

Definir o Pacote:
O código começa com a definição do pacote ex6_array, organizando o código dentro de uma estrutura de pacotes.

Importar Bibliotecas:
Em seguida, eu importo as bibliotecas necessárias. Importo java.util.Arrays, que me permitirá usar métodos de manipulação de arrays, e java.util.Scanner, que vou usar para ler a entrada do usuário.

Criar a Classe:
Eu defino uma classe chamada ex6_array, que conterá toda a lógica do programa.

Método Principal:
Dentro da classe, eu crio o método main, que é o ponto de entrada do programa. Este método será executado quando eu rodar o programa.

Criar o Scanner:
Eu crio um objeto Scanner chamado sc, permitindo ler a entrada do usuário a partir do console.

Declarar o Array:
Eu declaro um array de int chamado numero com tamanho 100. Esse array será utilizado para armazenar os 100 números que o usuário vai digitar.

Solicitar Números:
Eu imprimo uma mensagem no console pedindo para o usuário digitar 100 números. Essa mensagem orienta o usuário sobre o que deve fazer.

Preencher o Array:
Eu uso um loop for que itera de 0 a 99 (o comprimento do array menos um).
Dentro do loop, imprimo a mensagem "Número" seguido pelo índice atual + 1 e uso sc.nextInt() para ler cada número digitado e armazená-lo na posição correspondente do array numero.

Ordenar o Array:
Após o loop, eu uso Arrays.sort(numero) para ordenar o array numero em ordem crescente. Isso organiza os números do menor para o maior.

Exibir Números Ímpares:
Eu uso outro loop for para percorrer o array numero.
Dentro desse loop, uso uma estrutura condicional if para verificar se cada número é ímpar (usando numero[i] % 2 != 0).
Se o número for ímpar, imprimo a mensagem "Os números ímpares são: " seguida pelo número ímpar.

Exercício 7 - Array armazenado a tabela de classificação do campeonato brasileiro atual:

Definir o Pacote:
O código começa com a definição do pacote ex7_array, organizando o código dentro de uma estrutura de pacotes.

Importar Bibliotecas:
Neste caso, eu importo apenas a biblioteca java.util.Arrays, embora não a utilize diretamente, mas pode ser útil em modificações futuras.

Criar a Classe:
Eu defino uma classe chamada ex7_array, que conterá toda a lógica do programa.

Método Principal:
Dentro da classe, eu crio o método main, que é o ponto de entrada do programa. Esse método será executado quando eu rodar o programa.

Declarar o Array:

Eu declaro um array de String chamado br que contém os nomes dos times da Série A do Campeonato Brasileiro de 2024. O array é inicializado com 20 elementos, representando as equipes.

Imprimir Tabela:
Eu imprimo uma mensagem no console informando que vou mostrar a tabela do Brasileirão Série A 2024.
Em seguida, uso um loop for que itera sobre o array br.
Dentro do loop, imprimo a classificação de cada time, formatando a saída com o índice + 1 (para exibir a posição correta) seguido pelo nome do time.

# Practical Test / Teste Prático  : Premium Minds 
[English](#pokemon-catch-them-all) / [Português](#pokemon-apanhá-los-todos)

<p align="center">
<img src="https://img.shields.io/static/v1?&message=Java&color=blue?style=plastic&logo=Java" alt="Java" />
<img alt="Repository size" src="https://img.shields.io/github/repo-size/fmreina/pokemon-premium-minds">
<img alt="Code size" src="https://img.shields.io/github/languages/code-size/fmreina/pokemon-premium-minds">
<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/fmreina/pokemon-premium-minds">
</p>

# Pokemon: Catch them all! 
Ash is picking up Pokemon in a world that consists of an infinite two-dimensional grid of houses.
In each house there is exactly one pokemon. 
Ash starts by picking up the Pokemon that is in the house where he starts.
Then, move to the house immediately to the north, south, east or west of where you are and pick up the Pokemon that is there, and so on. 
Attention: if he passes a house where he has already (and, therefore, where he has already caught a pokemon), there is no longer a pokemon for him to catch!
What we want to know is: starting with a world full of pokemons (one in each house!), How many pokemons does Ash pick up for a given sequence of movements?

### Input format
The program should read a line from stdin, which contains a sequence of movements. Each movement is described by a letter N, S, E or O (respectively: north, south, east, west).

### Output format
The program should write a line for stdout, with just a number: how many pokémons did Ash catch?

### Exemples
|            |          |   |             |   |
|------------|----------|---|-------------|---|
|**Input 1:**|E         |   |**Output 1:**| 2 |
|**Input 2:**|NESW      |   |**Output 2:**| 4 |
|**Input 3:**|NSNSNSNSNS|   |**Output 3:**| 2 |
|            |          |   |             |   |

### Execution
An executable jar is available at `/classes/artifats/pokemon_jar/`. You may also recompile this project.

There are three execution modes to run:
* Using parameter ` fun `: It will print in the console a welcome message, request an input, and print the results with a congratulation message.
```console
$ java -jar pokemon.jar fun
```
* Passing the input as a parameter: ` NESW ` : It will print only the result value.
```console
$ java -jar pokemon.jar NESW
```

* With no parameters: It will print in the console a request an input message, and the result value.
```console
$ java -jar pokemon.jar
```

#
#

# Pokemon: apanhá-los todos!
O Ash está a apanhar pokémons num mundo que consiste numa grelha bidimensional infinita de casas.
Em cada casa há exatamente um pokémon. 
O Ash começa por apanhar o pokémon que está na casa onde começa. 
A seguir, move-se para a casa imediatamente a norte, sul, este ou oeste de onde se encontra e apanha o pokémon que aí se encontrar, e assim sucessivamente. 
Atenção: se ele passar numa casa onde já passou (e, portanto, onde já apanhou um pokémon), já lá não está um pokémon para ele apanhar!
O que queremos saber é: começando com um mundo cheio de pokémons (um em cada casa!), quantos pokémons o Ash apanha para uma dada sequência de movimentos?

### Formato do input
O programa deve ler uma linha do stdin, que contém uma sequência de movimentos. Cada movimento é descrito por uma letra N, S, Eou O(respetivamente: norte, sul, este, oeste).

### Formato do output
O programa deve escrever uma linha para o stdout, apenas com um número: quantos pokémons o Ash apanhou?

### Exemplos
|            |          |   |             |   |
|------------|----------|---|-------------|---|
|**Input 1:**|E         |   |**Output 1:**| 2 |
|**Input 2:**|NESO      |   |**Output 2:**| 4 |
|**Input 3:**|NSNSNSNSNS|   |**Output 3:**| 2 |
|            |          |   |             |   |

### Execução
Um arquivo jar executavel está disponível em `/classes/artifats/pokemon_jar/`. Você também pode recompilar este projeto.

Existem três modos de execução:
* Usando o parâmetro `fun`: Irá imprimir no console uma mensagem de boas-vindas, solicitar uma entrada e imprimir os resultados com uma mensagem de felicitações.
```console
$ java -jar pokemon.jar fun
```
* Passando a entrada como um parâmetro: `NESW`: Imprime apenas o valor do resultado.
```console
$ java -jar pokemon.jar NESW
```

* Sem parâmetros: Irá imprimir no console uma mensagem solicitando uma entrada e no fim o valor do resultado.
```console
$ java -jar pokemon.jar
```







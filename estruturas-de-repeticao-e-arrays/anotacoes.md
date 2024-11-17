
# Loops de Repetição em Java

Os loops de repetição em Java permitem executar um bloco de código várias vezes, desde que uma condição seja atendida. Eles são essenciais quando você precisa realizar uma tarefa repetitiva, como iterar sobre elementos de uma lista ou realizar cálculos repetidos.

## Tipos de Loops em Java

Java oferece três tipos principais de loops de repetição:

### 1. **For Loop**

O `for` é usado quando você sabe o número exato de iterações que deseja realizar. A sintaxe básica é:

```java
for (inicialização; condição; incremento) {
    // Bloco de código a ser executado
}
```

- **Inicialização**: A variável de controle do loop é inicializada uma vez.
- **Condição**: O loop continua enquanto essa condição for verdadeira.
- **Incremento**: Após cada iteração, a variável de controle é atualizada.

**Exemplo:**

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

Este loop imprime os números de 0 a 4. A variável `i` começa em 0 e é incrementada até que a condição `i < 5` não seja mais verdadeira.

### 2. **While Loop**

O `while` é utilizado quando você não sabe o número exato de iterações e deseja que o loop continue enquanto uma condição for verdadeira. A sintaxe básica é:

```java
while (condição) {
    // Bloco de código a ser executado
}
```

- A condição é verificada **antes** de cada iteração.
- Se a condição for falsa na primeira verificação, o bloco de código pode não ser executado.

**Exemplo:**

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

Este loop `while` imprime os números de 0 a 4. A variável `i` começa em 0 e é incrementada até que a condição `i < 5` não seja mais verdadeira.

### 3. **Do-While Loop**

O `do-while` é similar ao `while`, mas a diferença crucial é que no `do-while`, o bloco de código **sempre será executado pelo menos uma vez**, porque a condição é verificada **após** a execução do código. A sintaxe é:

```java
do {
    // Bloco de código a ser executado
} while (condição);
```

**Exemplo:**

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

Este loop `do-while` imprime os números de 0 a 4. O bloco de código é executado uma vez, mesmo que a condição `i < 5` já seja falsa.

## Diferenças entre os Loops

- **For Loop**: Ideal quando você sabe o número de iterações antecipadamente.
- **While Loop**: Útil quando você não sabe o número exato de iterações e precisa de uma condição para interromper o loop.
- **Do-While Loop**: Garantia de que o bloco de código seja executado pelo menos uma vez, independentemente da condição.

## Conclusão

Os loops de repetição são fundamentais na programação, permitindo que tarefas repetitivas sejam realizadas de maneira eficiente. Saber escolher o tipo de loop adequado para sua necessidade pode melhorar a legibilidade e o desempenho do seu código.

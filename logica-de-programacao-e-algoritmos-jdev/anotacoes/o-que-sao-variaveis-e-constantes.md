# O que são Constantes e Variáveis

## **Variável**

Uma **variável** é um espaço na memória onde você pode armazenar valores que podem ser alterados durante a execução do programa.

### Exemplo de variável:

```java
public class ExemploVariavel {
    public static void main(String[] args) {
        int idade = 25; // Declarando uma variável chamada "idade" e atribuindo o valor 25
        System.out.println("Idade inicial: " + idade);

        idade = 30; // Alterando o valor da variável
        System.out.println("Idade alterada: " + idade);
    }
}

```

### Saída:

```
Idade inicial: 25
Idade alterada: 30

```

**Explicação**:

Aqui, a variável `idade` começa com o valor `25`. Mais tarde, o valor foi alterado para `30`. Isso demonstra a mutabilidade das variáveis.

---

## **Constante**

Uma **constante** é um valor que não pode ser alterado depois de ser atribuído. Para declarar uma constante em Java, usamos a palavra-chave `final`.

### Exemplo de constante:

```java
public class ExemploConstante {
    public static void main(String[] args) {
        final double PI = 3.14159; // Declarando uma constante chamada "PI"
        System.out.println("Valor de PI: " + PI);

        // PI = 3.15; // Isso causaria um erro de compilação, porque PI é final e não pode ser alterada.
    }
}

```

### Saída:

```
Valor de PI: 3.14159

```

**Explicação**:

A constante `PI` é declarada com `final`, o que significa que seu valor não pode ser alterado após a atribuição inicial. Se tentarmos mudar o valor, o compilador emitirá um erro.

---

### **Principais diferenças entre variável e constante**

| **Característica** | **Variável** | **Constante** |
| --- | --- | --- |
| **Alteração de valor** | Pode ser alterada | Não pode ser alterada |
| **Palavra-chave usada** | Não há especial | `final` |
| **Exemplo** | `int idade = 25;` | `final double PI = 3.14;` |

Essas duas estruturas são fundamentais em qualquer programa.
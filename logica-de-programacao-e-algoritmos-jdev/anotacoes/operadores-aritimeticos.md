# Operadores Aritiméticos

Os **operadores aritméticos** em Java são usados para realizar cálculos matemáticos, como soma, subtração, multiplicação, divisão e módulo. 

---

### **Tipos de Operadores Aritméticos em Java**

| Operador | Descrição | Exemplo de uso |
| --- | --- | --- |
| `+` | Adição | `a + b` |
| `-` | Subtração | `a - b` |
| `*` | Multiplicação | `a * b` |
| `/` | Divisão | `a / b` |
| `%` | Módulo (resto da divisão) | `a % b` |

---

### **Exemplos Práticos**

Vamos criar um programa em Java que demonstra o uso desses operadores:

```java
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Adição
        int soma = a + b;
        System.out.println("Soma: " + soma);

        // Subtração
        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);

        // Multiplicação
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao);

        // Divisão
        int divisao = a / b; // Divisão inteira
        System.out.println("Divisão (inteira): " + divisao);

        // Módulo
        int modulo = a % b;
        System.out.println("Módulo (resto da divisão): " + modulo);

        // Divisão com resultado decimal
        double c = 10.0;
        double d = 3.0;
        double divisaoDecimal = c / d;
        System.out.println("Divisão (decimal): " + divisaoDecimal);
    }
}

```

---

### **Saída do Programa**

```
Soma: 13
Subtração: 7
Multiplicação: 30
Divisão (inteira): 3
Módulo (resto da divisão): 1
Divisão (decimal): 3.3333333333333335

```

---

### **Detalhes Importantes**

1. **Divisão Inteira (`/`)**
    - Quando usamos dois números inteiros (`int`), o resultado será arredondado para baixo (parte inteira).
    - Exemplo: `10 / 3` resulta em `3`, descartando o resto.
2. **Divisão Decimal**
    - Para resultados com casas decimais, ao menos um dos operandos deve ser do tipo `double` ou `float`.
    - Exemplo: `10.0 / 3` resulta em `3.333333`.
3. **Módulo (`%`)**
    - Retorna o **resto** de uma divisão. Útil para verificar se um número é par (`n % 2 == 0`) ou ímpar.

---

### **Operadores Combinados**

Além dos operadores básicos, você pode usá-los em combinações com atribuição, como:

| Operador Combinado | Equivalente |
| --- | --- |
| `+=` | `a = a + b` |
| `-=` | `a = a - b` |
| `*=` | `a = a * b` |
| `/=` | `a = a / b` |
| `%=` | `a = a % b` |

### Exemplo:

```java
int x = 5;
x += 3; // Equivalente a x = x + 3
System.out.println(x); // Resultado: 8

```

Se tiver dúvidas ou quiser ver mais exemplos, é só perguntar! 😊
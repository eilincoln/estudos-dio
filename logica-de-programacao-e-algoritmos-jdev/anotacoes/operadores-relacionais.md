# Operadores Relacionais

Os **operadores relacionais** em Java são usados para comparar dois valores e retornar um resultado booleano (`true` ou `false`). Eles são muito usados em condições, como em estruturas `if`, `while`, e outras.

---

### **Principais Operadores Relacionais**

| Operador | Descrição | Exemplo (`a = 5`, `b = 10`) | Resultado |
| --- | --- | --- | --- |
| `==` | Igual a | `a == b` | `false` |
| `!=` | Diferente de | `a != b` | `true` |
| `>` | Maior que | `a > b` | `false` |
| `<` | Menor que | `a < b` | `true` |
| `>=` | Maior ou igual a | `a >= b` | `false` |
| `<=` | Menor ou igual a | `a <= b` | `true` |

---

### **Exemplo Prático**

Aqui está um programa em Java para demonstrar o uso dos operadores relacionais:

```java
public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Igual a
        System.out.println("a == b: " + (a == b));

        // Diferente de
        System.out.println("a != b: " + (a != b));

        // Maior que
        System.out.println("a > b: " + (a > b));

        // Menor que
        System.out.println("a < b: " + (a < b));

        // Maior ou igual a
        System.out.println("a >= b: " + (a >= b));

        // Menor ou igual a
        System.out.println("a <= b: " + (a <= b));
    }
}

```

---

### **Saída do Programa**

```
a == b: false
a != b: true
a > b: false
a < b: true
a >= b: false
a <= b: true

```

---

### **Detalhes Importantes**

1. **Retorno Booleano**
    
    Os operadores relacionais sempre retornam `true` ou `false`, dependendo da condição.
    
2. **Comparação entre Tipos Diferentes**
    - É possível comparar diferentes tipos de números (`int`, `double`, etc.), mas os dois valores serão convertidos para o mesmo tipo internamente antes da comparação.
    - Exemplo:
        
        ```java
        int x = 5;
        double y = 5.0;
        System.out.println(x == y); // true
        
        ```
        
3. **Comparação de Strings**
    - Para comparar o conteúdo de `Strings`, use o método `.equals()` em vez de `==`.
    - Exemplo:
        
        ```java
        String nome1 = "Java";
        String nome2 = "Java";
        System.out.println(nome1 == nome2); // Não recomendado, compara referências
        System.out.println(nome1.equals(nome2)); // Recomendado, compara conteúdo
        
        ```
        

---

### **Uso com Estruturas de Controle**

Os operadores relacionais são úteis em condições que determinam o fluxo do programa:

```java
public class TesteCondicional {
    public static void main(String[] args) {
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}

```

**Saída**:

```
Você é maior de idade.
```

---
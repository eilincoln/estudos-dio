# Estruturas de Decisão

As **estruturas de decisão** em Java permitem que o programa tome decisões baseadas em condições. Isso é essencial para controlar o fluxo de execução dependendo de valores ou resultados.

---

### **Principais Estruturas de Decisão em Java**

1. **`if` e `else`**
2. **`if` aninhado**
3. **`if-else if-else`**
4. **`switch`**

---

### **1. `if` e `else`**

O `if` executa um bloco de código **se a condição for verdadeira**. O `else` é usado para definir o que ocorre quando a condição é falsa.

### Exemplo:

```java
java
Copy code
public class EstruturaIfElse {
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

**Saída:**

```
Copy code
Você é maior de idade.

```

---

### **2. `if` Aninhado**

Você pode colocar um `if` dentro de outro para testar várias condições.

### Exemplo:

```java
java
Copy code
public class IfAninhado {
    public static void main(String[] args) {
        int idade = 20;
        boolean temCarteira = true;

        if (idade >= 18) {
            if (temCarteira) {
                System.out.println("Você pode dirigir.");
            } else {
                System.out.println("Você precisa tirar sua carteira de motorista.");
            }
        } else {
            System.out.println("Você ainda não tem idade para dirigir.");
        }
    }
}

```

**Saída:**

```
Copy code
Você pode dirigir.

```

---

### **3. `if-else if-else`**

Permite testar várias condições em sequência. O programa para assim que uma condição verdadeira for encontrada.

### Exemplo:

```java
java
Copy code
public class IfElseIf {
    public static void main(String[] args) {
        int nota = 85;

        if (nota >= 90) {
            System.out.println("Você tirou um A!");
        } else if (nota >= 80) {
            System.out.println("Você tirou um B!");
        } else if (nota >= 70) {
            System.out.println("Você tirou um C!");
        } else {
            System.out.println("Você precisa melhorar.");
        }
    }
}

```

**Saída:**

```css
css
Copy code
Você tirou um B!

```

---

### **4. `switch`**

O `switch` é usado para selecionar entre vários blocos de código, com base no valor de uma variável ou expressão.

### Exemplo:

```java
java
Copy code
public class EstruturaSwitch {
    public static void main(String[] args) {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Fim de semana!");
        }
    }
}

```

**Saída:**

```
Copy code
Quarta-feira

```

---

### **Detalhes Importantes**

1. **Uso do `break` no `switch`**
    - O `break` é usado para impedir que o código continue executando os próximos casos.
    - Sem o `break`, todos os blocos seguintes ao caso correspondente serão executados.
2. **`default` no `switch`**
    - O `default` é opcional e executa quando nenhum dos casos anteriores corresponde.
3. **Operadores Relacionais no `if`**
    - Use operadores como `==`, `>`, `<`, `>=`, `<=`, e `!=` para comparar valores nas condições.
4. **Encadeamento de `if` e `switch`**
    - Você pode combinar `if` e `switch` no mesmo programa para resolver problemas complexos.

---

### **Exemplo Completo**

Aqui está um programa que usa múltiplas estruturas de decisão:

```java
java
Copy code
public class EstruturasDecisao {
    public static void main(String[] args) {
        int idade = 25;
        String categoria;

        // Usando if-else
        if (idade < 18) {
            categoria = "Menor de idade";
        } else if (idade <= 60) {
            categoria = "Adulto";
        } else {
            categoria = "Idoso";
        }

        System.out.println("Categoria: " + categoria);

        // Usando switch
        switch (categoria) {
            case "Menor de idade":
                System.out.println("Você não pode dirigir.");
                break;
            case "Adulto":
                System.out.println("Você pode trabalhar e dirigir.");
                break;
            case "Idoso":
                System.out.println("Cuide da saúde e aproveite!");
                break;
            default:
                System.out.println("Categoria desconhecida.");
        }
    }
}

```
# Primeira Classe com Encapsulamento

## 📚 Sobre o Projeto

Projeto educacional desenvolvido como parte do **Bootcamp Accenture - DIO** (Digital Innovation One).

Este projeto demonstra os conceitos fundamentais de **Programação Orientada a Objetos (POO)**, com foco em **encapsulamento** e o padrão de design **getter/setter** em Java.

## 🎯 Objetivo

Aprender e praticar:
- **Encapsulamento**: proteção de dados através de atributos privados
- **Getters**: métodos para acessar valores privados
- **Setters**: métodos para modificar valores privados de forma controlada
- **Boas práticas**: organização e estruturação de classes Java

## 📁 Estrutura do Projeto

O workspace contém as seguintes pastas:

- **`src/`**: contém os arquivos fonte Java
  - `Main.java`: classe principal com exemplo de uso
  - `Pessoas.java`: classe modelo com encapsulamento
- **`lib/`**: pasta para manter dependências
- **`bin/`**: pasta onde os arquivos compilados são gerados automaticamente

## 💻 Classes Principais

### Pessoas.java
Classe modelo que demonstra encapsulamento com:
- **Atributos privados**: `nome`, `idade`, `endereco`
- **Getters**: `getNome()`, `getIdade()`, `getEndereco()`
- **Setters**: `setNome()`, `setIdade()`, `setEndereco()`

### Main.java
Classe de execução que:
- Instancia objetos da classe `Pessoas`
- Demonstra o uso de getters e setters
- Exibe as informações dos objetos criados

## 🚀 Como Executar

### Compilação
O VS Code compila automaticamente os arquivos ao salvar (com a extensão Java instalada).

### Execução
```bash
java -cp bin Main
```

### Saída Esperada
```
Masculino: Pedro idade 30
Feminino: Maria idade 23
Endereço do masculino: Rua A, 123
```

## 🔑 Conceitos-Chave

### Encapsulamento
```java
private String nome;        // Atributo privado - acesso controlado

public String getNome() {   // Getter - leitura controlada
    return nome;
}

public void setNome(String nome) {  // Setter - modificação controlada
    this.nome = nome;
}
```

## 📋 Estrutura de Pastas

```
├── README.md
├── .gitignore
├── src/
│   ├── Main.java
│   └── Pessoas.java
├── bin/
└── lib/
```

## 🛠️ Ferramentas Utilizadas

- **Linguagem**: Java 17+
- **IDE**: Visual Studio Code
- **Extensão**: Extension Pack for Java (Microsoft)

## 📝 Notas Importantes

- Não há dependências externas neste projeto
- O projeto segue as convenções de nomenclatura Java
- Atributos são sempre `private` para garantir encapsulamento
- Métodos de acesso (`getters`/`setters`) são sempre `public`

## 🎓 Referências

Este projeto faz parte do aprendizado em **Programação Orientada a Objetos** do Bootcamp Accenture - DIO.

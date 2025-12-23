# 📋 Cadastro de Pessoas em Java

Projeto simples desenvolvido em Java com foco nos fundamentos de **Programação Orientada a Objetos (POO)**.  
O objetivo é aplicar conceitos essenciais como classes, objetos, construtores, encapsulamento e métodos.

---

## 🧠 Conceitos aplicados

- Criação de classes e objetos
- Construtores
- Encapsulamento (`private`, getters)
- Métodos com e sem retorno
- Regras de negócio simples
- Organização de pacotes
- Execução via console (CLI)


## 🏗️ Estrutura do projeto
src/ <br>
└── br/ <br>
└── com/ <br>
└── cadastro/ <br>
├── model/ <br>
│ └── Pessoa.java <br>
└── app/ <br>
└── Main.java <br>

---

## 👤 Classe Pessoa

A classe `Pessoa` representa uma entidade do sistema e possui os seguintes atributos:

- `nome` (String)
- `idade` (int)
- `cpf` (String)
- `altura` (double)

### Principais métodos:

- `exibirDados()` → Exibe as informações da pessoa no console
- `isMaiorDeIdade()` → Retorna `true` se a pessoa for maior de idade

---

## ▶️ Como executar o projeto

1. Clone este repositório:
```bash
git clone https://github.com/JoaoSazao/CadastroPessoas
```

2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)

3. Execute a classe Main.java

🧪 Exemplo de saída no console

```yaml
Nome: João Victor
Idade: 22
CPF: 123.456.789-00
Altura: 1.75
Maior de idade: true
```

Desenvolvido por João Victor




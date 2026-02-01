# 🧮 Math API ☕
Uma API REST que oferece um conjunto completo de operações matemáticas.

## 💡 Sobre o projeto
Este projeto foi desenvolvido para demonstrar conceitos do **Spring Boot**. \
O **MathAPI** é uma API matemática robusta que conta com tratamento de exceções, conversão automática de parâmetros e uma documentação interativa.

## ⚙️ Funcionalidades
- **Aritmética Completa:** Soma, subtração, multiplicação e divisão.
- **Cálculos Avançados:** Raiz quadrada, raiz cúbica e potenciação.
- **Funções Especiais:** Cálculo de fatorial e conversão de números para binário.
- **Constantes Matemáticas:** Acesso rápido ao valor preciso de PI ($\pi$).
- **Segurança Operacional:** Tratamento de exceções para divisões por zero e raízes negativas.
- **Documentação Automática:** Interface visual via Swagger para testes imediatos.

## 🧩 Tecnologias Utilizadas
- Java 21
- Spring Boot
- Maven
- Swagger/OpenAPI

## 🛠️ Instalação
**1.** Verifique se o **Java** e o **Maven** estão instalados na sua máquina:
> Para confirmar, execute no terminal:
> ```bash
> java -version
> mvn -version
> ```
> Caso precise, baixe o [JDK](https://www.oracle.com/java/technologies/downloads) ou [Maven](https://maven.apache.org/download.cgi).

**2.** Baixe ou clone este repositório para o seu computador:
> ```bash
> git clone https://github.com/wxrley/MathAPI.git
> ```

## 🚀 Execução
#### Opção 1 — Via Terminal (Maven)
**1.** Entre na pasta raiz do projeto e execute o comando para iniciar a aplicação:
> ```bash
> mvn spring-boot:run
> ```

**2.** O console deve exibir o log do Spring indicando que o servidor subiu.

#### Opção 2 — Via IDE (IntelliJ, Eclipse, VS Code, etc.) 
**1.** Abra a pasta do projeto na sua IDE preferida. \
**2.** Abra o arquivo `MathAPIApplication.java` e clique em **Run**.

## 🧪 Como Testar
Para facilitar o teste das operações, o projeto utiliza o **Swagger (OpenAPI).** Isso permite que você visualize e execute todos os endpoints diretamente pelo navegador, de forma totalmente interativa.

**1.** Certifique-se de que a aplicação está rodando. \
**2.** Acesse o link oficial da documentação:
> http://localhost:8080/swagger-ui/index.html

**3.** Como realizar um cálculo:
- Escolha uma das operações (ex: `/sum`).
- Clique no botão **"Try it out"**.
- Preencha os campos (como `n1` e `n2`).
- Clique no botão azul **"Execute"**.
- O resultado aparecerá logo abaixo, na seção **"Response body"**.

> [!NOTE]
> O Swagger também permite testar operações inválidas (como divisão por zero ou raiz quadrada de números negativos), exibindo as exceções retornadas pela API.

## 👨‍💻 Autor
**Wxrley** — só mais um dev latino americano 💪

Test_WTL

Descrição
O projeto Test_WTL é uma aplicação Java baseada em Spring Boot que visa gerenciar departamentos e cargos de uma organização. Ele fornece recursos para criar, listar, atualizar e excluir departamentos e cargos. O projeto demonstra o uso de conceitos como Spring Boot, JPA (Java Persistence API), Hibernate, e segue uma arquitetura limpa e orientada a objetos.

Tecnologias e Bibliotecas
O projeto utiliza as seguintes tecnologias e bibliotecas:

Java 17: A linguagem de programação base do projeto.
Spring Boot: Um framework para criar aplicativos Java prontos para produção com facilidade.
Spring Data JPA: Parte do ecossistema Spring, facilitando o acesso a bancos de dados relacionais.
Hibernate: Uma implementação do JPA usada para mapear objetos Java para tabelas de banco de dados.
MySQL: O sistema de gerenciamento de banco de dados relacional utilizado no projeto.
Thymeleaf: Um mecanismo de modelo para criar views web.
Maven: Uma ferramenta de automação de compilação e gerenciamento de dependências.
Arquitetura
O projeto segue uma arquitetura limpa (Clean Architecture) que busca isolar as camadas e responsabilidades, garantindo que o código seja altamente testável e flexível. As camadas do projeto incluem:

Entidades (Entities): Classes de domínio que representam objetos reais, como Departamento e Cargo. As entidades estendem a classe abstrata AbstractEntity, que contém campos comuns como id.

Repositórios (Repositories): Classes que lidam com a persistência dos dados no banco de dados. Elas estendem a classe AbstractDao e fornecem operações CRUD (Create, Read, Update, Delete) para as entidades.

Serviços (Services): Classes que contêm a lógica de negócios da aplicação. Os serviços utilizam os repositórios para acessar os dados do banco de dados e realizar operações específicas.

Controladores (Controllers): Classes que lidam com as solicitações HTTP e interagem com os serviços para fornecer respostas às chamadas da API.

Apresentação (Presentation): Camada que lida com a apresentação das informações para os usuários. As páginas web são criadas usando Thymeleaf e os dados são fornecidos pelos controladores.

Uso
Para executar o projeto, siga os passos abaixo:

Configure um banco de dados MySQL com as configurações apropriadas.

Atualize as configurações de banco de dados no arquivo application.properties com a URL, nome de usuário e senha corretos.

Inicie a aplicação Java executando a classe principal TestWtlApplication.

Acesse a interface web em http://localhost:8080 para interagir com a aplicação.

No diretorio Target execute o seguinte comando para executar a aplicação via executor " java -jar Test_WTL-0.0.1-SNAPSHOT.jar "

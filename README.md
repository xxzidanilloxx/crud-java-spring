# API REST - Cadastro de pessoas

## :books: Sobre o Projeto

Este é um projeto simples que consiste no gerenciamento de informações de pessoas através de operações CRUD (Create, Read, Update, Delete).

## :hammer_and_wrench: Tenologias utilizadas

![java](https://github.com/xxzidanilloxx/xxzidanilloxx/assets/111617208/0af15eed-7d91-469c-87af-abb5e4ba7dc4)
![spring](https://github.com/xxzidanilloxx/xxzidanilloxx/assets/111617208/ffab4823-af20-4904-9854-b84d8c144977)
![hibernate](https://github.com/xxzidanilloxx/xxzidanilloxx/assets/111617208/db2acb5e-1cb6-40ad-8d64-05079ecdda18)
![maven](https://github.com/xxzidanilloxx/xxzidanilloxx/assets/111617208/91902391-c384-4718-a6ff-527fead23667)

## :file_cabinet: Banco de dados

Este projeto utiliza [H2 Database](https://www.h2database.com/html/tutorial.html) como banco de dados.

## :checkered_flag: Endpoints

Aqui estão os endpoints disponíveis:

### `POST localhost:8080/usuarios`
Cadastra uma nova pessoa com os dados fornecidos.

#### Exemplo do corpo da requisição (JSON):
```JSON
{
  "id": null,
  "nome": "James Gosling",
  "cpf": "10111011100",
  "email": "james@gmail.com"	
}
```

### `GET localhost:8080/usuarios`
Retorna todas as pessoas cadastradas.

### `GET localhost:8080/usuarios/{id}`
Retorna uma pessoa específica e os seus dados a partid do ID fornecido.

### `PUT localhost:8080/usuarios/{id}`
Atualiza os dados de uma pessoa cadastrada a partir do ID fornecido.

#### Exemplo do corpo da requisição (JSON):
```JSON
{
  "id": null,
  "nome": "James Arthur Gosling",
  "cpf": "10111011101",
  "email": "jamesgosling@gmail.com"	
}
```

### `DELETE localhost:8080/usuarios/{id}`
Exclui os dados de uma pessoa cadastrada a partir do ID fornecido.

## :gear: Como executar o projeto

Pré-requisitos: Java 17

```bash
# Clonar o repositório
git clone https://github.com/xxzidanilloxx/crud-java-spring

# Acessar a pasta do projeto
cd crud-java-spring

# Executar o projeto
mvn spring-boot:run
```

## :page_facing_up: Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.

## :man_technologist: Autor

Danillo Wesley da Costa Silva

https://www.linkedin.com/in/danillowesley

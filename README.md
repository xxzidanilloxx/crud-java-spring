# API REST - CRUD

## :books: Sobre o Projeto

Este é um projeto simples que consiste no gerenciamento de informações de usuários por intermédio de operações CRUD (Create, Read, Update, Delete).

## :hammer_and_wrench: Tenologias utilizadas

![java](https://github.com/xxzidanilloxx/crud-java-spring/assets/111617208/c4c4a890-397c-479f-a2ed-99e095a02118)
![spring](https://github.com/xxzidanilloxx/crud-java-spring/assets/111617208/3f70ba98-b9c9-48a3-a508-132bc5371287)
![maven](https://github.com/xxzidanilloxx/crud-java-spring/assets/111617208/feff8c3b-1d78-4a0b-bce8-ec3484e73eac)
![hibernate](https://github.com/xxzidanilloxx/crud-java-spring/assets/111617208/8aed8105-6b83-40af-a30b-df1e97982ea2)

## :file_cabinet: Banco de dados

Este projeto utiliza [H2 Database](https://www.h2database.com/html/tutorial.html) como banco de dados.

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

## :checkered_flag: Endpoints

Aqui estão os endpoints disponíveis:

### `POST localhost:8080/users`
Cadastra um novo usuário com os dados fornecidos.

#### Exemplo do corpo da requisição (JSON):
```JSON
{
    "id": null,
    "firstName": "Frodo",
    "lastName": "Baggins",
    "cpf": "01234567890",
    "birthDate":"22-09-1994",
    "email":"frodo@gmail.com",
    "phoneNumber": "(00) 00000-0000",
    "addressList": [
        {
        "id":null,
        "street":"Rua Gustavo Rico Toro",
        "number": 430,	
        "district":"Vista Verde",
        "city":"São José dos Campos",
        "state":"São Paulo"
        }
    ]
}
```

### `GET localhost:8080/users`
Retorna todos os usuários cadastrados.

### `GET localhost:8080/users/{id}`
Retorna um usuário específico e os seus dados a partid do ID fornecido.

### `PUT localhost:8080/users/{id}`
Atualiza os dados de um usuário cadastrado a partir do ID fornecido.

#### Exemplo do corpo da requisição (JSON):
```JSON
{
    "id": null,
    "firstName": "Frodo",
    "lastName": "Baggins",
    "cpf": "01234567890",
    "birthDate":"22-09-1994",
    "email":"frodo@outlook.com",
    "phoneNumber": "(00) 00000-0000",
    "addressList": [
        {
        "id": 1,
        "street": "Avenida Nove de Julho",
        "number": 120,	
        "district": "Vila Adyana",
        "city": "São José dos Campos",
        "state": "São Paulo"
        }
    ]
}
```

### `DELETE localhost:8080/usuarios/{id}`
Exclui os dados de um usuário cadastrado a partir do ID fornecido.

## :page_facing_up: Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.

## :man_technologist: Autor

Danillo Wesley da Costa Silva

https://www.linkedin.com/in/danillowesley

# Desenvolvimento Web


# Sistema de Registro de Pedidos para Loja de Bebidas Online GetDrink 
![alt text][logo]: https://cdn-icons-png.flaticon.com/512/38/38706.png

O objetivo deste sistema é registrar pedidos para uma loja de bebidas online. Para acessar o sistema, é necessário ter uma conta de usuário para login.

Existem dois tipos de usuários no sistema: Cliente e Funcionário.

O Funcionário tem acesso ao estoque de produtos e pode realizar inserção e remoção de produtos. O Cliente pode realizar pedidos através de um carrinho de compras e realizar o pagamento através do cartão de crédito. A numeração do cartão de crédito será validada utilizando REGEX.

Após o cadastro, os usuários poderão realizar alterações em seus dados cadastrais.

## Funcionalidades

* Registro e autenticação de usuários (Cliente e Funcionário)
* Gerenciamento de estoque de produtos (Funcionário)
* Carrinho de compras (Cliente)
* Pagamento via cartão de crédito (Cliente)
* Validação de número de cartão de crédito utilizando REGEX
* Edição de dados cadastrais (Cliente e Funcionário)

## Tecnologias utilizadas

* Java
* Spring Boot
* JPA/Hibernate
* MySQL
* Thymeleaf
* HTML/CSS

## Como utilizar o sistema
* Clone este repositório no seu computador
* Configure as credenciais do banco de dados no arquivo application.properties
* Execute a aplicação e acesse o sistema através do endereço http://localhost:8080 no navegador

## Considerações finais
Este projeto foi desenvolvido para fins de aprendizado e não deve ser utilizado em produção sem antes realizar testes adicionais e ajustes necessários. Se você encontrar algum problema ou bug no sistema, sinta-se à vontade para abrir uma issue neste repositório.




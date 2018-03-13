# WebServicesRestfulSpring
Projeto SocialBookApi com Java e Spring Boot

- 1º Cadastrar <Autor> -> POST http://localhost:8080/autores
- 2º Cadastrar <Livro> -> POST http://localhost:8080/livros
- 3º Cadastrar <Comentário> -> POST http://localhost:8080/livros/1/comentarios

Alguns métodos:
- GET http://localhost:8080/livros
- GET http://localhost:8080/autores
- PUT http://localhost:8080/livros/{id}
- DELETE http://localhost:8080/livros/{id}

Obs.: Spring Security está ativo. Faz-se necessário autenticação com usuário "svfbr:svfbr".
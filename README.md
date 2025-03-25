# Checkpoint 1 - API para Gestão de Pedidos

## Estrutura do Projeto

A organização modular do projeto segue a seguinte estrutura:
```
src/main/java/br/com/fiap/checkpoint1
├── controller  // Controladores responsáveis pelos endpoints REST
├── model       // Representação da entidade
├── repository  // Interface para persistência
├── service     // Implementação das regras de negócio
```

## Banco de Dados

O projeto utiliza H2 Database, um banco de dados em memória que facilita o desenvolvimento e os testes. Para configurar o banco, adicione o seguinte conteúdo ao arquivo application.properties:
```
spring.application.name=checkpoint1
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=*
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

## Endpoints da API

### Criar um novo pedido

POST /pedidos

![image](https://github.com/user-attachments/assets/21cfb744-95e1-4b0a-b23b-43947cea4282)


### Listar todos os pedidos

GET /pedidos

![image](https://github.com/user-attachments/assets/bd9bee39-a4b4-447b-ab52-71a60800643f)


### Buscar um pedido por ID

GET /pedidos/{id}

![image](https://github.com/user-attachments/assets/10a4a5f6-9300-4b0a-a7f1-524996e0cffa)

### Atualizar um pedido

PUT /pedidos/{id}

![image](https://github.com/user-attachments/assets/6244235c-0b12-47bd-8e5a-ba1191232342)

![image](https://github.com/user-attachments/assets/a96204a2-408e-48db-8bda-0c863b9dec4d)

### Remover um pedido

DELETE /pedidos/{id}

![image](https://github.com/user-attachments/assets/3607b842-c748-44cb-929d-9696d1f69821)

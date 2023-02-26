# iDENTEdade API
Projeto de uma API para cadastro e controle de cadastro de clinicas dentarias

## Endpoints
- __Usuario__
  - [Cadastrar](#cadastrar-usuario)
  - Atualizar
  - Apagar 
  - [Listar todos](#listar-todos-usuarios)
  - [Pegar pelo id](#listar-usuario-pelo-id)
  - Detalhes
  
- __Consulta__ 
  - [Cadastrar](#cadastrar-consulta)
  - Atualizar
  - Apagar 
  - [Listar todos](#listar-todas-consultas)
  - [Pegar pelo id](#listar-consulta-pelo-id)
  - Pegar pelo id do cliente
  - Pegar pelo id da clinica
  - Detalhes
  
- __Clinica(s)__
  - Cadastrar
  - Atualizar
  - Apagar
  - Listar todas
  - Pegar pelo id
  - Detalhes
  
- __Endereço__
  - Cadastrar
  - Atualizar
  - Apagar 
  - Listar todos
  - Pegar pelo id
  - Detalhes
  
## Cadastrar usuario
`POST`      /identedade/api/usuario

__Campos de requisição__
| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|cd_usuario|inteiro|SIM|Chave primária dessa entidade
|nm_usuario|texto|SIM|Nome do usário
|dt_nascimento|data|SIM|Data de nascimento do usuário, serve para sabermos a idade do usuario
|ds_email|texto|SIM|Email do usuario para contato e login
|ds_senha|texto|SIM|Senha do usuario para logar
|nr_telefone|inteiro|SIM|Número de telefone para contato

__Exemplo de requisição__
```js
{
    cd_usuario: 1,
    nm_usuario: 'Jefferson',
    dt_nascimento: '1999-12-27',
    ds_email: 'email@email.com',
    ds_senha: '@mor5758',
    nr_telefone: 11954089999
}
```

__Resposta__

| código | descrição 
|--------|----------
|201| o usuario foi cadastrada com sucesso
|400| campos inválidos

## Listar usuario pelo id

`GET` identedade/api/usuario/{id}

__Exemplo de resposta__

```js
{
    cd_usuario: 1,
    nm_usuario: 'Jefferson',
    dt_nascimento: '1999-12-27',
    ds_email: 'email@email.com',
    ds_senha: '@mor5758',
    nr_telefone: 11954089999
}
```

__Resposta__

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi  encontrado usuario com esse ID


## Listar todos usuarios

`GET` identedade/api/usuario

__Exemplo de resposta__

```js
{
  {
      cd_usuario: 1,
      nm_usuario: 'Jefferson',
      dt_nascimento: '1999-12-27',
      ds_email: 'email@email.com',
      ds_senha: '@mor5758',
      nr_telefone: 11954089999
  }
  {
      cd_usuario: 2,
      nm_usuario: 'Andressa',
      dt_nascimento: '2001-12-27',
      ds_email: 'email@email.com',
      ds_senha: '@mor5758',
      nr_telefone: 11954229999
  }
}
```

__Resposta__

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| endereço não encontrado


## Cadastrar consulta
`POST`      /identedade/api/consulta

__Campos de requisição__
| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|cd_consulta|inteiro|SIM|Primary key de consulta
|cd_usuario|inteiro|SIM|foreign key de consulta, vem de usuario e representa a PK do usuario na API
|cd_clinica|inteiro|SIM|foreign key de clinica, vem da tabela clinica e representa a PK da clinica do sistema
|dt_consulta|data|SIM|Data de quando a consulta será realizada
|nm_medico|texto|SIM|Nome do médico que irá atender
|ds_consulta|texto|SIM|Sobre o que se trata uma consulta
|vl_preco|float|SIM|Valor total da consulta em R$

__Exemplo de requisição__
```js
{
  cd_consulta: 1,
  cd_usuario: 1,
  cd_clinica: 1,
  dt_consulta: '2023-12-27',
  nm_medico: 'José da silva',
  ds_consulta: 'arrumar o aparelho',
  vl_preco: 385.00
}
```

__Resposta__

| código | descrição 
|--------|----------
|201| a consulta foi cadastrada com sucesso
|400| campos inválidos
  
## Listar consulta pelo id

`GET` identedade/api/consulta/{id}

__Exemplo de resposta__

```js
{
  cd_consulta: 1,
  cd_usuario: 1,
  cd_clinica: 1,
  dt_consulta: '2023-12-27',
  nm_medico: 'José da silva',
  ds_consulta: 'arrumar o aparelho',
  vl_preco: 385.00
}
```

__Resposta__

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrado consulta com esse ID

## Listar todas consultas

`GET` identedade/api/usuario

__Exemplo de resposta__

```js
{
  {
    cd_consulta: 1,
    cd_usuario: 1,
    cd_clinica: 1,
    dt_consulta: '2023-12-27',
    nm_medico: 'José da silva',
    ds_consulta: 'arrumar o aparelho',
    vl_preco: 385.00
  }
  {
    cd_consulta: 2,
    cd_usuario: 2,
    cd_clinica: 1,
    dt_consulta: '2023-12-24',
    nm_medico: 'José da silva',
    ds_consulta: 'arrumar o aparelho',
    vl_preco: 385.00
  }
}
```

__Resposta__

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| endereço não encontrado

#language:pt
@cadastro
Funcionalidade: Preencher formulário
  	Como administrador do sistema
  Eu quero realizar um cadastro basico de um novo usuário

  Contexto: Acessar o formulario de cadastro
    Dado que o administrador do sistema esta logado

  @cadastroFormulario
  Cenário: Realiza cadastro de formulário
    Quando informar o nome
    Quando informar um login
    Quando informar uma senha
    Quando informar um email
    E informar o endereço
    E informar uma referência para o endereço
    E Selecionar uma formação acadêmica
    E Selecionar uma curso de interesse
    E Salvar o formulário
    Então o sistema informa para o usuário, que o cadastro foi realizado com sucesso

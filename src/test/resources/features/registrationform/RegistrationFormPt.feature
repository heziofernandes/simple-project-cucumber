# language: pt
@cadastro
Funcionalidade: Preencher formulário
  	Como um usuário
  Eu quero realizar o cadastro de uma pessoal no sistema

  Contexto: Acessar ao formulario de cadastro
    Dado que o usuário esta logado

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
    Então o sistema informa para o usuário, cadastro com sucesso

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/cadastrodeformulario/FormularioCadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Preencher formulário",
  "description": "\tComo um usuário\r\n\tEu quero realizar o cadastro de uma pessoal no sistema",
  "id": "preencher-formulário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Cadastro"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "Acessar ao formulario de cadastro",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que o usuário esta logado",
  "keyword": "Dado "
});
formatter.match({
  "location": "RegisterFieldsSteps.que_o_usuário_esta_logado()"
});
formatter.result({
  "duration": 4176420599,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Realiza cadastro de formulário",
  "description": "",
  "id": "preencher-formulário;realiza-cadastro-de-formulário",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 10,
      "name": "@CadastroFormulario"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "informar o nome",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "informar um login",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "informar uma senha",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "informar um email",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "informar o endereço",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "informar uma referência para o endereço",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "Selecionar uma formação acadêmica",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "Selecionar uma curso de interesse",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "Salvar o formulário",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "o sistema informa para o usuário, cadastro com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "RegisterFieldsSteps.informar_o_nome()"
});
formatter.result({
  "duration": 442408745,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.informar_um_login()"
});
formatter.result({
  "duration": 399745508,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.informar_uma_senha()"
});
formatter.result({
  "duration": 410959501,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.informar_um_email()"
});
formatter.result({
  "duration": 414624605,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.informar_o_endereço()"
});
formatter.result({
  "duration": 469880002,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.informar_uma_referência_para_o_endereço()"
});
formatter.result({
  "duration": 640043513,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.Selecionar_uma_formação_acadêmica()"
});
formatter.result({
  "duration": 167344079,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.Selecionar_uma_curso_de_interesse()"
});
formatter.result({
  "duration": 290568294,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.Salvar_o_formulário()"
});
formatter.result({
  "duration": 509254531,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.o_sistema_informa_para_o_usuário_cadastro_com_sucesso()"
});
formatter.result({
  "duration": 84162,
  "status": "passed"
});
});
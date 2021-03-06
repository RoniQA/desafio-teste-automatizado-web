$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PesquisaProduto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#encoding: utf-8"
    },
    {
      "line": 2,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Pesquisa de Produtos",
  "description": "",
  "id": "pesquisa-de-produtos",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 6,
  "name": "Pesquisa Valida",
  "description": "",
  "id": "pesquisa-de-produtos;pesquisa-valida",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 7,
  "name": "que estou na pagina de pesquisa",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "pesquisar por um produto \"playstation 5\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "retorna uma quantidade de produtos",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaSteps.que_estou_na_pagina_de_pesquisa()"
});
formatter.result({
  "duration": 3951870300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "playstation 5",
      "offset": 26
    }
  ],
  "location": "PesquisaSteps.pesquisar_por_um_produto(String)"
});
formatter.result({
  "duration": 1825423000,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.retorna_uma_quantidade_de_produtos()"
});
formatter.result({
  "duration": 36196800,
  "status": "passed"
});
formatter.after({
  "duration": 217944200,
  "status": "passed"
});
formatter.after({
  "duration": 171639300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Pesquisa Invalida",
  "description": "",
  "id": "pesquisa-de-produtos;pesquisa-invalida",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 14,
  "name": "que estou na pagina de pesquisa",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "pesquisar por um produto \"qpshydvfpoyqwev fyuv\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "retorna uma mensagem de erro",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaSteps.que_estou_na_pagina_de_pesquisa()"
});
formatter.result({
  "duration": 2267470600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qpshydvfpoyqwev fyuv",
      "offset": 26
    }
  ],
  "location": "PesquisaSteps.pesquisar_por_um_produto(String)"
});
formatter.result({
  "duration": 1399182900,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.retorna_uma_mensagem_de_erro()"
});
formatter.result({
  "duration": 34162400,
  "status": "passed"
});
formatter.after({
  "duration": 139574100,
  "status": "passed"
});
formatter.after({
  "duration": 116147000,
  "status": "passed"
});
});
#encoding: utf-8
#language: pt
Funcionalidade: Pesquisa de Produtos

  @pesquisa_fluxo_base
  Cenario: Pesquisa Valida
    Dado que estou na pagina de pesquisa
    Quando pesquisar por um produto produto <VALIDO>
    Entao retorna uma quantidade de produtos
    E aparece uma lista de produtos

  @pesquisa_excecao_01
  Cenario: Pesquisa Invalida
    Dado que estou na pagina de pesquisa
    Quando pesquisar por um produto <INVALIDO>
    Entao retorna uma mensagem de erro

  @pesquisa_excecao_02
  Cenario: Pesquisa em branco
    Dado que estou na pagina de pesquisa
    Quando pesquisar sem preencher campo pesquisa
    Entao continua no mesmo lugar
    E nao realiza a pesquisa
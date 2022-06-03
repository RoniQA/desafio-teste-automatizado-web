#encoding: utf-8
#language: pt
Funcionalidade: Pesquisa de Produtos


  Cenario: Pesquisa Valida
    Dado que estou na pagina de pesquisa
    Quando pesquisar por um produto "playstation 5"
    Entao retorna uma quantidade de produtos



  Cenario: Pesquisa Invalida
    Dado que estou na pagina de pesquisa
    Quando pesquisar por um produto "qpshydvfpoyqwev fyuv"
    Entao retorna uma mensagem de erro

  @ignore
  Cenario: Pesquisa em branco
    Dado que estou na pagina de pesquisa
    Quando pesquisar sem preencher campo pesquisa
    Entao continua no mesmo lugar
    E nao realiza a pesquisa
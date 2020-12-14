# language: pt

@tag
Funcionalidade: Cadastro no Banco Original

  @Test1
  Cenario: Criar conta no Banco Original
    Dado Que eu esteja no site do Banco Original
    Quando Eu tentar cadastrar uma conta Fake
    Entao O Sistema retornara a mensagem de erro
    
    @Teste2
     Cenario: Testar campos obrigatorios
    Dado Que eu esteja no site do Banco Original
    Quando Eu tentar cadastrar uma conta sem preencher meu nome
    Entao O Sistema retornara a mensagem para preencher o campo obrigatorio
    

  
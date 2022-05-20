# Exercicios 02





**Informações Tecnicas**I 

- Projeto foi realizado no Eclipse 

- Foi realizado com o JDK - 17 

**Descriçaõ do projeto**

      1 -  Para utilizar o projeto é necessário instanciar o objeto dentro do metodo **main** que esta na classe **Aplicacao**.

      2 - Instanciar os objetos **VideoGame** e **Livro** que são as extensões de **Produto**, a **Loja** que recebera as listas  

**instanciando os objetos, adicionar o objeto dentro das listas criadas (livros.add(objeto),livros.add(objeto)).**

    3 - Instanciar a **Loja** que recebera as listas ja criadas

    4 - Automaticamente irá calcular os impostos com as regras de negócio do enunciado.   

**Manipulçaõ no projeto**

- Para Instanciaros objetos :
  
  - VideoGame "Nome do produto" = **new** **VideoGame(nome , valor , quantidade , marca , modelo , se é usado ou não (boolean));****
  -  Livro "Nome do produto" = **new** Livro(nome, valor , quantidade , autor , tema , quantidade de pagina);
  - Criar uma Collection **List** para adicionar os objeto instanciados
  - Loja "Nome da Loja"= **new**Loja(nome ,  cnpj , List<Livros> , List<games>);

- Para calcular o imposto do o objeto
  
  - objeto.**calcularImposto()**

- Para verificar a lista de objetos, função que esta na **Loja**
  
  - loja.listaLivros();
  - loja.listaGames();

- Para verificar o patrimonio total da Loja
  
  - Função retorna uma **(String)** informando o total de patrimonio, deve ser colocada dentro de um System.out.println.
  - Ex: System.out.print(**loja.calcularPatrimonio()**)    

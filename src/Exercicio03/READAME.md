# Exercicios 03

Informações Tecnicas 

- Projeto foi realizado no Eclipse 

- Foi realizado com o JDK - 17 

Descrição do projeto

- Foi criado as funcionalidades conforme o enunciado, criando a classe mãe **Personagem** que extende as classes **Mago e Guerreiro** onde possuem as funcionalidades **Attack, lvlUp e conforme o diagrama a função aprenderMagia e aprenderHabilidade** 

Manipulçaõ no projeto

- É nescessário instanciar o objeto, adicionando no construtor apenas o nome **Mago** "nome do objeto" = **new** Mago(**(adicionar um nome (String))**)

- Apos instanciado podendo utilizar suas funcionalidades como:
  
  - **Attack** --> Conforme as regras de negocio do enunciado "nome do objeto".**attack()**
  
  - **lvlUp** --> ao ser utilizado aumenta todos os atributos do personagem "nome do objeto".**lvlUp()**
  
  - **aprendendoHabilidade ou Magia**  --> utilizado para adicionar algum recurso ao personagem "nome do objeto".**aprendendoHabilidade(iserir habilidade adicionada(String))**
  
  - **mostrarAsMagias ou Habilidades** --> para mostrar no console as habilidades adicionadas "nome do objeto".**mostrarHabilidades()** ou **mostrarAsMagias()**.

- E a funcionalidade que nos mostra a quantidade de personagem que foi adicionado **Personagem.getQuantidadePersonagem()** dentro do **System.out.println()** pois o metodo retorna uma String
  
  

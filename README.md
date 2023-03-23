# GoF-AbstractFactory
Studying the theory and implementation of Design Patterns

## Sobre o Pattern

O Abstract Factory é um padrão de design que fornece uma interface para criar
famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
Em outras palavras, ele permite criar objetos de diferentes tipos que compartilham a mesma estrutura ou interface.

O padrão Abstract Factory é útil quando se deseja criar um conjunto de objetos que possuem
uma relação lógica e dependências entre si. Ele permite que o código cliente trabalhe
com as interfaces abstratas dos objetos, em vez de se preocupar com as classes concretas específicas.

## Sobre o projeto

No projeto, os pacotes dentro da pasta src, com exceção do pacote run,
representam as características de um Abstract Factory, sendo separados em 4

###
A interface ComputerComponentFactory define os métodos que serão
implementados pelas fábricas concretas para criar componentes de computador.
Cada fábrica concreta, como a DellComputerComponentFactory ou a AsusComputerComponentFactory,
implementa esses métodos para criar componentes específicos daquela marca.

Os produtos concretos, como DellMonitor ou AsusMotherboard, implementam as interfaces definidas
pela fábrica abstrata. Dessa forma, cada produto concreto é criado pela sua respectiva fábrica
concreta e é garantido que todos os produtos dessa fábrica estejam em conformidade com a interface
definida pela fábrica abstrata.

## Tecnologias utilizadas
- Java

# Autor

Ruan Kennedy Freire Mendes

www.linkedin.com/in/ruan-kennedy-b1b084242

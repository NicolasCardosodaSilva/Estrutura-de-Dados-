```mermaid
classDiagram
    direction LR
    
    
    class App{
        -HashMap~Cliente~
        -HashMap~Imovel~
        -HashMap~Contrato~
        +cadastrarImovel()
        +cadastrarCliente()
        +cadastrarContrato()
        +verDetalhes():String
        +verHistorico():String
        +menu(opcao:int)
    }
    
    class Imovel{
        -descricao:String
        -endereco:String
        -precoAluguel:double
        +Imovel()
    }
    
    class Cliente{
        -nome:String
        -cpf:int
        -telefone:int
        +Cliente()
    }
    
    class Contrato{
        -cliente:Cliente
        -imovel:Imovel
        -codigo:int
        -dataInicio:LocalDate
        -dataTermino:LocalDate
        -valorAcordado:double
        +Contrato()
    }


    Imovel "1" --o "0.." Contrato
    Cliente "1" --o "0.." Contrato
    App "1" --* "0.." Contrato
    App "1" --* "0.." Imovel
    App "1" --* "0.." Cliente
```
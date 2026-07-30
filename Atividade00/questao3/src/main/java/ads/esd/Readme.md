# Livro
## Atributos:
- titulo:String
- autor:String
- isbn:int final 
- ano:int

## Inicialização:
- Livro(titulo: String, autor:String, isbn: int, ano:int)

## Modificação:
- setTitulo(titulo: String) :: void
- setAutor(autor: String) :: void
- setAno(ano: int) :: void 

## Consulta
- getTitulo() :: String
- getAutor() :: String
- getAno() :: int


# Círculo
## Atributos:
- raio: double
- perimetro: double
- area: double
## Inicialização:
- Circulo(raio: double)

## Modificação:
- setRaio(raio: double) :: void

## Consulta:
- getRaio() :: double
- calcularArea() :: double
- calcularPerimetro() :: double

# Filme

## Atributos:
- titulo: String
- diretor: String
- minutos: int
- genero: String
- anoLancamento: int

## Inicialização:
- Filme(titulo: String, diretor: String, minutos: int,
genero: String, anoLancamento: int) 

## Modificação:
- setTitulo(titulo: String) :: void
- setDiretor(diretor: String) :: void
- setGenero(genero: String) :: void

## Consulta:
- getTitulo() :: String
- getDiretor() :: String
- getMinutos() :: int
- getGenero() :: String
- getAnoLancamento() :: int

# Pessoa

## Atributos:
- nome: String
- cpf: String
- dataNascimento: LocalDate
- telefone: String

## Inicialização:
- Pessoa(nome: String, cpf: String, dataNascimento: LocalDate, telefone: String) 

## Modificação:
- setNome(nome: String) :: void
- setTelefone(telefone: String) :: void

## Consulta:
- getNome() :: String
- getCpf() :: String
- getDataNascimento() :: LocalDate
- getTelefone() :: String

# Aluno

## Atributos:
- nome: String
- matricula: String
- curso : String

## Inicialização:
- Aluno(nome: String, matricula: String, curso: String)

## Modificação:
- setNome(nome: String) :: void
- setCurso(curso: String) :: void
- setMatricula(matricula: String) :: void

## Consulta:
- getNome() :: String
- getMatricula() :: String
- getCurso() :: String

# ItemEstoque

## Atributos:
- codigo: String
- nome: String
- quantidade: int
- precoUnitario: double

## Inicialização:
- ItemEstoque(codigo: String, nome: String, quantidade: int, precoUnitario: double) 

## Modificação:
- setNome(nome: String) :: void
- setPrecoUnitario(precoUnitario: double) :: void


## Consulta:
- getCodigo() :: String
- getNome() :: String
- getQuantidade() :: int
- getPrecoUnitario() :: double

# ContaBancaria

## Atributos:
- numeroConta: String
- titular: String
- saldo: double

## Inicialização:
- ContaBancaria(numeroConta: String, titular: String, saldoInicial: double) 

## Modificação:
- depositar(valor: double) :: void
- sacar(valor: double) :: void

## Consulta:
- getNumeroConta() :: String
- getTitular() :: String
- getSaldo() :: double
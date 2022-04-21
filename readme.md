<img src="https://www.calendariodovestibular.com.br/wp-content/uploads/2020/08/vestibular-fiap-2022.jpg" />
<br />

# Rent a Car
Atividade 3 - WebServices em RESTful - NinjaBit
O Projeto foi desenvolvido para solucionar a necessidade de uma api de alugueis de veículos
Os prints do projeto estão na pasta **_evidencias_imagens_**

**Requer instalado**
* apache maven
* java 17 ou superior
* Postman

**Instruções**
  * clonar o repositorio https://github.com/deaxavier/rentacar.git
  * importar a collection RentACar.postman_collection.json no postman
  * abrir a pasta do projeto em um terminal
  * rodar o comando mvn spring-boot:run

## Descrição dos endpoints

### Concessionária
------------------
* CadastrarConcessionaria
    _Cadastra uma concessionária no sistema_
  * endereço: http://localhost:8080/concessionarias
    * verbo: **POST**
<img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Concessionaria/CadastrarConcessionaria.png" />

<br />

* AtualizarConcessionaria
  _Atualiza uma concessionária cadastrada no sistema_
  * endereço: http://localhost:8080/concessionarias/{id}
    * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Concessionaria/AtualizarConcessionaria.png" />

<br />

* BuscarTodasConcessionarias
  _Lista todas as concessionarias cadastradas no sistema_
  * endereço: http://localhost:8080/concessionarias
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Concessionaria/BuscarTodasConcessionarias.png" />

<br />

* BuscarConcessionariaPorId
    _Busca uma concessionaria pelo id_
    * endereço: http://localhost:8080/concessionarias/{id}
      * verbo: **GET**
<img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Concessionaria/BuscarConcessionariaPorId.png" />

<br />

------------------
### Clientes
---------
* CadastrarCliente
   _Cadastra um cliente no sistema_
  * endereço: http://localhost:8080/clientes
    * verbo: **POST**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/CadastrarCliente.png" />

<br />

* AtualizarCliente
  _Atualiza um cliente cadastrado no sistema_
  * endereço: http://localhost:8080/clientes/{id}
    * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/AtualizarCliente.png" />

<br />

* BuscarClientePorId
    _Busca um cliente pelo id_
    * endereço: http://localhost:8080/clientes/{id}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/BuscarClientePorId.png" />

<br />

* BuscarClientePorCPF
    _Busca um cliente pelo cpf_
    * endereço: http://localhost:8080/clientes/bycpf/{cpf}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/BuscarClientePorCpf.png" />

<br />

* BuscarClientePorEmail
    _Busca um cliente pelo email_
    * endereço: http://localhost:8080/clientes/byemail/{email}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/BuscarClientePorEmail.png" />

<br />

* BuscarTodosClientes
    _Retorna lista de todos os clientes_
    * endereço: http://localhost:8080/clientes
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/BuscarTodosClientes.png" />

<br />

---------
### Marcas
----------
* CadastrarMarca
   _Cadastra uma marca no sistema_
  * endereço: http://localhost:8080/marcas
    * verbo: **POST**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Marca/CadastrarMarca.png" />

<br />

* AtualizarMarca
  _Atualiza uma marca cadastrada no sistema_
  * endereço: http://localhost:8080/marcas/{id}
  * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Marca/AtualizarMarca.png" />

<br />

* BuscarTodasMarcas
    _Retorna lista de todas as marcas_
    * endereço: http://localhost:8080/marcas
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Marca/BuscarTodasMarcas.png" />

<br />

* BuscarMarcaPorId
    _Busca uma marca pelo id_
    * endereço: http://localhost:8080/marcas/{id}
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Marca/BuscarMarcaPorId.png" />

<br />

-----------
### Modelo
------------
* CadastrarModelo
   _Cadastra um modelo no sistema_
  * endereço: http://localhost:8080/modelos
    * verbo: **POST**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Modelos/CadastrarModelo.png" />

<br />

* AtualizarModelo
  _Atualiza um modelo cadastrado no sistema_
  * endereço: http://localhost:8080/modelos/{id}
    * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Modelos/AtualizarModelo.png" />

<br />

* BuscarTodosModelos
    _Retorna todos os modelos_
    * endereço: http://localhost:8080/modelos
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Modelos/BuscarTodosModelos.png" />

<br />

* BuscarModeloPorId
    _Busca um modelo pelo id_
    * endereço: http://localhost:8080/modelos/{id}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Modelos/BuscarTodosModeloPorId.png" />

<br />

* BuscarModeloPorMarca
    _Busca um modelo pelo id da marca_
    * endereço: http://localhost:8080/modelos/bymarca/{marcaId}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Modelos/BuscarTodosModeloPorMarcaId.png" />

<br />

---------------
### Pedido
------------
* FazerPedido
   _Realiza um pedido de locação de carro_
   _Calcula o valor estimado da alocação_
   _Também remove o veículo da lista de veúclos disponiveis para aluguel_
  * endereço:http://localhost:8080/pedidos/cadastrar
    * verbo: **POST**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Pedido/FazerPedido.png" />

<br />

* BuscarTodosPedidos
   _Busca todos os pedidos feitos_
  * endereço:http://localhost:8080/pedidos
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Pedido/BuscarTodosPedidos.png" />

<br />

* BuscarTodosPedidoPorCliente
   _Busca todos os pedidos feitos por um cliente_
  * endereço:http://localhost:8080/pedidos/porcliente/{clienteId}
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Pedido/BuscarTodosPedidoPorCliente.png" />

<br />

* BuscarTodosPedidoPorVeiculo
   _Busca todos os pedidos feitos para um veículo_
  * endereço:http://localhost:8080/pedidos/porveiculo/{veiculoId}
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Pedido/BuscarTodosPedidoPorVeiculo.png" />

<br />

----
### Veículo
---

* CadastrarVeiculo
    _Cadastrar um veículo no sistema_
    _O veículo cadastrado entra como ativo(liberado para alocação)_
  * endereço:http://localhost:8080/veiculos
      * verbo: **POST**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/CadastrarVeiculo.png" />

<br />

* AtualizarVeiculo
  _Atualiza os dados de um veículo_
  * endereço:http://localhost:8080/veiculos
      * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/AtualizarVeiculo.png" />

<br />

* DevolverVeiculo
  _Devolver um veículo à uma concessionaria, calcula o valor final da alocação_
  _Após o processo o veículo é liberado para ser alocado por outro cliente_
  _O veículo nãoo precisa ser devolvido na concessionaria em que ele foi alugado_
    * endereço:http://localhost:8080/veiculos/devolver/{idVeiculo}/{idConcessionaria}
      * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/DevolverVeiculo.png" />

<br />

* BuscarVeiculosAtivos
_Retorna lista de veículos disponiveis para alocação_
    * endereço:http://localhost:8080/veiculos/ativos
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/BuscarVeiculosAtivos.png" />

<br />

* BuscarTodosVeiculos
   _Retorna lista de todos os veículos da base, incluindo os que estão alocados no momento_
    * endereço:http://localhost:8080/veiculos
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/BuscarTodosVeiculos.png" />

<br />

* BuscarVeiculoPorId
_Busca um veículo pelo Id_
    * endereço:http://localhost:8080/veiculos/{id}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/BuscarVeiculoPorId.png" />

<br />

* BuscarVeiculoPorConcessionaria
  _Busca todos os veículos da concessionaria_
      * endereço:http://localhost:8080/veiculos/byconcessionaria/{idConcessionaria}
        * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/BuscarVeiculoPorConcessionaria.png" />

<br />

---
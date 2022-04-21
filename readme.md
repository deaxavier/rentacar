<img src="https://www.calendariodovestibular.com.br/wp-content/uploads/2020/08/vestibular-fiap-2022.jpg" />
<br />

# Rent a Car
Atividade 3 - WebServices em RESTful - NinjaBit <br/>
O Projeto foi desenvolvido para solucionar a necessidade de uma api de alugueis de veículos<br/>
Os prints do projeto estão na pasta **_evidencias_imagens_**<br/>

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
* CadastrarConcessionaria<br/>
  
    _Cadastra uma concessionária no sistema_<br/>

  * endereço: http://localhost:8080/concessionarias
    * verbo: **POST**
<img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Concessionaria/CadastrarConcessionaria.png" />

<br />

* AtualizarConcessionaria<br/>
  
  _Atualiza uma concessionária cadastrada no sistema_<br/>

  * endereço: http://localhost:8080/concessionarias/{id}
    * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Concessionaria/AtualizarConcessionaria.png" />

<br />

* BuscarTodasConcessionarias<br/>
  
  _Lista todas as concessionarias cadastradas no sistema_<br/>

  * endereço: http://localhost:8080/concessionarias
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Concessionaria/BuscarTodasConcessionarias.png" />

<br />

* BuscarConcessionariaPorId<br/>
  
    _Busca uma concessionaria pelo id_<br/>

    * endereço: http://localhost:8080/concessionarias/{id}
      * verbo: **GET**
<img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Concessionaria/BuscarConcessionariaPorId.png" />

<br />

------------------
### Clientes
---------
* CadastrarCliente<br/>
  
   _Cadastra um cliente no sistema_<br/>

  * endereço: http://localhost:8080/clientes
    * verbo: **POST**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/CadastrarCliente.png" />

<br />

* AtualizarCliente<br/>
  
  _Atualiza um cliente cadastrado no sistema_<br/>

  * endereço: http://localhost:8080/clientes/{id}
    * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/AtualizarCliente.png" />

<br />

* BuscarClientePorId<br/>
  
    _Busca um cliente pelo id_<br/>

    * endereço: http://localhost:8080/clientes/{id}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/BuscarClientePorId.png" />

<br />

* BuscarClientePorCPF<br/>
  
    _Busca um cliente pelo cpf_<br/>

    * endereço: http://localhost:8080/clientes/bycpf/{cpf}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/BuscarClientePorCpf.png" />

<br />

* BuscarClientePorEmail<br/>
  
    _Busca um cliente pelo email_<br/>

    * endereço: http://localhost:8080/clientes/byemail/{email}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/BuscarClientePorEmail.png" />

<br />

* BuscarTodosClientes<br/>
  
    _Retorna lista de todos os clientes_<br/>

    * endereço: http://localhost:8080/clientes
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Clientes/BuscarTodosClientes.png" />

<br />

---------
### Marcas
----------
* CadastrarMarca<br/>
  
   _Cadastra uma marca no sistema_<br/>

  * endereço: http://localhost:8080/marcas
    * verbo: **POST**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Marca/CadastrarMarca.png" />

<br />

* AtualizarMarca<br/>
  
  _Atualiza uma marca cadastrada no sistema_<br/>

  * endereço: http://localhost:8080/marcas/{id}
  * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Marca/AtualizarMarca.png" />

<br />

* BuscarTodasMarcas<br/>
  
    _Retorna lista de todas as marcas_<br/>

    * endereço: http://localhost:8080/marcas
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Marca/BuscarTodasMarcas.png" />

<br />

* BuscarMarcaPorId<br/>
  
    _Busca uma marca pelo id_<br/>

    * endereço: http://localhost:8080/marcas/{id}
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Marca/BuscarMarcaPorId.png" />

<br />

-----------
### Modelo
------------
* CadastrarModelo<br/>
  
   _Cadastra um modelo no sistema_<br/>

  * endereço: http://localhost:8080/modelos
    * verbo: **POST**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Modelos/CadastrarModelo.png" />

<br />

* AtualizarModelo<br/>
  
  _Atualiza um modelo cadastrado no sistema_<br/>

  * endereço: http://localhost:8080/modelos/{id}
    * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Modelos/AtualizarModelo.png" />

<br />

* BuscarTodosModelos<br/>
  
    _Retorna todos os modelos_<br/>

    * endereço: http://localhost:8080/modelos
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Modelos/BuscarTodosModelos.png" />

<br />

* BuscarModeloPorId<br/>
  
    _Busca um modelo pelo id_<br/>

    * endereço: http://localhost:8080/modelos/{id}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Modelos/BuscarTodosModeloPorId.png" />

<br />

* BuscarModeloPorMarca<br/>
  
    _Busca um modelo pelo id da marca_<br/>

    * endereço: http://localhost:8080/modelos/bymarca/{marcaId}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Modelos/BuscarTodosModeloPorMarcaId.png" />

<br />

---------------
### Pedido
------------
* FazerPedido<br/>
  
   _Realiza um pedido de locação de carro_<br/>

   _Calcula o valor estimado da alocação_<br/>

   _Também remove o veículo da lista de veúclos disponiveis para aluguel_<br/>
  * endereço:http://localhost:8080/pedidos/cadastrar
    * verbo: **POST**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Pedido/FazerPedido.png" />

<br />

* BuscarTodosPedidos<br/>
  
   _Busca todos os pedidos feitos_<br/>

  * endereço:http://localhost:8080/pedidos
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Pedido/BuscarTodosPedidos.png" />

<br />

* BuscarTodosPedidoPorCliente<br/>
  
   _Busca todos os pedidos feitos por um cliente_<br/>

  * endereço:http://localhost:8080/pedidos/porcliente/{clienteId}
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Pedido/BuscarTodosPedidoPorCliente.png" />

<br />

* BuscarTodosPedidoPorVeiculo<br/>
  
   _Busca todos os pedidos feitos para um veículo_<br/>

  * endereço:http://localhost:8080/pedidos/porveiculo/{veiculoId}
    * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Pedido/BuscarTodosPedidoPorVeiculo.png" />

<br />

----
### Veículo
---

* CadastrarVeiculo<br/>
  
    _Cadastrar um veículo no sistema_<br/>

    _O veículo cadastrado entra como ativo(liberado para alocação)_<br/>

  * endereço:http://localhost:8080/veiculos
      * verbo: **POST**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/CadastrarVeiculo.png" />

<br />

* AtualizarVeiculo<br/>
  
  _Atualiza os dados de um veículo_<br/>

  * endereço:http://localhost:8080/veiculos
      * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/AtualizarVeiculo.png" />

<br />

* DevolverVeiculo<br/>
  
  _Devolver um veículo à uma concessionaria, calcula o valor final da alocação_<br/>

  _Após o processo o veículo é liberado para ser alocado por outro cliente_<br/>

  _O veículo nãoo precisa ser devolvido na concessionaria em que ele foi alugado_<br/>

    * endereço:http://localhost:8080/veiculos/devolver/{idVeiculo}/{idConcessionaria}
      * verbo: **PUT**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/DevolverVeiculo.png" />

<br />

* BuscarVeiculosAtivos<br/>
  
_Retorna lista de veículos disponiveis para alocação_<br/>

    * endereço:http://localhost:8080/veiculos/ativos
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/BuscarVeiculosAtivos.png" />

<br />

* BuscarTodosVeiculos<br/>
  
   _Retorna lista de todos os veículos da base, incluindo os que estão alocados no momento_<br/>

    * endereço:http://localhost:8080/veiculos
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/BuscarTodosVeiculos.png" />

<br />

* BuscarVeiculoPorId<br/>
  
_Busca um veículo pelo Id_<br/>

    * endereço:http://localhost:8080/veiculos/{id}
      * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/BuscarVeiculoPorId.png" />

<br />

* BuscarVeiculoPorConcessionaria<br/>
  
  _Busca todos os veículos da concessionaria_<br/>

      * endereço:http://localhost:8080/veiculos/byconcessionaria/{idConcessionaria}
        * verbo: **GET**
  <img src="https://raw.githubusercontent.com/deaxavier/rentacar/main/evidencias_imagens/Veiculos/BuscarVeiculoPorConcessionaria.png" />

<br />

---
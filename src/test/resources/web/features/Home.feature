Feature: Test pagina Home
  Background:
    Given El cliente se encuentra en la pagina Automation Practice
    And El cliente hace click en el boton My Account de la barra de navegacion
    And El cliente accede a su cuenta

  @WebCompleto  @Home
  Scenario Outline: El cliente realiza una compra exitosa
    When El cliente hace click en el boton Shop
    And  El cliente hace click en el boton Home
    And El cliente prueba que la pagina contenga 3 libros
    And El cliente verifica que solo existen 3 libros
    And  El cliente hace click en el libro Mastering Javascript
    And El cliente verifica ser redireccionado a la pagina del producto seleccionado
    And  El cliente agrega el libro al carrito
    And El cliente verifica el producto agregado al carro
    And El cliente se dirije al carrito y visualiza el precio del producto
    And El cliente verifica que el precio total es menor al subtotal
    And El cliente hace click en el boton para continuar el pago
    And  El cliente accede al formulario para completar sus datos junto con los datos de facturacion y detalles de facturacion
    And El cliente completa el formulario con sus datos '<Nombre>' '<Apellido>' '<Nombre Empresa>' '<email>' '<Telefono>' '<Pais>' '<Direccion>' '<Dpto>' '<Localidad>' '<Ciudad>' '<Codigo Postal>'
    Then El cliente puede agregar un cupon de descuento
    And El cliente hace click en el boton para Pagar
    Then El cliente completa su pedido
    Examples:
      | Nombre| Apellido  | Nombre Empresa|               email            |    Telefono    |       Pais  |            Direccion |  Dpto  | Localidad|     Ciudad | Codigo Postal|
      |  Adrian | Spinosi   |      Emptysoft       |  adriansp1@test.com| 341234567 | Argentina|  Ov.Lagos 2501|  Suite | Rosario    |  Santa Fe  |        S2000    |




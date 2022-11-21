Feature: Test pagina MyAccount
  Background:
    Given El cliente se encuentra en la pagina Automation Practice
    And El cliente hace click en el boton My Account de la barra de navegacion
    And El cliente accede a su cuenta

    @TicketDescuento
    Scenario:  El cliente agrega cupon de descuento a su compra
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





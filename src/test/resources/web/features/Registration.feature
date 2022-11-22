Feature: Pruebas sobre el registro
  Background:
    Given El cliente se encuentra en la pagina Automation Practice
    And El cliente hace click en el boton My Account de la barra de navegacion

    @WebCompleto @PassEmpty
    Scenario Outline:El cliente prueba resgistrarse con password vacia
     When El cliente ingresa un username <username>
     And El cliente ingresa un password <password>
     And El cliente  hace click en el boton Register
     Then Se muestra mensaje de error por password vacia

     Examples:
     |username                 |password|
     |adriansp1@test.com|                 |

        @WebCompleto @Empty
        Scenario Outline: El cliente prueba registrarse con campos vacios
        When El cliente ingresa un username<username>
        And El cliente ingresa un password <password>
        And El cliente  hace click en el boton Register
        Then  Se muestra mensaje de error en la pagino por email vacio
        Examples:
          |username                 |password|
          |                                 |                 |

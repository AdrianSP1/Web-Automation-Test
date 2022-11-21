Feature: Pruebas de login de la web en la seccion(MY ACCOUNT- LOGIN)

  Background:
     Given El cliente se encuentra en la pagina Automation Practice
      And El cliente hace click en el boton My Account de la barra de navegacion

    @Login
   Scenario Outline: El cliente ingresa a su cuenta
    When El cliente ingresa su username<username>
    And El cliente ingresa su password<password>
    And El Cliente hace click en el boton de Login
    Then El cliente accede a su cuenta
      Examples: 
      |           username                 |    password      |
      |adriansp1@test.com           |524625643045|

    @LoginError
    Scenario Outline: El cliente intenta acceder a su cuenta con datos de logueo incorrectos
      When El cliente ingresa su username<username>
      And El cliente ingresa su password<password>
      And El Cliente hace click en el boton de Login
      Then Se muestra mensaje de error
      Examples:
      | username                        | password        |
      |         524625643045      |  adriansp1@test.com  |


      @LogoutBack
     Scenario Outline:El cliente accede a su cuenta ,se deslogea y vuelve al home
        When El cliente ingresa su username<username>
        And El cliente ingresa su password<password>
        And El Cliente hace click en el boton de Login
        And El cliente cierra sesion de su cuenta
        And  El cliente presiona volver atras
        Then  El cliente no deberia estar logueado
        Examples:
          |           username                 |    password      |
          |adriansp1@test.com           |524625643045|


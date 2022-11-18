Feature: Pruebas de login de la web en la seccion(MY ACCOUNT- LOGIN)

  Background:
     Given El cliente se encuentra en la pagina Automation Practice
      And El cliente hace click en el boton My Account de la barra de navegacion

    @Login
   Scenario: El cliente ingresa a su cuenta(HappyPath)
    When El cliente ingresa su username
    And El cliente ingresa su password
    And El Cliente hace click en el boton de Login
    Then El cliente accede a su cuenta

    @LoginError
    Scenario Outline: El cliente intenta acceder a su cuenta con datos de logueo incorrectos
      When El cliente ingresa su username<username>
      And El cliente ingresa su password<password>
      And El Cliente hace click en el boton de Login
      Then Se muestra mensaje de error
      Examples:
      | username                        | password        |
      |                                         |                         |
      | adrianspdag1@test.com |  fdhdf344g     |
      |      adriansp1@test.com  |                        |
Feature: Prueba del menu de opciones de la pagina MY-ACCOUNT-
  Background:
    Given El cliente se encuentra en la pagina Automation Practice
    And El cliente hace click en el boton My Account de la barra de navegacion
    And El cliente accede a su cuenta

    @WebCompleto @PasswordChange @Account
    Scenario:El cliente verifica la opcion de cambiar su password
      When El cliente hace click en el boton My Account de la barra de navegacion
      And  El cliente selecciona el boton Acount Details
      Then El cliente visualiza en la pagina la opcion de cambiar su password


    @WebCompleto @Logout @Account
    Scenario:El cliente cierra sesion en su cuenta de manera exitosa
      When El cliente hace click en el boton My Account de la barra de navegacion
      And El cliente cierra sesion de su cuenta
      Then El cliente no deberia estar logueado
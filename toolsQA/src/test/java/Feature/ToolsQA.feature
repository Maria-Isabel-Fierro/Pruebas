Feature:


  Background:
    Given El usuario ingresa a la pagina de demoqa "https://demoqa.com/automation-practice-form"

  @escenariotoolsqa
  Scenario Outline: Completar formulario
    Given El usuario llena name "<name>"
    And El usuario llena lastname "<lastname>"
    And El usuario llena email "<email>"
    And El usuario selecciona gender "<gender>"
    And El usuario llena address "<address>"
    And El usuario llena  addressper "<addressper>"
    Then Se valida que el usuario haya completado todos los campos


    Examples:
      | name  |   lastname |  email           | gender   |   address     |    addressper    |
      | maria  | isabel    |maria@gmail.com   | Female     |mercedes 345   | las violetas 765 |
      |daniela |  ignacia  |daneila@gmail.com | Other      | daniella 456  |     matta 764    |


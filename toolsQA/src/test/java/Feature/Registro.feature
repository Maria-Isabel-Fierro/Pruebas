Feature:


  Background:
    Given El usuario ingresa a la pagina de guru99 "https://demo.guru99.com/insurance/v1/register.php"

  @registrotest
  Scenario Outline: Completar formulario de Registro
    Given El usuario completa dropdown "<title>"
    Then El usuario ingresa first name "<name>"
    And El usuario ingresa surname "<surname>"
    And El usuario ingresa phone "<phone>"
    And El usuario ingresa cumpleanos "<ano>" "<mes>" "<dia>"
    And El usuario ingresa cheked "<chek>"
    And El usuario ingresa periodo licencia "<licencia>"
    And El usuario ingresa ocupacion "<ocupacion>"
    And El usuario ingresa direccion "<address>" "<city>" "<country>"
    And El usuario ingresa CodePost "<codepost>" "<email>"
    And El usuario ingresa Pass "<pass>" "<confirm>"
    When El usuario presiona boton create


    Examples:
      | title | name  | surname | phone     | ano | mes       | dia | chek      | licencia | ocupacion | address    | city     | country | codepost |email           | pass      | confirm   |
      | Lady  | marria| fierro  | 937645789 |1949 | September | 3   | full      | 4        | Doctor    |las violetas|quilicura |santiago |s58d62   |maria@gmail.com |maria1234  |maria1234  |
      |Captain|trini  |munoz    |967854321  |1953 | April     | 24  |Provisional| 6        | Dentist   |av matta    |recoleta  |santiago |f85y95   |trini@gmail.com |trinidad135|trinidad135|
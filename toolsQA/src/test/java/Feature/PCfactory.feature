Feature: Prueba escenario outline

  Background:
    Given El usuario ingresa a la pagina de PCFactory "https://www.pcfactory.cl/"

  @escenarioBusqueda
  Scenario Outline: Varias busquedas
    Given El usuario realiza la busqueda del producto "<Producto>"
    And El usuario selecciona el producto "<Modelo>"
    Then Se valida que el usuario haya seleccionado el producto "<Busqueda>"

    Examples:
      |  Producto |  Modelo                | Busqueda |
      | notebok   | Notebook Inspiron 3530 | 50169   |
        #| Audifono   |
        #| Parlante   |


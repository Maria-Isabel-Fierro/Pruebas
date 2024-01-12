Feature: google form


  Background:
    Given El usuario ingresa a la pagina de google Form "https://docs.google.com/forms/d/1CffVtmTjayzp_1sUmQ-Xobjixn7eEwwjSwBmf3WuIdE/edit"

  @escenariogoogle
  Scenario Outline: Completar formulario
    Given El usuario llena nombre google form "<name>"
    Then   El usuario seleciona talla google form "<talla>"
    And   El usuario llena el campo comentario "<comentario>"
    When  El usuario presiona el boton enviar
    Examples:
    |name|talla|comentario|
    |sam |s    | hola soy un comantario|
    |maria|l   | hola soy otro comentario |
@Comprar
  Feature: Compra de productos en la pagina demoblaze

    @TEST_COMPRA01
    Scenario: Compra de 2 productos
      Given que el Usuario se encuentre en la pagina de demoblaze
      When agrego dos productos al carrito
      Then visualizo que los productos esten en el carrito
      And verifico que sean "Samsung galaxy s6", precio "360", y precio total de la compra es "720"
      Then completo el formulario con la informacion:
      And ingreso nombre:"standard_user", pais: "Ecuador", ciudad: "Quito", tarjeta: "1234", mes: "JUNIO", anio: "2030"
      And finalizo la compra

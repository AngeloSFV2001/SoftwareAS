# ChallengeFinalE2E
1. Prerequisitos:
    - Maquina local con el sistema operativo Windows 11
    - IntelliJ IDEA 2024.1.4
    - SDK 17 Oracle OpenJDK 17.0.6
    - Maven 3.9.8
    - Configurar las variables de entorno del sistema y de usuario
        - Agregar nuevas variables de sistemas con su valor
            - JAVA_HOME : ruta de instalación (ejm. C:\Users\USUARIO\.jdks\azul-1.8.0_412)
            - M2_HOME : ruta de instalación (ejm. C:\Programas\apache-maven-3.9.8)
        - Edita el PATH de las variables de sistema y añade las siguientes variables
            - %JAVA_HOME%\bin
            - %M2_HOME%\bin
2. Comandos de instalación
   -utilizamos el siguiente comando para agregar serenity mediante maven "mvn serenity:aggregate "
   nota: En caso de que no se actualice, realizar de forma manual con el boton refrescar en la barra lateral de maven
3. Instrucciones para ejecutar los test
    - para ejecutar los test nos trasladamos al ejecutor CucumberTestSuite que se encuentra en el directorio 
    - src/test/java/com.example/runners, o tambien se puede ejecutar directamente con el depurador 
        - en este caso se tuvo en escenario de agregar 2 productos donde se verifica los siguientes pasos
        - Sabiendo que el Usuario se encuentra en la pagina
        - Cuando agrego dos productos al carrito
        - Entonces se visualiza que los productos esten en el carrito
        - Y se verifico que sean "producto", precio "precio", y precio total de la compra es "precio"
        - Entonces completo el formulario con la informacion:
        - E ingreso datos necesario
        - y finalizo la compra
4. Información adicional
    - Se puede ver los reportes en la carpeta target -> site en varias presentaciones.
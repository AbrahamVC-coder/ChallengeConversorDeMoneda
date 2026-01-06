# ChallengeConversorDeMoneda
Proyecto desarrollado en **Java** que permite realizar la conversión entre distintas monedas mediante un programa de consola.  
Forma parte de un challenge de práctica enfocado en el manejo de lógica, estructuras de control y entrada/salida de datos en Java.

##  Descripción

El **Conversor de Moneda** es una aplicación de consola que permite al usuario seleccionar una moneda de origen, una moneda de destino e ingresar un monto para obtener su conversión correspondiente.

El programa está diseñado para reforzar:
- Lógica de programación
- Uso de condicionales y ciclos
- Manejo de entrada de datos por consola
- Organización básica de un proyecto en Java
- Uso de librerias en este caso Gson, para la muestra de datos
- Manejo y entendimiento de una WebAPI
- Uso de HttpClient, Request y Response
- Entendimiento de la estructura de un backend

---

## Funcionalidades

- ✔ Conversión entre diferentes monedas aportadas por la API de ExchangeRate
- ✔ Menú interactivo en consola
- ✔ Validación básica de opciones ingresadas
- ✔ Registro de conversiones (opcional, según implementación) desntro de un Json
- ✔ Ejecución sencilla desde terminal o IDE

##  Tecnologías utilizadas

- **Java**
- **IntelliJ IDEA** (IDE)
- **Git & GitHub** para control de versiones

## Como ejecutar el proyecto
1. Clona el repitorio.
2. Abre el proyecto en IntelliJ IDEA
3. Ehecuta la clase principal (main)

## Ejemplo de uso del programa.
1. El progrmasolicitará que el usuario ingrese a consola la moneda que desea convertir.
   Ejemplo: USD, MXN, EUR, etc.
2. Como siguiente paso el programa solicitara el usuario la cantidad que desea convertir.
   Ejemplo: 1,2,3,4,5,6,7,8,9...
3. Una vez se obtiene la información anterior el programa preguntará al usuario en que moneda desea convertir la moneda anterior y la cantidad.
   Ejemplo: USD, MXN, EUR, etc.
4. El programa mostrará al usuario la moneda y la cantidad que buscaba convertir y la cantidad ya convertida a la moneda seleccionada.
   Ejemplo: El valor de: 10.0[USD] Corresponde al valor final de: ==> 179.485 [MXN]
5. El programa preguntará al usuario si desea hacer otra conversión, con las opciones de "S" / "N", en caso de ser "S" se repetira el proceso anterior,
   En caso de ser "N" terminará el programa.

 ## Manejo de errores
 El programa tiene un manejo simple de errores, que significa que en cuanto se cometa algun error por parte del usuario al colocar los datos,
 el programa mandara "Null" y terminará sin mostrar resultados.

 ## Autor
 Abraham Velazquez Carmona

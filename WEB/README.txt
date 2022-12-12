## Automatizacion de pruba tecnica 
1. [Informacion general](#informacion-general)
2. [Caracteristicas](#caracteristicas)
3. [Flujos](#flujos)
4. [Ayudas](#ayudas)
### Informacion general
***
En la automatacion se realiza la validacion del proceso de inscripcion a la pagina https://automation-wappi.vercel.app/login y los flujos de compra y llenado de la inforamcion personal de un perfil

## Caracteristicas
***
Las caracteristicas principales de la automatizacion en la realizacion de 4 flujos con el proceso de validar las posibles rutas que se podrian tomar en las pruebas
## Flujos
***
```
Loggin
la funcion de este flujo es solo de hacer y validar el registro de un usuario en la pagina

Feature: as a quality analyst
  I want to test the account registration flow
  to confirm its correct operation

  @login
  Scenario: log in to the page
    Given : actor opens browser
    When : I send the username and password
    Then : see the offers page "Ofertas"


```
Loggin
la funcion de este flujo es solo de hacer y validar el registro de un usuario en la pagina

Feature: as a quality analyst
  I want to test the account registration flow
  to confirm its correct operation

  @login
  Scenario: log in to the page
    Given : actor opens browser
    When : I send the username and password
    Then : see the offers page "Ofertas"


```
Purchase
la funcion de este flujo es de realizar un pedido tanto (con y sin) cupon de vienvenida en un sola tarea

Feature: as a quality analyst
  I want to test the buy offers flow
  to confirm its correct operation

  @PurchaseBasic
  Scenario: log in to the page
    Given : actor opens browser
    When : I send the username and password
    Then : check the offers page and make a purchase "without a" coupon

  @Purchase
  Scenario: log in to the page
    Given : actor opens browser
    When : I send the username and password
    Then : check the offers page and make a purchase "with" coupon


```
Purchase 2
la funcion de este flujo es de realizar un pedido tanto (con y sin) cupon de vienvenida en dos tareas por separado

Feature: as a quality analyst
  I want to test the buy offers flow
  to confirm its correct operation

  @PurchaseBasic
  Scenario: log in to the page
    Given : actor opens browser
    When : I send the username and password
    Then : check the offers page and make a purchase without a coupon

  @Purchase
  Scenario: log in to the page
    Given : actor opens browser
    When : I send the username and password
    Then : check the offers page and make a purchase with coupon

```
PersonalInformation
la funcion de este flujo es de finalizar el registro de la información del usuario recien registrado

Feature: as a quality analyst
  I want to test the information registration flow
  to confirm its correct operation

  @personal
  Scenario: log in to the page
    Given : actor opens browser
    When : I send the username and password
    Then : see the image with the message Tu información se guardó correctamente

```
## Ayudas

Se utilizo la ayuda de dos modeles para el uso de datos FAKE para los escenarios de loggin y personalInformation,
los cuales se devuelven utilizando un esquema que se recibe en la respectiva tarea y se devuelve al ser llamado el respectivo metodo.

Se utilizo la  libreria File para poder crear de forma temporal un documento para ser utilizado en el escenario de personalInformation ,
para no tener que depender de una ruta quemada para seleccionar un archivo

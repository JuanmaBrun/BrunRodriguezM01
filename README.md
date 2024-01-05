#BrunRodriguezM01

##EJERCICIO 01

Deberás recrear en android la aplicación del contador que se os proporciona. El diseño se os pasará por figma (abajo teneis el enlace). En este primer ejercicio solo debes hacer la parte visual, nada de lógica. Asegurate de que el resultado final sea identico al proporcionado, en tu criterio queda elegir el o los tipos de layouts que utilizarás. Mediante figma obtén el tipo de fuente, colores etc que debes utilizar en tu aplicación.                                                                                                         

##Comentario                           

Se ha creado un nuevo layout llamado activity_contador, junto a su clase controlador correspondiente ContadorActivity.
En la nueva activity se han creado los siguientes elementos:
_ Un TextView txtContador con el texto Contador.
_ Un TextView txtDisplay con el texto 0. Este TextView se usará como display de la cantidad del contador en futuras versiones.
_ Un LinearLayout horizontal con 3 botones:
    -btnAdd que se usará para añadir una unidad al contador.
    -btnReset que se usará para regresar la cantidad del contador a 0.
    -btnSub que se usará para restar una unidad a la cantidad del contador.
_ Un TextView txtName que muestra los apellidos del creador de la aplicación.

![Screenshot](img/pantalla1.png)

Se han modificado los atributos de estos elementos para intentar que sean lo más responsive posible y para adaptarlos a las peticiones del figma.

A petición del ejercicio solo se han creado los elementos visuales de la pantalla, la lógica de las operaciones se añadirá en versiones futuras.

##EJERCICIO 02

Crea la segunda pantalla en el mismo proyecto(investiga como). Deberás realizar un lógin tal y como se muestra en el figma, en el caso de que el usuario y contraseña sean admin en el TextView de abajo saldrá “Usuario y contraseña correcta” en caso contrario “Usuario o contraseña incorrecta”. Investigar por vuestra cuenta como iniciar la aplicación en la Activity login. Pista → se configura en el AndroidManifest.xml. Una vez que iniciemos el login deberá pasar a la pantalla del contador pasando el dato del nombre del usuario (aparecerá en la parte baja de la pantalla de contador donde ponía “by nombre_alumno”).(ACTUALIZADO)

##Comentario

Se ha creado un nuevo layout llamado activity_login, junto a una nueva clase LoginActivity.
 En la nueva activity se han añadido los siguientes elementos:
_ Un TextView txtLogin con el texto Login.
_ Un EditText editTextUser para el input del nombre de usuario.
_ Un EditText editTextPass para el imput de la contraseña.
_ Un boton btnLOGIN para iniciar el metodo de inicio de sesión.
_ Un TextView txtStatus que muestra al usuario si el inicio de sesión fue correcto o no.

Se han modificado los atributos de estos elementos intentando que sean lo más responsive posible y para adaptarlos a las peticiones del figma.

![Screenshot](img/pantalla2.png)

Además se ha creado un método de inicio de sesión en el controlador ActivityLogin. Este método comprueba si la cadena introducida en los campos de usuario y contraseña es admin. De ser así, el texto del TextView txtStatus cambiará a su mensje correspondiente "Usuario y contraseña correctos" y se procederá a cambiar a la activity_contador. Además se recogerá la cadena introducida en el campo de nombre de usuario para mostrarlo por pantalla en la activity_Contador en el TextView txtUsername.
Si el nombre de usuario o contraseña son incorrectos (a petición del ejercicio, si no son "admin"), el texto de txtStatus pasará a mostrar el mensaje "Usuario o contraseña incorrectos" y no se producirá el cambio de pantalla.

![Screenshot](img/codigoLogin.png)

##Otros cambios

_ El TextView txtName de la activity_contador se ha cambiado a txtUsername y ahora mostrará el nombre del usuario cuando se haya iniciado sesión.
_ Se ha cambiado el código a ContadorActivity para que recoja la String del nombre de usuario del campo txtEditUser de la activity_Login para que  al iniciar sesión se muestre a traves del texto de txtUsername.

![Screenshot](img/codigoContador.png)


### Caso_Final_Finales
Mario Llansó--> https://github.com/mllangon/Caso_Final_Finales.git


##Ejercicio 1:

1)     En relación al estado de un objeto, para preservar el principio de encapsulación:
b)    Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.

2)     Los métodos de una clase no pueden devolver objetos:
b)    Falso (Los métodos de una clase pueden devolver objetos. Esta es una práctica común en programación orientada a objetos, donde un método puede crear y retornar nuevas instancias de una clase o devolver instancias existentes.)

3)     ¿Cuál de las siguientes características de la programación orientada a objetos está relacionada con la reutilización de código?
b)    Herencia

4)     El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:
b)    O(1)

5)     Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir seleccionando el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada:
b) Falso (El método de inserción no selecciona elementos para insertar en la posición última de una lista ordenada. En cambio, toma elementos de la parte no ordenada de la lista y los inserta en la posición correcta dentro de la parte ya ordenada, asegurando que esta parte permanezca ordenada a medida que el algoritmo avanza.)




##Ejercicio 4:

#Tipo de recursividad:

la recursividad empleada en este ejercicio es lineal, la funcion se llama a sí misma y no esta dentro de ningún bucle.


#Complejidad computacional:

La complejidad computacional del algoritmo de este ejercicio es O(n), donde n es el número de dígitos en el número. Esto es porque cada llamada procesa un dígito del número (dividiendo el número por 10), y por lo tanto, el número de llamadas recursivas es proporcional al número de dígitos en el número original.


##Ejercicio 5:

UserAccountGUI: Esta es la interfaz gráfica de usuario (GUI) de la aplicación. Proporciona formularios para crear una cuenta, iniciar sesión, publicar tweets, seguir a otros usuarios, enviar mensajes directos y retweetear. Los usuarios pueden cambiar entre estos formularios utilizando un CardLayout.  

UserAccount: Esta clase representa una cuenta de usuario. Cada cuenta de usuario tiene un alias, un correo electrónico, una contraseña, una lista de tweets, una línea de tiempo, y conjuntos de seguidores y usuarios a los que sigue.  

Email: Esta clase representa un correo electrónico. Cada correo electrónico tiene una dirección de correo electrónico.  

Tweet: Esta clase representa un mensaje. Cada tweet tiene contenido, una marca de tiempo y un remitente.  

Retweet: Esta es una subclase de Tweet que representa un retweet. Cada retweet tiene un tweet original además de las propiedades heredadas de Tweet.  

DirectMessage: Esta es otra subclase de Tweet que representa un mensaje directo. Cada mensaje directo tiene un receptor además de las propiedades heredadas de Tweet.  

La aplicación permite a los usuarios crear una cuenta, iniciar sesión, publicar tweets, seguir a otros usuarios, enviar mensajes directos y retweetear. Los tweets, retweets y mensajes directos se almacenan en la cuenta del usuario y se muestran en su línea de tiempo. Los usuarios también pueden ver los tweets de los usuarios a los que siguen en su línea de tiempo.

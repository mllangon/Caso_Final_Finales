### Caso_Final_Finales
Mario Llansó--> https://github.com/mllangon/Caso_Final_Finales.git


##Ejercicio 1:

1)  *En relación al estado de un objeto, para preservar el principio de encapsulación:*
b)    Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.

2)   *Los métodos de una clase no pueden devolver objetos:*
b)    Falso (Los métodos de una clase pueden devolver objetos. Esta es una práctica común en programación orientada a objetos, donde un método puede crear y retornar nuevas instancias de una clase o devolver instancias existentes.)

3)   *¿Cuál de las siguientes características de la programación orientada a objetos está relacionada con la reutilización de código?
b)    Herencia*

4)   *El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:*
b)    O(1)

5)   *Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir seleccionando el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada:*
b) Falso (El método de inserción no selecciona elementos para insertar en la posición última de una lista ordenada. En cambio, toma elementos de la parte no ordenada de la lista y los inserta en la posición correcta dentro de la parte ya ordenada, asegurando que esta parte permanezca ordenada a medida que el algoritmo avanza.)


##Ejercicio 2:

A)
Análisis: Esta opción tiene una complejidad computacional lineal, lo que significa que el tiempo de ejecución aumentará linealmente con el tamaño de los datos de entrada. Sin embargo, es muy eficiente en términos de uso de memoria, utilizando un espacio constante S(1).

Justificación: Dado que la memoria es un recurso crítico y limitado en el dispositivo, y considerando que S(1) significa que el uso de memoria no aumentará independientemente del tamaño de la entrada, esta alternativa es bastante recomendable para un entorno con restricciones de memoria severas. A pesar de que el tiempo de ejecución aumenta con el tamaño de los datos, el bajo uso de memoria es crucial para la viabilidad del dispositivo en un entorno real.

B)
Análisis: Esta alternativa ofrece el mejor tiempo de ejecución posible, constante, lo que indica que el tiempo de procesamiento no depende del tamaño de los datos de entrada. Sin embargo, el uso de memoria es excesivamente alto, creciendo cuadráticamente con respecto al tamaño de los datos.

Justificación: Aunque el tiempo de ejecución es óptimo, el uso excesivo de memoria S(N^2) hace esta opción inviable para dispositivos con una memoria tan limitada como 4 KB, especialmente considerando un tamaño de datos de entrada de 64 KB, lo cual rápidamente excedería la capacidad de memoria disponible.

C)
Análisis: Ofrece una excelente eficiencia tanto en tiempo de ejecución como en uso de memoria, ambas escalando logarítmicamente con el tamaño de los datos. Esto implica que tanto el tiempo de procesamiento como el espacio de memoria utilizado crecen muy lentamente a medida que aumenta el tamaño de los datos.

Justificación: Esta opción es un buen compromiso entre tiempo de ejecución y uso de memoria, especialmente adecuada para sistemas donde ambos recursos son limitados. La complejidad logarítmica en ambos aspectos hace que esta alternativa sea sustentable y eficiente para el entorno de dispositivos portables en telemedicina.

Conclusion:
Considerando las limitaciones de memoria y la necesidad de una ejecución eficiente, la alternativa c) parece ser la más equilibrada. Ofrece un muy buen compromiso entre la eficiencia computacional y el uso de memoria, lo cual es crucial en dispositivos con memoria extremadamente limitada y con requisitos de procesamiento en tiempo real. Esta opción asegura que el dispositivo pueda manejar los datos de entrada de manera eficiente sin importar sus recursos de memoria.


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

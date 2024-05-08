# Caso_Final_Finales
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

###1)

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

###2)

Tabla Hash 

Las tablas hash están diseñadas para el acceso rápido a los datos. Utilizan una función hash que toma una clave y devuelve un índice en un arreglo, donde se almacena el valor correspondiente. Las principales características y operaciones de las tablas hash son: Acceso, Inserción y Eliminación: En condiciones ideales, estas operaciones tienen un tiempo de complejidad de O(1). Sin embargo, la eficiencia depende fuertemente de la calidad de la función hash y del manejo de colisiones. Se pueden formar colisiones que pueden degradar el rendimiento a O(n) en el peor de los casos (si se utiliza encadenamiento para manejar colisiones). Funciona bien con elementos que necesitan ser accesados de manera rápida y directa. Sin embargo, pueden consumir más memoria, especialmente si la densidad de datos es baja en relación con el espacio reservado. Las tablas hash no mantienen ningún orden de las claves o valores almacenados. 

Árbol (Específicamente Árbol Binario de Búsqueda - ABB) 

Los árboles, en particular los árboles binarios de búsqueda, son estructuras de datos que organizan los elementos en nodos conectados, donde cada nodo tiene un elemento que es mayor o menor que el de sus nodos hijo de acuerdo a unas reglas específicas: Acceso, Inserción y Eliminación: Estas operaciones tienen un tiempo de complejidad promedio de O(logn), suponiendo que el árbol está balanceado. Si el árbol se desbalancea, estas operaciones pueden degradarse a O(n). Los árboles pueden necesitar operaciones de re-balanceo (como rotaciones en AVL o árboles rojo-negros) para mantener su eficiencia. Mantienen un orden intrínseco, lo cual facilita operaciones como búsqueda del mínimo/máximo, sucesor/predecesor y rangos de búsqueda. 

Cuándo utilizar cada estructura 

Tabla Hash:

Cuándo: Cuando necesitas acceso, inserción y eliminación extremadamente rápidos y el orden de los elementos no es importante.
Por qué: Es ideal para implementaciones de conjuntos o mapas donde el acceso directo es más crítico que el ordenamiento, como cachés, tablas de búsqueda rápida, y estructuras de datos donde las colisiones son mínimas o manejables.

Árbol:

Cuándo: Cuando es importante mantener un orden de los elementos y se necesitan operaciones como búsqueda de rangos o sucesores/predecesores.
Por qué: Es mejor en escenarios donde la integridad y el orden de los datos son críticos, como en bases de datos, sistemas de archivos, y cuando se necesitan operaciones de búsqueda más complejas.

###3)

Pila (Stack)

Una pila es una estructura de datos lineal que sigue el principio de "Last In, First Out" (LIFO), lo que significa que el último elemento que se añade a la pila es el primero en ser eliminado. Esto se implementa usando las operaciones:

Push: Añadir un elemento al tope de la pila.
Pop: Eliminar el elemento del tope de la pila.
Peek o Top: Observar el elemento en el tope de la pila sin eliminarlo.
Uso típico
Las pilas son ideales para situaciones en las que necesitas revertir operaciones, deshacer acciones, o cuando simplemente necesitas un acceso rápido al último elemento ingresado y no te interesa el resto hasta que ese último ha sido procesado. Ejemplos incluyen:

Manejo de llamadas a funciones en programación (la pila de llamadas).
Evaluación y conversión de expresiones en notación infix a postfix.
Algoritmos para recorrer estructuras como árboles y grafos (p. ej., recorrido en profundidad).
Complejidad Computacional
Push, Pop, Peek: Todas estas operaciones tienen una complejidad de tiempo O(1) ya que solo manipulan el elemento en el tope de la pila.
Cola (Queue)
Una cola es una estructura de datos que opera bajo el principio de "First In, First Out" (FIFO). Esto significa que el primer elemento añadido será el primero en ser eliminado. Las operaciones principales son:

Enqueue: Añadir un elemento al final de la cola.
Dequeue: Eliminar el elemento al frente de la cola.
Front: Observar el primer elemento sin eliminarlo.
Uso típico
Las colas son útiles cuando necesitas mantener un orden en la forma en que se procesan los elementos, exactamente en el orden en que llegaron. Son comunes en situaciones como:

Sistemas de manejo de tareas o eventos donde las tareas deben ser ejecutadas en el orden en que se reciben.
En buffer de impresión, donde las páginas a imprimir deben ser manejadas en el orden de solicitud.
Simulación de procesos o servicios, como atención al cliente o sistemas de tickets.
Complejidad Computacional
Enqueue, Dequeue, Front: Estas operaciones son también O(1) en la mayoría de implementaciones porque afectan solo al principio o al final de la cola.
Elección entre pila y cola
Elige una pila cuando necesites trabajar con los elementos en el orden inverso a como fueron agregados o cuando solo necesites acceso al último elemento añadido sin preocuparte por los elementos anteriores hasta que los últimos sean removidos.

Elige una cola cuando el orden de los elementos es importante y necesitas procesarlos en el mismo orden en que fueron recibidos. Esto es crítico en procesamientos secuenciales donde el orden de los eventos no debe alterarse.

###4)

Considérase el conjunto inicial: 50, 20, 84, 13, 22, 16, 89, 85.

Empiezas con el primer par (50 ya está en su lugar).
Llegas a 20, comparas con 50 y lo mueves detrás porque 20 es menor.
Siguiente es 84, ya está bien porque es mayor que 50.
Luego 13, lo mueves al principio porque es menor que todos los anteriores.
Continúas así, ajustando cada número en su lugar comparando con los anteriores hasta que todo esté ordenado.
Al final, la lista ordenada será: 13, 16, 20, 22, 50, 84, 85, 89.

Este método es simple y efectivo para listas pequeñas o casi ordenadas, aunque puede ser lento para listas grandes debido a su naturaleza de comparación repetitiva.


###5)

Para determinar a partir de qué tamaño de entrada n la función A es más eficiente que B, necesitas encontrar el punto en el que A realiza menos operaciones que B.

1024n < 16n^3

Dividiendo ambos lados de la desigualdad por 16n (asumiendo que n es mayor que cero para evitar división por cero), obtenemos:

64 < n^2 --> 8 < n

por lo que para valores de n mayores a 8 A es más eficiente que B.



##Ejercicio 3:

a) El codigo de la imagen no llegaria a compilar ya que a b se le declara como a un balor negativo en la funcion recursva y el codigo no tiene ninguna condicion para manejar valores negativos en b, ademas esta la condicion (b==0) que nunca se cumplira y se llamara contínuamente a si misma con valores cada vez mas negativos. el codigo arreglado esta adjunto en el paquete "Ejercicio_3"

b) El cálculo que está haciendo la función recursive es el de la potencia de un número a elevado a b. 
-if (b == 0), devuelve 1 porque cualquier número elevado a la potencia de 0 es 1.
-else if (a == 0), devuelve 0 porque 0 elevado a cualquier potencia positiva es 0.
En el caso recursivo (else), se multiplica a por el resultado de recursive(a, b-1), lo que efectivamente acumula el producto de a multiplicado por sí mismo b veces.


##Ejercicio 4:

####Tipo de recursividad:

la recursividad empleada en este ejercicio es lineal, la funcion se llama a sí misma y no esta dentro de ningún bucle.


###Complejidad computacional:

La complejidad computacional del algoritmo de este ejercicio es O(n), donde n es el número de dígitos en el número. Esto es porque cada llamada procesa un dígito del número (dividiendo el número por 10), y por lo tanto, el número de llamadas recursivas es proporcional al número de dígitos en el número original.


##Ejercicio 5:

UserAccountGUI: Esta es la interfaz gráfica de usuario (GUI) de la aplicación. Proporciona formularios para crear una cuenta, iniciar sesión, publicar tweets, seguir a otros usuarios, enviar mensajes directos y retweetear. Los usuarios pueden cambiar entre estos formularios utilizando un CardLayout.  

UserAccount: Esta clase representa una cuenta de usuario. Cada cuenta de usuario tiene un alias, un correo electrónico, una contraseña, una lista de tweets, una línea de tiempo, y conjuntos de seguidores y usuarios a los que sigue.  

Email: Esta clase representa un correo electrónico. Cada correo electrónico tiene una dirección de correo electrónico.  

Tweet: Esta clase representa un mensaje. Cada tweet tiene contenido, una marca de tiempo y un remitente.  

Retweet: Esta es una subclase de Tweet que representa un retweet. Cada retweet tiene un tweet original además de las propiedades heredadas de Tweet.  

DirectMessage: Esta es otra subclase de Tweet que representa un mensaje directo. Cada mensaje directo tiene un receptor además de las propiedades heredadas de Tweet.  

La aplicación permite a los usuarios crear una cuenta, iniciar sesión, publicar tweets, seguir a otros usuarios, enviar mensajes directos y retweetear. Los tweets, retweets y mensajes directos se almacenan en la cuenta del usuario y se muestran en su línea de tiempo. Los usuarios también pueden ver los tweets de los usuarios a los que siguen en su línea de tiempo.

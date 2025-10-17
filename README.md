# VideoJuegos
demostración de abstracción y polimorfismo en Java

En Java, las clases abstractas son una herramienta de gran utilidad cuando queremos que nuestras clases compartan algunos comportamientos, y que cada comportamiento se plantee de manera distinta.

Una clase abstracta no se puede instanciar en forma directa, es decir que no puedes crear un objeto a partir de ella, pero si se puede usar para difinir "UN ESQUELETO" de lo que las otras clases deben hacer. Este esqueleto puede contener metodos abstractos (Que las Sub-Clases deben esperimentar) y metodos con comportamientos ya definidos. 

EJEMPLO CON PERSONAJE, MARIO Y PRINCIPE DE PERSIA.

Tenemos una clase abstracta Personaje, todos los personajes pueden moverse y pelear pero lo hacen de forma distinta, el metodo moverse y pelear no son iguales para Mario que para el Principe de Persia.

USOS DE CLASES ABSTRACTAS.

1. Asegurar que todas las Sub-Clases compartan algunos comportamientos.
2. Asegurar que cadas Sub-Clase implementen dichos comportamientos a su manera.
3. Evitar repetir Codigo.

POLIMORFISMO.

El polimorfismo es util a la hora de generar flexibilidad en el codigo, pero sobretodo a la hora de simplificar el numero de conceptos que se deben manejar.

Tanto el polimorfismo como la herencia, son pilares fundamentales de la programacion orientada a objetos. Su correcta aplicacion en proyectos pueden marcar la diferencia en entre un codigo legible y facil de mantener, y un sistema propenso a tener errores y dificil de entender.

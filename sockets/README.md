# Ejemplo para crear un socket en Java
### ejemplo básico servidor mediante socket
En este ejemplo podemos conectar al servidor mediante telnet localhost 9090


### ejemplo servidor multihilo
La clase [MultiThreadedServer.java](https://github.com/manviny/PSP/blob/master/sockets/MultiThreadedServer.java) abre un socket para que multiples usuarios se conecten a el, envía un mensaje de bienvenida y saca por consola los mensajes recibidos por los clientes [ClientThread.java](https://github.com/manviny/PSP/blob/master/sockets/ClientThread.java), esta clase implementa hilos para poder llamar al servidor sin esperar en una cola.

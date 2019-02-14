# Ejemplo para crear un socket en Java

### 1.- ejemplo básico servidor mediante socket, permite un usuario
En este ejemplo [Server.java](https://github.com/manviny/PSP/blob/master/sockets/Server.java), podemos conectar al servidor mediante: 
```bash
telnet localhost 9090
```


### 2.-  ejemplo multiserver, permite varios usuarios en cola
Permite la conexión de varios usuarios, no tiene hilos por lo cual hasta que un usuario no termina la conexión, el siguiente tiene que esperar en cola. [MultiServer.java](https://github.com/manviny/PSP/blob/master/sockets/MultiServer.java)

### 3.- ejemplo servidor avanzado multihilo
La clase [MultiThreadedServer.java](https://github.com/manviny/PSP/blob/master/sockets/MultiThreadedServer.java) abre un socket para que multiples usuarios se conecten a el, envía un mensaje de bienvenida y saca por consola los mensajes recibidos por los clientes [ClientThread.java](https://github.com/manviny/PSP/blob/master/sockets/ClientThread.java), esta clase implementa hilos para poder llamar al servidor sin esperar en una cola.

### 4.- La clase cliente.java 
[cliente.java](https://github.com/manviny/PSP/blob/master/sockets/Client.java) nos permite conectarnos al servidor mediante java sin necesidad de usar telnet.

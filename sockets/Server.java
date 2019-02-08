package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) throws Exception {

        // 1.- Creamos un socket esperando clientes
        ServerSocket serverSocket = new ServerSocket(9090);
        System.out.println("esperando clientes...");

        // Cliente intenta conectar con el servidor, accept espera hasta que se establece la conexion
        Socket socket = serverSocket.accept();

        // 2.- OUT -> cliente
        // Necesitamos un stream para enviar datos al cliente
        // vamos a enviar un mensaje, asi que usaremos la clase PrintWriter
        // true -> autoflush , envia los datos sin esperar
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        out.println(("Hola cliente"));

        // 3.- IN <- cliente
        //  Ahora vamos a leer datos desde el cliente
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // Leer de un fichero es similar a leer desde un socket
        String clientInput = input.readLine();
        System.out.println(clientInput);

        // 4.- Cerramos el stream y el socket
        input.close();
        out.close();
        socket.close();
        serverSocket.close();

        // 5.- usaremos telnet para comunicarnos con el servidor
        // telnet localhost 9090


    }

}

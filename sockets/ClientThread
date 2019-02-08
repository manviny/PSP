package sample;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// podemos extender la clase Thread o hacer un runnable
public class ClientThread extends Thread {

    private Socket socket = null;

    public ClientThread (Socket socket){
        this.socket = socket;
    }

    public void run(){
        try {
        // OUT -> cliente
        // Necesitamos un stream para enviar datos al cliente
        // vamos a enviar un mensaje, asi que usaremos la clase PrintWriter
        // true -> autoflush , envia los datos sin esperar
        PrintWriter out = null;
            out = new PrintWriter(socket.getOutputStream(), true);
        out.println(("Hola cliente"));

        // IN <- cliente
        // Ahora vamos a leer datos desde el cliente
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // Leer de un fichero es similar a leer desde un socket
        String clientInput = input.readLine();
        System.out.println(clientInput);

        input.close();
        out.close();
        socket.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

}

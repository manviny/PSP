package sample;

import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer  {

    // Un servidor de un hilo, espera a todos clientes en la misma conexion
    // en un servidor multihilo, pasa la conexion a diferentes hilos
    public static void  main(String[] args){
        try
        {
            ServerSocket serverSocket = new ServerSocket(9090);
            boolean stop = false;
            while(!stop){
                System.out.println("Esperando clientes");
                Socket clientSocket = serverSocket.accept();
                System.out.println("El cliente se ha conectado");
                // usamos la clase ClientThread
                ClientThread clientThread = new ClientThread(clientSocket);
                clientThread.start();
            }

        }
        catch(Exception e){

        }
    }
}

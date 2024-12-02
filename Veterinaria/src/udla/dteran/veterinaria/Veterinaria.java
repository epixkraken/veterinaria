package udla.dteran.veterinaria;

//-----------CLASE PADRE----------//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    public void iniciar() throws IOException {
        Veterinaria local = new Veterinaria();

        Cliente cliente = new Cliente();
        List<String> listaClientes = new ArrayList<>();

        Mascota mascota = new Mascota();
        List<String> listaMascotas = new ArrayList<>();

        //MENU
boolean repeat = true;
while (repeat){
    System.out.println("MENU \n 1. Agregar Cliente \n 2. Remover Cliente \n " +
            "3. Mostrar Cliente \n 4. Agregar Mascota  \n 5. Remover Mascota \n 6. Mostrar Mascota");
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    //implementar mas funcionalidades
    int eleccion = Integer.parseInt(sc.readLine());

    if (eleccion == 1){
        //agregar cliente
        String nuevoCliente = cliente.adjClientes();
        cliente.addCliente(nuevoCliente, (List<String>) listaClientes);
    }
    else if (eleccion ==2){
        //remover cliente
        System.out.println("ID Cliente: ");
        String removercliente = sc.readLine();
        cliente.removeCliente(removercliente, listaClientes);

    }
    else if (eleccion ==3){
        //mostrar clientes
        System.out.println("Clientes");
        cliente.showCliente(listaClientes);
    }
    else if (eleccion ==4){
        //agregar mascota
        String nuevamascota = mascota.adjMascotas();
        mascota.addMascota(nuevamascota, (List<String>) listaMascotas);
    }
    else if (eleccion ==5){
        //remover mascota
        System.out.println("ID Cliente: ");
        String removercliente = sc.readLine();
        cliente.removeCliente(removercliente, listaClientes);
    }
    else if (eleccion ==6) {
        //mostrar mascotas
        System.out.println("Mascotas");
        mascota.showMascota(listaMascotas);
    }

    //Volver al menu principal
    System.out.printf("Desea volver al menu principal? (1. SI - 2. NO): ");
    int menu = Integer.parseInt(sc.readLine());
    if (menu == 2){break;}
        }
}
    //union y despliegue de catalogos

    public List<String> unirCatalogoCompleto(List<String> listaClientes, List<String> listaMascotas){
        //conversion de listas a strings
        String listaclientes = listaClientes.toString();
        String listamascotas = listaMascotas.toString();

        //union mediante otra lista
        List<String> catalogo = new ArrayList<>();
        catalogo.add(listaclientes);
        catalogo.add(listamascotas);

        return catalogo;

    }

    //mostrar catalogo

    public void mostrarCatalogoCompleto(List<String> catalogo){
        System.out.println("Veterinaria Catalogo");
        catalogo.forEach(System.out::println);
    }

    //buscar productos
    public void buscarMascotas(List<String> listaClientes, List<String> listaMascotas){
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); //lector
        Cliente cliente = new Cliente();
        Mascota mascota = new Mascota();

        }

}

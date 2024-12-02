package udla.dteran.veterinaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ListIterator;

//------------Clase Hija-----------------//
public class Cliente {

    // atributos

    private String nombre;
    public String idCliente;
    private String direccion;
    private String telefono;

    //constructor

    public Cliente(){}

    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Ingreso de clientes

    public String adjClientes () throws IOException {
        Veterinaria tienda = new Veterinaria();
        StringBuilder cliente = new StringBuilder();
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        //INGRESAR INFORMACION CLIENTES

        //Nombre
        System.out.println("Nombre Cliente: ");
        String nombre = rd.readLine();
        setNombre(nombre);
        cliente.append(getNombre() + "\t");

        //ID cliente
        System.out.println("ID Cliente: ");
        String id = rd.readLine();
        setIdCliente(id);
        cliente.append(getIdCliente() + "\t");

        //Direccion

        System.out.println("Direccion: ");
        String direccion = rd.readLine();
        setDireccion(direccion);
        cliente.append(getDireccion());

        //Telefono
        System.out.println("Telefono: ");
        String telefono = rd.readLine();
        setTelefono(telefono);
        cliente.append(getTelefono());

        return cliente.toString();
    }

    //AGREGAR CLIENTES

    public void addCliente(String cliente, List<String> listaClientes){
        listaClientes.add(cliente);
        System.out.println("Cliente Agregado");
    }

    //QUITAR CLIENTES

    public void removeCliente (String idCliente, List<String> listaClientes){
        ListIterator<String> j = listaClientes.listIterator();
        while (j.hasNext()){
            if (j.next().contains(idCliente)){
                j.remove();
            }
        }
        System.out.println("Cliente Eliminado");
    }

    //MOSTRAR CLIENTES

    public void showCliente(List<String> listaClientes){
        System.out.println("INFORMACIÓN\n");
    }

    //BUSCAR CLIENTE


    public void searchCliente(String cliente, List<String> listaClientes) {
        ListIterator<String> i = listaClientes.listIterator();
        System.out.println(" Clientes ");
        while (i.hasNext()) {
            String encontrado = i.next();
            if (encontrado.contains(cliente)) {
                System.out.println(encontrado);
            }
        }
        System.out.println("");
    }

}

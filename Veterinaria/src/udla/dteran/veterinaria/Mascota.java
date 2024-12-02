package udla.dteran.veterinaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ListIterator;

//---------CLASE HIJA-----------//
public class Mascota extends Cliente {

    //Atributos

    private String nombremascota;
    private String tipo;

    //Constructor

    public Mascota (){};

    //setters y getters



    public String getNombremascota() {
        return nombremascota;
    }


    public void setNombremascota(String nombre) {
        this.nombremascota = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Ingreso de mascotas

    public String adjMascotas () throws IOException{
        Cliente id = new Cliente();
        StringBuilder mascota = new StringBuilder();
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        //INGRESAR INFORMACIÓN DE MASCOTA

        //Nombre
        System.out.println("Nombre Mascota: ");
        String nombremascota = rd.readLine();
        setNombremascota(nombremascota);
        mascota.append(getNombremascota() + "\t");

        //Tipo
        System.out.println("Tipo: ");
        String tipo = rd.readLine();
        setTipo(tipo);
        mascota.append(getTipo()+"\t");

        return mascota.toString();
    }

    //AGREGAR MASCOTAS

    public void addMascota(String mascota, List<String> listaMascotas){
        listaMascotas.add(mascota);
        System.out.println("Mascota Agregada");
    }

    //QUITAR MASCOTAS

    public void removeMascota(String nombremascota, List<String> listaMascota){

        ListIterator<String> j = listaMascota.listIterator();
        while (j.hasNext()){
            if (j.next().contains(nombremascota)){
                j.remove();
            }
        }
        System.out.println("Mascota Eliminada");
    }

    //MOSTRAR MASCOTAS

    public void showMascota(List<String> listaMascotas){
        System.out.println("INFORMACIÓN MASCOTAS\n");
    }
}

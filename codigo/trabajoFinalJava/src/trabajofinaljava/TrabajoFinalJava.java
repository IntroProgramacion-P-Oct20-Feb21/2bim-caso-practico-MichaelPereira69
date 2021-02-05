/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinaljava;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TrabajoFinalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String salida;
        String ciclo;
        String cadenaFinal="";
        int contador = 0;
        int opciones;
        boolean bandera = true;
        while (bandera) {
            System.out.printf("Selecciona 1 y creamos una cuenta de Facebook\n"
                    + "Selecciona 2 y creamos una cuenta de Twitter\n"
                    + "Selecciona 3 y creamos  una cuenta de Whatsapp\n"
                    + "Selecciona 4 y creamos una una cuenta de Telegram\n"
                    + "Selecciona 5 y creamos una cuenta de Signal\n"
                    + "Selecciona 6 y creamos una cuenta de Instagram\n"
                    + "Selecciona 7 y creamos una cuenta de Flickr\n> ");
            opciones = entrada.nextInt();
            switch (opciones) {
                case 1:
                    cadenaFinal= Facebook();
                    System.out.printf(cadenaFinal);
                    break;
                case 2:
                    Twitter();
                    break;
                case 3:
                    cadenaFinal= Whatsapp();
                    System.out.println(cadenaFinal);
                    break;
                case 4:
                    Telegram();
                    break;
                case 5: 
                    cadenaFinal= Signal();
                    System.out.println(cadenaFinal);
                    break;
                case 6:
                    Instagram();
                    break;
                case 7:   
                    cadenaFinal= Flickr();
                    System.out.println(cadenaFinal);
                    break;
                default:
                    System.out.println("Esta opcion no existente ");
            }
            entrada.nextLine();
            contador = contador + 1;          
            System.out.print("Ingrese >Salir< si desea salir del ciclo\n");
            salida = entrada.nextLine();
            salida = salida.toLowerCase();
            if (salida.equals("salir")) {
                bandera = false;
                
            }
        }
        System.out.printf("%s\n", obtenerMensaje(contador));
    }
    public static String Facebook() {
        Scanner entrada = new Scanner(System.in);
        String  mensaje;
        String  nombre;
        String  pais;
        String  ciudad;
        String  correo;
        int     edad;
        System.out.println("Creemos una cuenta de >>Facebook<<");
        System.out.print("Nombre de usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Edad :\n> ");
        edad = entrada.nextInt();
        System.out.print("Ciudad en la que resides:\n> ");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.print("Pais:\n> ");
        pais = entrada.nextLine();
        System.out.print("Correo electronico:\n> ");
        correo = entrada.nextLine();
        mensaje = String.format("Cuenta de Facebook \nUsuario "
                + " %s\nEdad : %d\nCiudad en la que reside: %s\n"
                + "Pais: %s\nCorreo electronico: %s\n",
                nombre, edad, ciudad, pais, correo);
        return mensaje;
    }

    public static void Twitter() {
        Scanner entrada = new Scanner(System.in);
        String correo;
        String nombresCompletos;
        int    edad;
        String nombre;
        String apellido;
        String pais;
        String ciudad;
        String idioma;
        System.out.println("Creemos una cuenta de >>Twitter<<");
        System.out.print("Nombre de usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Nombres completos:\n> ");
        nombresCompletos = entrada.nextLine();
        System.out.print("Apellidos Completos:\n> ");
        apellido = entrada.nextLine();
        System.out.print("Edad:\n> ");
        edad = entrada.nextInt();
        System.out.print("Ciudad en la que resides:\n> ");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.print("Pais:\n> ");
        pais = entrada.nextLine();
        System.out.print("Idioma:\n> ");
        idioma = entrada.nextLine();
        System.out.print("Correo electronico:\n> ");
        correo = entrada.nextLine();
        System.out.printf("Cuenta de Twitter  \nUsuario  "
                + " %s\nNombres Completos : %s\nApellidos "
                + "Completos : %s\nEdad: %d\nCiudad en "
                + "la que resides: %s\nPais del usuario:"
                + " %s\nPais: %s"
                + "\nCorreo electronico: %s\n", nombre, nombresCompletos,
                apellido, edad, ciudad, pais, idioma, correo);
    }

    public static String Whatsapp() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        int telefono;
        int edad;
        String pais;
        String ciudad;
        System.out.println(" Creaemos una cuenta de >>Whatsapp<<");
        System.out.print("Usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Numero de telefono:\n> ");
        telefono = entrada.nextInt();
        System.out.print("Edad :\n> ");
        edad = entrada.nextInt();
        System.out.print("Ciudad en la que resides :\n> ");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.print("Pais :\n> ");
        pais = entrada.nextLine();
        mensaje = String.format("Cuenta de Whatsapp \nUsuario  :"
                + " %s\nNumero de telefono : %d\nEdad :"
                + " %d\nCiudad en la que reside: %s\nPais: %s\n",
                nombre, telefono, edad, ciudad, pais);
        return mensaje;
    }

    public static void Telegram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int telefono;
        String pais;
        String ciudad;
        String interes;
        System.out.println("Creemos una cuenta >> Telegram<<");
        System.out.print("Nombre de Usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Numero de Telefono:\n> ");
        telefono = entrada.nextInt();
        System.out.print("Ciudad donde reside :\n> ");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.print("Pais :\n> ");
        pais = entrada.nextLine();
        System.out.print("Area de interes:\n> ");
        interes = entrada.nextLine();
        System.out.printf("Cuenta de Telegram  \nUsuario"
                + "%s\nNumero de Telefono : %d\nCiudad en la que reside : "
                + "%s\nPais : %s\nArea de interes: %s\n",
                nombre, telefono, ciudad, pais, interes);
    }

    public static String Signal() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        int telefono;
        String pais;
        String ciudad;
        String hobby;
        System.out.println("Creemos una Cuenta de >>Signal<<");
        System.out.print("Nombre del usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Telefono :\n> ");
        telefono = entrada.nextInt();
        System.out.print("Ciudad en la que reside :\n> ");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.print("Pais :\n> ");
        pais = entrada.nextLine();
        System.out.print("Hobby principal :\n> ");
        hobby = entrada.nextLine();
        mensaje = String.format("Cuenta de Signal \nUsuario "
                + " %s\nTelefono: %d\nCiudad en la que reside: "
                + "%s\nPais : %s\nHobby principal: %s\n",
                nombre, telefono, ciudad, pais, hobby);
        return mensaje;
    }
    public static void Instagram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String correo;
        int    edad;
        System.out.println("Creemos una Cuenta de >>Instagram<<");
        System.out.print("Nombre de usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Ciudad en la que reside:\n> ");
        ciudad = entrada.nextLine();
        System.out.print("Edad:\n> ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Correo Electronico:\n> ");
        correo = entrada.nextLine();
        System.out.printf("Cuenta de Instagram \nUsuario "
                + "%s\nCiudad en la que reside: %s\nEdad: %d\n"
                + "Correo Electronico: %s\n",
                nombre, ciudad, edad, correo);
    }

    public static String Flickr() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        String correo;
        System.out.println("Creemos una Cuenta de >>Flickr<<");
        System.out.print("Nombre de usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Correo Electronico:\n> ");
        correo = entrada.nextLine();
        mensaje = String.format("Cuenta de Flickr \nUsuario: "
                + "%s\nCorreo electronico: %s\n",
                nombre, correo);
        return mensaje;
    }
    public static String obtenerMensaje(int cuentasCreadas) {
        String mensaje = "";
        String mensajeFinal[] = {"Campaña con poca afluencia",
                                "Campaña moderada siga adelante", 
                                "Excelente campaña"};
        if (cuentasCreadas >= 1 && cuentasCreadas <= 5) {
            mensaje = mensajeFinal[0];
        } else {
            if (cuentasCreadas >= 6 && cuentasCreadas <= 15) {
                mensaje = mensajeFinal[1];
            } else {
                if (cuentasCreadas >= 16) {
                    mensaje = mensajeFinal[2];
                }
            }
        }
        return mensaje;
    }
}

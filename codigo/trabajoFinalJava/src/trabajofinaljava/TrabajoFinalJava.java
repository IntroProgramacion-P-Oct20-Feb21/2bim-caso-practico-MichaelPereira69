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
        boolean bandera = true;
        int salida;
        int contador = 0;
        int opcion;
        while (bandera) {
            System.out.printf("Selecciona 1 y creamos una cuenta de Facebook\n"
                    + "Selecciona 2 y creamos una cuenta de Twitter\n"
                    + "Selecciona 3 y creamos  una cuenta de Whatsapp\n"
                    + "Selecciona 4 y creamos una una cuenta de Telegram\n"
                    + "Selecciona 5 y creamos una cuenta de Signal\n"
                    + "Selecciona 6 y creamos una cuenta de Instagram\n"
                    + "Selecciona 7 y creamos una cuenta de Flickr\n> ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf(crearFacebook());
                    break;
                case 2:
                    crarTwitter();
                    break;
                case 3:
                    System.out.println(crearWhatsapp());
                    break;
                case 4:
                    crearTelegram();
                    break;
                case 5:
                    System.out.println(crearSignal());
                    break;
                case 6:
                    crearInstagram();
                    break;
                case 7:
                    System.out.println(crearFlickr());
                    break;
                default:
                    System.out.println("Opcion no existente");
            }
            contador = contador + 1;
            System.out.print("Ingrese >1< si desea salir del ciclo\n>");
            salida = entrada.nextInt();
            if (salida == 1) {
                bandera = false;
            }
        }
        System.out.printf("La campaña es una: %s\n", obtenerMensaje(contador));
    }

    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String resumen;
        String nombre;
        int edad;
        String pais;
        String ciudad;
        String correo;
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
        resumen = String.format("Cuenta de Facebook \nUsuario "
                + " %s\nEdad : %d\nCiudad en la que reside: %s\n"
                + "Pais: %s\nCorreo electronico: %s\n",
                nombre, edad, ciudad, pais, correo);
        return resumen;
    }

    public static void crarTwitter() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String nombresCompletos;
        int edad;
        String apellidos;
        String idioma;
        String pais;
        String ciudad;
        String correo;
        System.out.println("<< Cuenta de Twitter >>");
        System.out.print("Nombre de usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Nombres completos:\n> ");
        nombresCompletos = entrada.nextLine();
        System.out.print("Apellidos Completos:\n> ");
        apellidos = entrada.nextLine();
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
                apellidos, edad, ciudad, pais, idioma, correo);
    }

    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String resumen;
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
        resumen = String.format("Cuenta de Whatsapp \nUsuario  :"
                + " %s\nNumero de telefono : %d\nEdad :"
                + " %d\nCiudad en la que reside: %s\nPais: %s\n",
                nombre, telefono, edad, ciudad, pais);
        return resumen;
    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int telefono;
        String pais;
        String ciudad;
        String interes;
        System.out.println("Creemos una cuenta  >> Telegram<<");
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

    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String resumen;
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
        resumen = String.format("Cuenta de Signal \nUsuario "
                + " %s\nTelefono: %d\nCiudad en la que reside: "
                + "%s\nPais : %s\nHobby principal: %s\n",
                nombre, telefono, ciudad, pais, hobby);
        return resumen;

    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String ciudad;
        String correo;
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

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String resumen;
        String nombre;
        String correo;
        System.out.println("Creemos una Cuenta de >>Flickr<<");
        System.out.print("Nombre de usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Correo Electronico:\n> ");
        correo = entrada.nextLine();
        resumen = String.format("Cuenta de Flickr \nUsuario: "
                + "%s\nCorreo electronico: %s\n",
                nombre, correo);
        return resumen;

    }

    public static String obtenerMensaje(int cuentasCreadas) {
        String mensaje = "";
        String mensajeFinal[] = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante", "Excelente campaña"};
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

public class Ejercicio_25_Array {

    public static void main(String[] args) {
        char[] pin = "Ax5abcdefg@".toCharArray();

        if (verificarContrasena(pin)) {
            System.out.println("Tu contraseña cumple con los requisitos.");
        } else {
            System.out.println("Tu contraseña No cumple con los requisitos.");
            System.out.println("¡Vuelve a ingresar otra contraseña!");
        }
    }

    static boolean verificarContrasena(char[] claveSecreta) {
        if (claveSecreta.length < 8) {
            return false;
        }

         boolean contieneUnaMayuscula = false, contieneUnaMinuscula = false;
         boolean contieneUnDigito = false, contieneUnSimbolo = false;

        for (char codigo : claveSecreta) {
            if (Character.isUpperCase(codigo)) {
                contieneUnaMayuscula = true;
            } else if (Character.isLowerCase(codigo)) {
                contieneUnaMinuscula = true;
            } else if (Character.isDigit(codigo)) {
                contieneUnDigito = true;
            } else {
              
                contieneUnSimbolo = true;
            }
        }

        return contieneUnaMayuscula && contieneUnaMinuscula && contieneUnDigito && contieneUnSimbolo;
    }
}

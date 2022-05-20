public class DanielaGarcia_Examen1 {

    public static void main(String[] args) {
        int valorhorasOrdinarias = 265;
        int valorhorasExtra = 350;
        int horasTrabajadas = 53;
        int horasExtras = 0;
        if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;
            System.out.println("El total a pagar por horas laborales normal (40hrs) es de : " + (40 * valorhorasOrdinarias));
            System.out.println("El total a pagar por horas Extra " + horasExtras + " es de : " + (horasExtras * valorhorasExtra));
        } else
            System.out.println("El total a pagar por horas laborales normal (40hrs) es de : " + (horasTrabajadas * valorhorasOrdinarias));
    }
}




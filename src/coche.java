public class coche {
    int puertas = 1;

    public int incremento(int puertas) {
        int salidas = puertas;
        salidas = salidas +1;
        return salidas;
    }


    public static void main(String[] args) {
        coche miCoche;
        miCoche = new coche();
        int puertas = 4;
        System.out.println(miCoche.incremento(puertas));
    }
}

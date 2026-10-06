
package tv;

public class Tv {
    String marca = "Samsung";
    int pulgadas = 55;
    boolean encendido = false;
    int volumen = 10;

    void encender()      { System.out.println("La TV se está encendiendo..."); encendido = true; }
    void apagar()        { System.out.println("La TV se está apagando..."); encendido = false; }
    void subirVolumen()  { System.out.println("Subiendo el volumen..."); volumen++; }
    void bajarVolumen()  { System.out.println("Bajando el volumen..."); volumen--; }
}

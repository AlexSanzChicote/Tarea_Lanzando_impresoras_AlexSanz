public class CuentaAtras implements  Runnable{

    //Definicion de variables
    private int NumeroPaginas;
    private String Nombre="";

    //Se crea estatica para que pueda generar una para cada hilo
    private static int contadorPaginas=0;

    //Una variable por instancia
    private final int idPagina=contadorPaginas;

    //constructor
    public CuentaAtras(int NumeroPaginas,String Nombre) {
        this.NumeroPaginas = NumeroPaginas;
        this.Nombre=Nombre;
        contadorPaginas++;
    }

    @Override
    public void run() {
        // for para hacer de la pagina 1 hasta la pedida
        for (int paginaActual = 1; paginaActual <= NumeroPaginas; paginaActual++) {
            System.out.println("Impresora " + Nombre + ", Imprimiendo página: " + paginaActual + " de " + NumeroPaginas);

            // Restablece la interrupción y termina el la tarea
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                    e.printStackTrace();
                 return;
            }
        }
        }
    }


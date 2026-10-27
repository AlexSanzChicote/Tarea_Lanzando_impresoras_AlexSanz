public  class Main {
    public static void main(String[] args){
        //Creo 2 objetos cuentaAtras
        Thread Impresora_A=new Thread(new CuentaAtras(3,"A"));
        Thread Impresora_B=new Thread(new CuentaAtras(5,"B"));
        Thread Impresora_C=new Thread(new CuentaAtras(4,"C"));

        //Lanzo hilos
        Impresora_A.start();
        Impresora_B.start();
        Impresora_C.start();

    }
}
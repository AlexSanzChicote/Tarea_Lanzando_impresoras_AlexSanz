public  class Main {
    public static void main(String[] args){
        //Creo 3 objetos Impresoras
        Thread Impresora_A=new Thread(new Impresora(3,"A"));
        Thread Impresora_B=new Thread(new Impresora(5,"B"));
        Thread Impresora_C=new Thread(new Impresora(4,"C"));

        //Lanzo hilos
        Impresora_A.start();
        Impresora_B.start();
        Impresora_C.start();

    }
}

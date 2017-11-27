public class programa {
    public static void main(String[]args){
        algoritmoOrdenamiento ordenar= new algoritmoOrdenamiento();
        int vector1[]={5,6,3,44,22,1};
        int vector2[]={55,4,43,44,2,10};
        System.out.println("arreglo original ");
        ordenar.mostrarArreglo(vector1);

        System.out.println("arreglo ordenado con burbuja 1");
        ordenar.burbuja1(vector1);
        ordenar.mostrarArreglo(vector1);


        System.out.println("arreglo original ");
        ordenar.mostrarArreglo(vector2);

        System.out.println("arreglo ordenado con burbuja 2");
        ordenar.burbuja1(vector2);
        ordenar.mostrarArreglo(vector2);

    }
}

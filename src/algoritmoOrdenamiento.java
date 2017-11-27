public class algoritmoOrdenamiento {
    int i,j,temporal;

    public algoritmoOrdenamiento(){
        this.i=0;
        this.j=0;
        this.temporal=0;

    }
    //metodo burbuja
    public void burbuja1(int[]arreglo){
        for(i=0; i<arreglo.length; i++){
            for (j=i+1; j<arreglo.length; j++){
                if(arreglo[i]>arreglo[j]){
                    temporal=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;
                }
            }
        }
    }
    //metodo burbuja2
    public void burbuja2(int[]arreglo){

        for(i=1; i<arreglo.length; i++){
            for (j=0; j<arreglo.length-1; j++){
                if(arreglo[j]>arreglo[j+1]){
                    temporal=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temporal;
                }
            }
        }
    }
    //mostrar los datos del vector

    public void mostrarArreglo(int[]arreglo){
       int k=0;
       for(k=0; k<arreglo.length;k++){
           System.out.print("["+arreglo[k]+"]");

        }
        System.out.println();
    }
}

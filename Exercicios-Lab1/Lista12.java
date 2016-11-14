
public class Lista12
{
    public byte[] ordenaCrescente (byte[] array) {
        for (int i =0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    byte aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    } 
}

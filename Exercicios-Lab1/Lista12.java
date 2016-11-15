
public class Lista12
{
    public byte[] ordenaCrescente (byte[] array) {
        byte aux;
        for (int i =0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
    
    public String[] ordenaAlfabeticamente (String[] words) {
        String aux;
        for (int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if (words[i] != null && words[j] != null) {
                    if (words[i].compareTo(words[j]) > 0) {
                        aux = words[i];
                        words[i] = words[j];
                        words[j] = aux;
                    }
                }
            }
        }
        return words;
    }
    
    public double[] ordenaDecrescente (double[] array) {
        double aux;
        for (int i = 0; i < array.length - 1; i+=2) {
            for(int j = i + 2; j < array.length; j+=2) {
                if (array[i] < array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
}

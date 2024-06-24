public class ReverseElementArray {
    public static void main(String[] args) {

        //It is assumed that each element is greater than zero.
        int[] array = {456, 123, 78912, 916, 25, 916321};

        int[] reverseElementArr = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            int numb = array[i];
            int result = 0;
            while(numb > 0) {
                result = result * 10 + numb % 10;
                numb = numb / 10;
            }
            reverseElementArr[i] = result;
        }

        for(int el : reverseElementArr) {
            System.out.print(el + " ");
        }


    }
}

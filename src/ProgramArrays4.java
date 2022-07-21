public class ProgramArrays4 {
    public static void main(String[] args) {
        double[] temp = new double[6];
        temp[0] = 34.7;
        temp[1] = 30.8;
        temp[2] = 20.0;
        temp[3] = 31;
        temp[4] = 17;
        temp[5] = 30;

        for (int i = 0; i < temp.length; i++) {
            i = i++;
            System.out.println("os tamanho da temperatura " + i + " é " + temp[i] + " graus");
        }
        System.out.println("**************");
        int i = 0;
        for (double temperaturas : temp) {
            System.out.println("tamanho posição " + i + "da temperatura é " + temperaturas);
            i++;
        }


    }
}
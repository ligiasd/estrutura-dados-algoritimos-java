public class ProgramArrays3 {
    public static void main(String[] args) {
        int arry[] = { 10, 20, 30};
        System.out.println(arry[2]);
        System.out.println("*********");

        int arry2[] = new int[10];
        int i;

        for (i=0; i < 10; i++) //condição para verificar posição for menos que 10
            arry2[i] = i;

        for (i = 0; i<10; i++)// faz contagem de posoçoes e respectivos valores
        System.out.println(arry2[i]);
    }
}
public class Test3 {
    public static void main(String[] args) throws Exception {
        //test removendo posição
        Vetor vetor = new Vetor(3);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
        vetor.adiciona("elemento 5");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");


        //System.out.println(vetor.busca(15));
        System.out.println(vetor);
        System.out.println(vetor.busca("elemento 3"));
        vetor.adicionar(0,"A");

        System.out.println(vetor);

    }
}

/** Programa simples para representar um vetor, ou seja, uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo.
 * @author Ranieri Mendes
 */

package vetor01;

public class Vetor01 {
    public static void main(String[] args) {
        //int n[] = new int[4];
        int n[] = {3,2,8,7,5,4};
        System.out.println("Total de casas de N(Vetor) " + n.length); //length é o total de casas do vetor, atributo do meu vetor

        /*
        for(int c=0; c<=5; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
         */
        //O código acima é ruim, pois se eu mudar o número de casas do vetor, terei que mudar o número do for, o que não é recomendado.
        // O ideal é usar o length para determinar o número de casas do vetor, assim, se eu mudar o número de casas do vetor, o código continuará funcionando normalmente.
        for(int c=0; c<=n.length; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
}

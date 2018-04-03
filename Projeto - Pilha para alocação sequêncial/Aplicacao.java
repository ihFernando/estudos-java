import java.util.Scanner;

/**
* 
* @class Aplicacao
* @author Fernando
* 
* Recebe uma ação e verifica se ela pode ser executada ou não.
* 1 - Empilhar    (Verifica se a pilha não está cheia e se estiver exibir mensagem avisando que não há mais espaços para empilhar)
* 2 - Desempilhar (Verifica se a pilha está vazia e se estiver exibir mensagem avisando que não há mais valores para retirar)
* 3 - mostraTopo  (Retorna topo valor da pilha)
* 4 - mostraPilha (Retorna todos os valores da pilha)
* 5 - Finalizar   (Termina a execução do loop)
* 
*/

public class Aplicacao {
    public static void main(String[] args) {
    int tamanho;
    int opc;
    int valor;
    
    // Recebe valor do teclado
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Defina tamanho da pilha: ");
    tamanho = entrada.nextInt();
    
    Pilha p = new Pilha(tamanho);
    
    do {
        System.out.println("1 - Empilhar");
        System.out.println("2 - Desempilhar");
        System.out.println("3 - Mostrar topo");
        System.out.println("4 - Mostrar pilha");
        System.out.println("9 - Finalizar");
        opc = entrada.nextInt();
        switch(opc) {
            case 1:
                System.out.println("Checando se há espaço na pilha...");
                if(p.pilhaCheia()) {
                    System.out.println("Desculpe! Pilha cheia...");
                } else {
                    System.out.println("Tudo pronto! Defina um valor...");
                    valor = entrada.nextInt();
                    System.out.println("Empilhando...");
                    p.empilha(valor);
                    System.out.println("Pronto! Valor empilhado.");
                }
            break;
            case 2:
                System.out.println("Checando valores da pilha...");
                if(p.pilhaVazia()) {
                    System.out.println("Humm, parece que a pilha já está vazia...");
                } else {
                    System.out.println("Desempilhando...");
                    p.desempilha();
                    System.out.println("Pronto! Desempilhado.");
                }
            break;
            case 3:
                System.out.println("Topo da pilha: "+(p.getTopo()+1));
            break;
            case 4:
                System.out.println("Carregando pilha...");
                for(int i = 0; i<p.getTamanho();i++) {
                    if(i == p.getTamanho()){
                        System.out.println(p.getValor(i)+".");
                    } else {
                        System.out.print(p.getValor(i)+", ");
                    }
                }
            break;
            case 9:
                System.out.println("Finalizado.");
            break;
            default:
                System.out.println("Valor inválido.");
            }
        } while(opc != 9);
    entrada.close();
    }
}

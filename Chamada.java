import java.util.ArrayList;
import java.util.Scanner;

public class Chamada {
    public static void ConstroiPessoa(){
        ArrayList<Pessoa> listapessoa = new ArrayList<Pessoa>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu ID");
        int id = sc.nextInt();
        System.out.print("Digite seu Nome");
        String nome = sc.nextLine();
        System.out.print("Digite seu tipo");
        sc.nextLine();
        String tipo = sc.nextLine();

        for(Pessoa p : listapessoa){
            if(p.getId() != id){
                Pessoa pessoa = new Pessoa (id, nome, tipo);
                listapessoa.add(pessoa);
            }
            else{
                System.out.println("ID de usuário já existente");
            }
        }
        sc.close();
    }
    
}

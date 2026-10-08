import java.util.ArrayList;
import java.util.Scanner;

public class chekin_dates {
	public static void main(String[] args) {
    	ArrayList<String> meu = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=================================");
        System.out.println("       DADOS EM AVALIAÇÃO...     ");
        System.out.println("=================================");
        
        meu.add("1° | DADOS: <CPF, CEP, RG> | ESPELHO: 0999 | STATUS: 0 ");
        meu.add("2° | DADOS: <CPF, CEP, RG> | ESPELHO: 0123 | STATUS: 1 ");
        meu.add("3° | DADOS: <CPF, CEP, RG> | ESPELHO: 0456 | STATUS: 0 ");
        meu.add("4° | DADOS: <CPF, CEP, RG> | ESPELHO: 0098 | STATUS: 1 ");
        meu.add("5° | DADOS: <CPF, CEP, RG> | ESPELHO: 0283 | STATUS: 0 ");
        System.out.println(meu);

		ArrayList<String> dados = new ArrayList<>();
        
        dados.add("1 | 420.963.607-94 | 0988-000 | 76.987.736-0 | ");
        dados.add("2 | 680.249.123-39 | 0645-500 | 67.836.425-7 | ");
        dados.add("3 | 938.840.039-10 | 9367-988 | 58.375.135-3 | ");
        dados.add("4 | 295.369.450-37 | 2596-888 | 39.580.386-9 | ");
        dados.add("5 | 209.902.385-79 | 4078-229 | 24.260.233-2 | ");
		System.out.println(dados);
        
        System.out.println("====================================");
        System.out.println("| ANALISE DE DADOS EM PROFUNDIDADE |");
        System.out.println("====================================");
        
        System.out.print("QUAIS DADOS?:_ (digite em x°) ");
        String dd = sc.nextLine();
        sc.nextLine();
        
        if(dd.equals("1°")) {
        	System.out.println(meu.get(0));
            System.out.println(meu.contains("1° | DADOS: <CPF, CEP, RG> | ESPELHO: 0999 | STATUS: 0 "));
            System.out.print("DIGITE O NOVO DADO:_ ");
            String novo_dado = sc.nextLine();
            meu.remove("1° | DADOS: <CPF, CEP, RG> | ESPELHO: 0999 | STATUS: 0 ");
            meu.add(0, novo_dado);
            System.out.println(meu.lastIndexOf(novo_dado));
            System.out.println(meu.size());
        }
        else if(dd.equals("2°")) {
        	System.out.println(meu.get(1));
            System.out.println(meu.contains("2° | DADOS: <CPF, CEP, RG> | ESPELHO: 0123 | STATUS: 1 "));
            System.out.print("DIGITE O NOVO DADO:_ ");
            String novo_dado2 = sc.nextLine();
            sc.nextLine();
            meu.remove("2° | DADOS: <CPF, CEP, RG> | ESPELHO: 0123 | STATUS: 1 ");
            meu.add(1, novo_dado2);
            System.out.println(meu.lastIndexOf(novo_dado2));
            System.out.println(meu.size());
        }
        else if(dd.equals("3°")) {
        	System.out.println(meu.get(2));
            System.out.println(meu.contains("3° | DADOS: <CPF, CEP, RG> | ESPELHO: 0456 | STATUS: 0 "));
            System.out.print("DIGITE O NOVO DADO:_ ");
            String novo_dado3 = sc.nextLine();
            sc.nextLine();
            meu.remove("3° | DADOS: <CPF, CEP, RG> | ESPELHO: 0456 | STATUS: 0 ");
            meu.add(2, novo_dado3);
            System.out.println(meu.lastIndexOf(novo_dado3));
            System.out.println(meu.size());
        }
        else if(dd.equals("4°")) {
        	System.out.println(meu.get(3));
            System.out.println(meu.contains("4° | DADOS: <CPF, CEP, RG> | ESPELHO: 0098 | STATUS: 1 "));
            System.out.print("DIGITE O NOVO DADO:_ ");
            String novo_dado4 = sc.nextLine();
            sc.nextLine();
            meu.remove("4° | DADOS: <CPF, CEP, RG> | ESPELHO: 0098 | STATUS: 1 ");
            meu.add(3, novo_dado4);
            System.out.println(meu.lastIndexOf(novo_dado4));
            System.out.println(meu.size());
        }
        else if(dd.equals("5°")) {
        	System.out.println(meu.get(4));
            System.out.println(meu.contains("5° | DADOS: <CPF, CEP, RG> | ESPELHO: 0283 | STATUS: 0 "));
            System.out.print("DIGITE O NOVO DADO:_ ");
            String novo_dado5 = sc.nextLine();
            sc.nextLine();
            meu.remove("5° | DADOS: <CPF, CEP, RG> | ESPELHO: 0283 | STATUS: 0 ");
            meu.add(4, novo_dado5);
            System.out.println(meu.lastIndexOf(novo_dado5));
            System.out.println(meu.size());
        }
        else {
        	System.out.println("[ ERROR ]");
        }
        
        System.out.println("============================================");
        System.out.println("RELATORIO DE ANALISE DE DADOS SECUNDARIOS PR");
        System.out.println("============================================");
        
        System.out.print("DIGITE O DADO A VER:_ (coloque '|' depois do n° )");
        String dd2 = sc.nextLine();
        sc.nextLine();
        
        if(dd2.equals("1 |")) {
        	System.out.println(dados.get(0));
            System.out.println(dados.contains("1 | 420.963.607-94 | 0988-000 | 76.987.736-0 | "));
            System.out.print("DIGITE O NOVO DADO2:_ ");
            String novos_dados1 = sc.nextLine();
            sc.nextLine();
            dados.remove("1 | 420.963.607-94 | 0988-000 | 76.987.736-0 | ");
            dados.add(0, novos_dados1);
            System.out.println(dados.lastIndexOf(novos_dados1));
            System.out.println(dados.size());
        }
        else if(dd2.equals("2 |")) {
        	System.out.println(dados.get(1));
            System.out.println(dados.contains("2 | 680.249.123-39 | 0645-500 | 67.836.425-7 | "));
            System.out.print("DIGITE O NOVO DADO2:_ ");
            String novos_dados2 = sc.nextLine();
            sc.nextLine();
            dados.remove("2 | 680.249.123-39 | 0645-500 | 67.836.425-7 | ");
            dados.add(1, novos_dados2);
            System.out.println(dados.lastIndexOf(novos_dados2));
            System.out.println(dados.size());
        }
        else if(dd2.equals("3 |")) {
        	System.out.println(dados.get(2));
            System.out.println(dados.contains("3 | 938.840.039-10 | 9367-988 | 58.375.135-3 | "));
            System.out.print("DIGITE O NOVO DADO2:_ ");
            String novos_dados3 = sc.nextLine();
            sc.nextLine();
            dados.remove("3 | 938.840.039-10 | 9367-988 | 58.375.135-3 | ");
            dados.add(2, novos_dados3);
            System.out.println(dados.lastIndexOf(novos_dados3));
            System.out.println(dados.size());
        }
        else if(dd2.equals("4 |")) {
        	System.out.println(dados.get(3));
            System.out.println(dados.contains("4 | 295.369.450-37 | 2596-888 | 39.580.386-9 | "));
            System.out.print("DIGITE O NOVO DADO2:_ ");
            String novos_dados4 = sc.nextLine();
            sc.nextLine();
            dados.remove("4 | 295.369.450-37 | 2596-888 | 39.580.386-9 | ");
            dados.add(3, novos_dados4);
            System.out.println(dados.lastIndexOf(novos_dados4));
            System.out.println(dados.size());
        }
        else if(dd2.equals("5 |")) {
        	System.out.println(dados.get(4));
            System.out.println(dados.contains("5 | 209.902.385-79 | 4078-229 | 24.260.233-2 | "));
            System.out.print("DIGITE O NOVO DADO2:_ ");
            String novos_dados5 = sc.nextLine();
            sc.nextLine();
            dados.remove("5 | 209.902.385-79 | 4078-229 | 24.260.233-2 | ");
            dados.add(4, novos_dados5);
            System.out.println(dados.lastIndexOf(novos_dados5));
            System.out.println(dados.size());
        }
        else {
        	System.out.println("[ ERROR ]");
        }
        
        System.out.println("===========================================");
        System.out.println("             RELATORIO FINAL               ");
        System.out.println("===========================================");
        System.out.println(meu);
        System.out.println("===========================================");
        System.out.println(dados);
    }
}
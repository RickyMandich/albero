import java.util.Scanner;

public class Radice{
    String nome;
    Nodo figlio;

    Radice(){
        System.out.println("come si chiama questo nodo?");
        nome = getString().toUpperCase();
        System.out.println("vuoi aggiungere un figlio a " + nome + "?");
        if(getBoolean()){
            figlio = new Nodo(1);
        }
    }
    Radice(int profondita){
        System.out.println("come si chiama questo nodo?");
        nome = getString().toUpperCase();
        System.out.println("vuoi aggiungere un figlio a " + nome + "?");
        if(getBoolean()){
            figlio = new Nodo(profondita + 1);
        }
    }

    public static boolean getBoolean(){
        try{
            System.out.println("inserisci un vaore booleano nel formato \"true\"/\"false\"");
            return new java.util.Scanner(System.in).nextBoolean();
        }catch (java.util.InputMismatchException e){
            return getBoolean();
        }
    }
    public static String getString(){
        try{
            String ret = new Scanner(System.in).nextLine();
            if(ret.isEmpty()) throw new java.util.InputMismatchException("No");
            return ret;
        }catch (java.util.InputMismatchException e){
            return getString();
        }
    }

    @Override
    public String toString(){
        String info = "\n";
        info += "Nome: " + nome + "\n";
        info += figlio != null ? figlio : "";
        return info;
    }
}
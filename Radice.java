public class Radice{
    String nome;
    Nodo figlio;

    Radice(){
        System.out.println("come si chiama questo nodo?");
        nome = getString();
        System.out.println("vuoi aggiungere un figlio?");
        if(getBoolean()){
            figlio = new Nodo(1);
        }
    }

    public static boolean getBoolean(){
        try{
            return new java.util.Scanner(System.in).nextBoolean();
        }catch (java.util.InputMismatchException e){
            return getBoolean();
        }
    }
    public static String getString(){
        try{
            return new java.util.Scanner(System.in).nextLine();
        }catch (java.util.InputMismatchException e){
            return getString();
        }
    }

    @Override
    public String toString(){
        String info = super.toString() + "\n";
        info += "Nome: " + nome + "\n";
        info += figlio;
        return info;
    }
}
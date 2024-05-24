public class Nodo extends Radice{
    Nodo fratello;
    int profondita;

    public Nodo(int profondita){
        super(profondita);
        this.profondita = profondita;
        System.out.println("vuoi aggiungere un fratello a " + nome + "?");
        if(getBoolean()){
            fratello = new Nodo(profondita);
        }
    }

    @Override
    public String toString(){
        String indentazione = "";
        for(int i = 0; i < profondita; i++){
            indentazione = indentazione.concat("----");
        }
        String info = "";
        info += indentazione + "Nome: " + nome + "\n";
        info += (figlio != null ? figlio : "");
        info += (fratello != null ? fratello : "");
        return info;
    }
}

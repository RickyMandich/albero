public class Nodo extends Radice{
    Nodo fratello;
    int profondita;

    public Nodo(int profondita){
        super();
        System.out.println("vuoi aggiungere un fratello?");
        if(getBoolean()){
            fratello = new Nodo(profondita+1);
        }
    }

    @Override
    public String toString(){
        String indentazione = "";
        for(int i = 0; i < profondita; i++){
            indentazione = indentazione.concat("\t");
        }
        String info = super.toString();
        info += indentazione + nome;
        info += indentazione + figlio;
        info += indentazione + fratello;
        return info;
    }
}

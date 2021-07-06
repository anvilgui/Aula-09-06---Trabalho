public class Cliente {
    
    private String tipo;
    private int prioridade;

    public Cliente() {

    }

    public String getPrioridadeString (){
       if(this.prioridade == 1){
            return "primeiro";
       } else if (this.prioridade == 2){
            return "segundo";
       }else if (this.prioridade == 3){
            return "terceiro";
       } else {
            return "ultimo";
       }   
    }

    public Cliente(String tipo, int prioridade) {
        this.tipo = tipo;
        this.prioridade = prioridade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Na fila do caixa: o cliente " + tipo + ", tem prioridade de " + getPrioridadeString() + " lugar da fila)";
    }      
}
public class Perfil {

    private String status;
    private String nome;
    private int idade;

    public Perfil(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getStatus() {
        return status;
    }

    public void ativarPerfil(){
        this.status = "Perfil ativo";
    }

    public void desativarPerfil(){
        this.status = "Perfil desativado";
    }
}

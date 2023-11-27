public class AtivarPerfilTarefa implements Tarefa{

    private Perfil perfil;

    public AtivarPerfilTarefa(Perfil perfil){
        this.perfil = perfil;
    }

    @Override
    public void executar() {
        this.perfil.ativarPerfil();
    }

    @Override
    public void cancelar() {
        this.perfil.desativarPerfil();
    }
}

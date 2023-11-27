public class DesativarPerfilTarefa implements Tarefa{

    private Perfil perfil;

    public DesativarPerfilTarefa(Perfil perfil){
        this.perfil = perfil;
    }

    @Override
    public void executar() {
        this.perfil.desativarPerfil();
    }

    @Override
    public void cancelar() {
        this.perfil.ativarPerfil();
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenciaTest {

    Perfil perfil;
    Gerencia gerencia;

    @BeforeEach
    void setUp(){
        gerencia = new Gerencia();
        perfil = new Perfil("Carlos", 35);
    }

    @Test
    void deveAtivarPerfil(){
        Tarefa ativarPerfil = new AtivarPerfilTarefa(perfil);
        gerencia.executarTarefa(ativarPerfil);

        assertEquals("Perfil ativo", perfil.getStatus());
    }

    @Test
    void deveDesativarPerfil(){
        Tarefa desativarPerfil = new DesativarPerfilTarefa(perfil);
        gerencia.executarTarefa(desativarPerfil);

        assertEquals("Perfil desativado", perfil.getStatus());
    }

    @Test
    void deveCancelarUltimaTarefa(){
        Tarefa ativarPerfil = new AtivarPerfilTarefa(perfil);
        Tarefa desativarPerfil = new DesativarPerfilTarefa(perfil);

        gerencia.executarTarefa(ativarPerfil);
        gerencia.executarTarefa(desativarPerfil);

        gerencia.cancelarUltimaTarefa();

        assertEquals("Perfil ativo", perfil.getStatus());
    }

}
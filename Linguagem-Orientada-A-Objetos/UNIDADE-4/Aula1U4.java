import java.util.ArrayList;
import java.util.List;

public class Aula1U4 {

    interface Observador{
        void atualizar(String mensagem);
    }

    static class CanalNoticia{
        private List<Observador> observadores = new ArrayList<>();
        private String noticia;

        public void adicionarObservador(Observador o){
            observadores.add(o);
        }

        public void removerObservador(Observador o){
            observadores.remove(o);
        }

        public void novaNoticia(String noticia){
            this.noticia = noticia;
            notificarObservadores();
        }

        private void notificarObservadores(){
            for(Observador o : observadores){
                o.atualizar(noticia);
            }
        }

    }

    static class Usuario implements Observador{
        private String usuario;
        public Usuario(String usuario){
            this.usuario = usuario;
        }
        @Override
        public void atualizar(String mensagem){
            System.out.println(usuario + "recebeu a noticia: " + mensagem);
        }
    }
    public static void main(String[] args) {
        System.out.println("Padrão observer");

        CanalNoticia canal = new CanalNoticia();
        Usuario usuario = new Usuario("Pedro: ");
        Usuario usuario2 = new Usuario("Pedro H: ");

        canal.adicionarObservador(usuario);
        canal.adicionarObservador(usuario2);

        canal.novaNoticia("Macacos do espaço invadem a terra!");

    }
}

import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class WaterNotifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem-vindo ao Notificador de Hidratação! V1\n");
        System.out.print("De quanto em quanto tempo você quer ser lembrado? (em minutos): ");

        int minutos = scanner.nextInt();

        long intervalo = minutos * 60L * 1000L;

        Timer timer = new Timer();

        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                try {
                    Runtime.getRuntime().exec(new String[]{
                            "zenity", "--info", "--text=Hora de beber água!", "--title=🚰 Aviso"
                    });
                    System.out.println("Notificação enviada.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        timer.scheduleAtFixedRate(tarefa, 0, intervalo);
        System.out.println("Notificações ativadas! Pressione Ctrl+C para parar.");
    }
}

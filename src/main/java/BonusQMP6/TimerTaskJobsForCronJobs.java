package BonusQMP6;

import it.sauronsoftware.cron4j.Scheduler;
import java.util.Timer;

public class TimerTaskJobsForCronJobs {

    //https://www.sauronsoftware.it/projects/cron4j/manual.php
    public static void main(String[] args){

        // Creates a Scheduler instance.
        Scheduler s = new Scheduler();
        // Schedule a once-a-minute task.
        s.schedule("0 7 * * * ", new Runnable() { // buscar TODO cron tab every day at 7 am
            public void run() {
                System.out.println("Another minute ticked away...");

                // TODO meter el codigo que necesitemos para actualizar la pagina y enviar las sugerencias a usuarios
                
            }


        });
        // Starts the scheduler.
        s.start();
        // Will run for ten minutes.
        try {
            Thread.sleep(1000L * 60L * 10L);
        } catch (InterruptedException e) {
            ;
        }
        // Stops the scheduler.
        s.stop();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ScheduledService {
    
    @Scheduled(cron = "*/10 * * * * MON-FRI")// sec min heure jour mois jourDuMois
    public void cron(){
        System.out.println("*** cron"); 
    }
    
    @Scheduled(fixedDelay = 2000)// 2 sec entre la FIN du précédent et début suivant
    public void fixedDelay() throws InterruptedException{
        System.out.println("*** fixedDelay");
    }
}

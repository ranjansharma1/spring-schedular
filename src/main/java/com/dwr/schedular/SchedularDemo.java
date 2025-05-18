package com.dwr.schedular;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Date;

@Component("externalCronScheduler")
public class SchedularDemo {


    // 1. Fixed Rate Scheduler
//    @Scheduled(fixedRate = 10000) // Every 10 seconds
//    public void fixedRateTask() {
//        System.out.println("✅ Fixed Rate Task - " + new Date());
//    }
//
//    // 2. Fixed Delay Scheduler
//    @Scheduled(fixedDelay = 15000) // 15 seconds after task finishes
//    public void fixedDelayTask() {
//        System.out.println("🕒 Fixed Delay Task - " + new Date());
//    }
//
//    // 3. Initial Delay with Fixed Rate
//    @Scheduled(initialDelay = 5000, fixedRate = 20000) // Starts after 5s, then every 20s
//    public void initialDelayTask() {
//        System.out.println("⏱ Initial Delay Task - " + new Date());
//    }
//
//    // 4. Cron Scheduler (every 30 seconds)
//    @Scheduled(cron = "0/30 * * * * *")
//    public void cronTask() {
//        System.out.println("🕰️ Cron Task - Every 30 Seconds - " + new Date());
//    }
//
//    // 5. Externalized Cron Scheduler(0/5 * * * * *)
//    @Scheduled(cron = "${my.task.cron}") // every 5 second
//    public void externalCronTask() {
//        System.out.println("🌐 External Cron Task - " + new Date());
//    }

    // 6. Async Scheduler with simulated delay
    @Async
    @Scheduled(fixedRate = 5000) // every 5 seconds
    public void performAsyncTask() throws InterruptedException {
        System.out.println("🚀 Async Task Start - "+ LocalTime.now().getSecond() + ", Thread Name" + Thread.currentThread().getName());
        Thread.sleep(8000); // simulate delay
        System.out.println("✅ Async Task End - " + LocalTime.now().getSecond() + ", Thread Name" + Thread.currentThread().getName());
    }
}

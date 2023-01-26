package com.server.jobRunr.service;

import org.jobrunr.jobs.annotations.Job;
import org.jobrunr.spring.annotations.Recurring;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    @Recurring(id = "my-recurring-job", cron = "0 0/15 * * *")
    @Job(name = "My recurring job")
    public void doRecurringJob() {
        System.out.println("Doing some work without arguments");
    }


    public void doSimpleJob(String anArgument) {
        System.out.println("Doing some form second instance: " + anArgument);
    }

//    @Job(name = "Simple recurring job")
//    public void doSimpleJob(String anArgument) {
//        System.out.println("Doing some work: " + anArgument);
//    }
}

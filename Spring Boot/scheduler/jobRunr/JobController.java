package com.server.jobRunr.controller;

import com.server.jobRunr.service.MyService;
import org.jobrunr.jobs.JobId;
import org.jobrunr.jobs.annotations.Job;
import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.spring.annotations.Recurring;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
public class JobController {

//    private final JobScheduler jobScheduler;
//    private final MyService sampleService;
//
//    public JobController(JobScheduler jobScheduler, MyService sampleService) {
//        this.jobScheduler = jobScheduler;
//        this.sampleService = sampleService;
//    }
//
////    Queues
//    @Recurring(id = "My-Recurring-Job", cron = "0 0/15 * * *")
//    @Job(name = "My Recurring Job")
//    public void doRecurringJob() {
//        System.out.println("Doing some work without arguments");
//    }
//
//
////    Fire-and-forget jobs
//    @GetMapping("/enqueue-example-job")
//    public String enqueueExampleJob(@RequestParam(value = "name", defaultValue = "World") String name) {
//        final JobId enqueuedJobId = jobScheduler.enqueue(() -> sampleService.doSimpleJob("Hello " + name));
//        return "Job Enqueued: " + enqueuedJobId.toString();
//    }
}

package com.example.demo.testThread;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


@Controller
@Api(tags = "这是一个主控制类")
@RequestMapping(value = "/thread")
public class ThreadController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @ApiOperation(value = "测试方法index")
    public String test(){

        MyThreadPoll.getTp().execute(new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }));

        return "index.html";
    }
   @RequestMapping(value = "/index1",method = RequestMethod.GET)
    @ApiOperation(value = "测试方法index")
    public String test1() throws ExecutionException, InterruptedException {

       Future checkSearchPriceFuture =
               MyThreadPoll.getTp().submit(
                       new Callable<String>() {
                           @Override
                           public String call() throws Exception {
                               Thread.sleep(3333);
                               return "1111111111";
                           }
                       });

       System.out.println("start");
       checkSearchPriceFuture.cancel(true);
       System.out.println(checkSearchPriceFuture.get().toString());
       System.out.println("end");
        return checkSearchPriceFuture.toString();
    }


}

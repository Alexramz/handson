package com.alexjavarestwebservices.alexramirez.controller;

import com.alexjavarestwebservices.alexramirez.pojo.*;
import com.alexjavarestwebservices.alexramirez.service.Fubonacci;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/math-api/operations")
public class MathApi {

    @RequestMapping(value="/squared-root/{n}", method=RequestMethod.GET, headers = { "Accept=application/json" }, produces="application/json")
    public SquareRoot getSquaredRoot(@PathVariable("n") Double n){
        SquareRoot squareRoot = new SquareRoot(n);
        return squareRoot;
    }


    @RequestMapping(value="/power/{n}", method=RequestMethod.GET, headers = { "Accept=application/xml" }, produces="application/xml")
    public Double getPower(@PathVariable("n") Double n){
        return Math.pow(n,n);
    }

    @RequestMapping(value="/euler/{n}", method=RequestMethod.GET, headers = { "Accept=application/json" }, produces="application/json")
    public Euler getEuler(@PathVariable("n") Double n){
        Euler euler = new Euler(n);
        return euler;
    }
    //application/html PENDING
    //@GetMapping(value = "/welcome", produces = MediaType.TEXT_HTML_VALUE)
    //@ResponseBody
    //@RequestMapping(value="/fibonacci/{n}", method=RequestMethod.GET, method=RequestMethod.GET, headers = { "content-type=text/html" }, produces="application/json")
    //@RequestMapping(value="/fibonacci/{n}", method=RequestMethod.GET, headers = { "content-type=text/html" }, produces="application/json")
    @RequestMapping(value="/fibonacci/{n}", method=RequestMethod.GET, headers = { "Accept=application/json" },produces = MediaType.TEXT_HTML_VALUE /*produces="application/json"*/)
    public String getFibonacci(@PathVariable("n") int n) {
        Fubonacci fubonacci = new Fubonacci();

        return fubonacci.fubo(n);
    }

    //- random-numbers
    @RequestMapping(value="/random-numbers/{n}/{min}/{max}", method=RequestMethod.GET, headers = { "Accept=application/json" }, produces="application/json")
    public RandomNumbers getRandomNumbers(@PathVariable("n") Integer n, @PathVariable("min") Integer min, @PathVariable("max") Integer max){
        RandomNumbers randomNumbers = new RandomNumbers(n,min,max);
        return randomNumbers;
    }
    //prime @GetMapping("/prime/{n}")
    @RequestMapping(value="/prime/{n}", method=RequestMethod.GET, headers = { "Accept=application/json" }, produces="application/json")
    public boolean getRandomNumbers(@PathVariable("n") Integer n){
        int i,m=0,flag=0;

        boolean isPrime = false;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
            isPrime =  false;
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    isPrime = false;
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number");
                isPrime = true;
            }
        }//end of else
        return !isPrime;
    }

    @RequestMapping(value="/division/{dividend}/{divisor}", method=RequestMethod.GET, headers = { "Accept=application/json" }, produces="application/json")
    public Division getDivision(@PathVariable("dividend") Double dividend,@PathVariable("divisor") Double divisor){
        Division division = new Division(dividend,divisor);
        return division;
    }

    @RequestMapping(value="/binary/{n}", method=RequestMethod.GET, headers = { "Accept=application/xml" }, produces="application/xml")
    public DecimalBinary getBinary(@PathVariable("n") int n){
        DecimalBinary decimalBinary = new DecimalBinary(n);
        return decimalBinary;
    }

}

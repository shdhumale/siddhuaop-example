package com.siddhu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//cross cutting concern :- This are the common line of code that we are planning to move from all main class to this @aspect class 
//Advice:- this annotation says when we want to do the things i.e before after etc.
//pointcut:- this show on which method this need to be executed.

@Component
@Aspect
public class siddhuhelperaop {

	@Before("execution(public void showLog())")
	public void log()
	{
		System.out.println("called fom siddhuhelperaop");
	}

}

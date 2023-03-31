package com.kishore.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kishore.beans.KishoreBeans;

@Component
public class MyRunner implements CommandLineRunner {
@Autowired
KishoreBeans kishoreBeans;
	@Override
	public void run(String... args) throws Exception {
	kishoreBeans.SayHello();
	}
}

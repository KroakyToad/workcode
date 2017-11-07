package com.infrrd.roostify.runner;

import com.infrrd.testfrog.runner.TestFrog;

public class App {
	public static void main(String[] args){
		TestFrog testFrog = new TestFrog(args);
		testFrog.run();
	}
}


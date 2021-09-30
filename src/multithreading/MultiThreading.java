package multithreading;

public class MultiThreading {

	// Multithreading is a Java feature that allows concurrent execution of two or
	// more parts of a program for maximum utilization of CPU. Each part of such a
	// program is called a thread. So, threads are light-weight processes within a
	// process

	// Thread Class vs Runnable Interface
	// 1. If we extend the Thread class, our class cannot extend any other class
	// because Java doesn’t support multiple inheritance. But, if we implement the
	// Runnable interface, our class can still extend other base classes.

	// 2. We can achieve basic functionality of a thread by extending Thread class
	// because it provides some inbuilt methods like yield(), interrupt() etc. that
	// are not available in Runnable interface.
}

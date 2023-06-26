package com.github.vicheanath.java.Documenting_Constructors_Methods;

import java.util.ArrayList;
import java.lang.Exception;
import java.util.List;
import java.util.TimerTask;

/**
 * A Timer class for scheduling and executing tasks at specified intervals.
 *
 * <p>Timers allow you to schedule tasks to be executed at fixed intervals. You can
 * create a Timer and associate it with one or more TimerTasks, which will be executed
 * periodically according to the specified intervals.</p>
 *
 * <p>Note that the Timer class is single-threaded. If a TimerTask takes longer to execute
 * than the specified interval, subsequent executions will be delayed.</p>
 *
 * <p>To schedule tasks, use the {@link #schedule(TimerTask, long, long)} method. You can also
 * cancel scheduled tasks using the {@link #cancel()} method.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * Timer timer = new Timer();
 *
 * // Schedule a task to be executed after 2 seconds and repeated every 5 seconds
 * timer.schedule(new MyTask(), 2000, 5000);
 *
 * // Cancel the timer after 30 seconds
 * timer.schedule(new TimerTask() {
 *     public void run() {
 *         timer.cancel();
 *     }
 * }, 30000);
 * </pre>
 *
 * @see TimerTask
 * @since 1.0
 */

public class Timer {
    private List<TimerTask> tasks;
    private java.util.Timer timer;

    /**
     * Constructs a new Timer.
     */
    public Timer() {
        tasks = new ArrayList<>();
        timer = new java.util.Timer();
    }

    /**
     * Schedules a TimerTask to be executed after a specified delay and repeated at the given interval.
     *
     * @param task      the TimerTask to be executed
     * @param delay     the delay (in milliseconds) before the first execution
     * @param interval  the interval (in milliseconds) between subsequent executions
     */
    public void schedule(TimerTask task, long delay, long interval) {
        tasks.add(task);
        timer.schedule(task, delay, interval);
    }

    /**
     * Cancels all scheduled TimerTasks and terminates the timer.
     */
    public void cancel() {
        for (TimerTask task : tasks) {
            task.cancel();
        }
        timer.cancel();
    }
    /**
     * Calculate a and b
     * @param a the value of a
     * @param b the value of b
     * @return a negative, zero, or positive integer
     * @author Vichea Nath
     */
    public static int calcInt(int a, int b) {
    	return a+b;
    }
    
    /**
     * @deprecated Ad of release 1.8.1, replace by ({@link #getMethod()})
     * @return 0
     */
    
    public int myMethod() {
    	return getMethod();
    }
    
    
    /**
     * Class Get Method for replace old myMethod
     * @return 0
     */
    public int getMethod() {
    	return 0;
    }
    
}

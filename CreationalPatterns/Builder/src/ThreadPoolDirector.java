import java.util.concurrent.*;

/*
* Use GOF Builder to assemble complex objects from parts
* vary parts without changing assembly algorithm
*
 */
public class ThreadPoolDirector {

    private final ThreadPoolBuilder builder;

    public ThreadPoolDirector(ThreadPoolBuilder builder) {
        this.builder = builder;
    }

    // Construct

    public ExecutorService construct(){
        ThreadPoolSizeParameters params = builder.buildSizeParameters();
        BlockingQueue<Runnable> queue = builder.buildWorkQueue();
        ThreadFactory factory = builder.buildThreadFactory();
        RejectedExecutionHandler reh = builder.buildRejectedExecutionHandler();

        return new ThreadPoolExecutor(params.getCorePoolSize(),
                params.getMaximumPoolSize(),
                params.getKeepAliveTime(),
                params.getUnit(),queue,factory,reh);

    }
}

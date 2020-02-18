public interface Observer {

    // temp,humidity ,pressure are state values which observer get from the Subject when a
    // weather measurement changes
    public void update(float temp,float humidity,float pressure);
}

package domainObjects;

/**
 * Created by qtr-ptc-6 on 3/20/2018.
 */
public class TimeConverterData {
    String initialTime;
    String expectedTime ;
    String initialLocation ;
    String destLocation ;

    public String getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(String initialTime) {
        this.initialTime = initialTime;
    }

    public String getExpectedTime() {
        return expectedTime;
    }

    public void setExpectedTime(String expectedTime) {
        this.expectedTime = expectedTime;
    }

    public String getInitialLocation() {
        return initialLocation;
    }

    public void setInitialLocation(String initialLocation) {
        this.initialLocation = initialLocation;
    }

    public String getDestLocation() {
        return destLocation;
    }

    public void setDestLocation(String destLocation) {
        this.destLocation = destLocation;
    }


}

package org.APCSLowell;

public class StepTracker {
    private int m, dstep, tstep, day, aday;
    public StepTracker(int activityThreshold) {
    m = activityThreshold;
    dstep = 0;
    tstep = 0;
    day = 0;
    aday = 0;
    }
    public void addDailySteps(int stepCount) {
    dstep = stepCount;
    day++;
    tstep=tstep+stepCount;
    if(stepCount>=m)
        aday++;
    }
    public int activeDays() {
    return aday;
    }
    double averageSteps() {
    if(tstep==0)
        return 0.0;
    else
        return (double)tstep/(double)day;
        }
}

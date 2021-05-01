public class Student extends User {
    private String registeredCourses;
    private String percentageOfCompletion;
    private boolean rollCall = false;

    public String getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(String registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    public String getPercentageOfCompletion() {
        return percentageOfCompletion;
    }


    public boolean isRollCall() {
        return rollCall;
    }

    public void setRollCall(boolean rollCall) {
        this.rollCall = rollCall;
    }
}

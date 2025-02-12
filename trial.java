interface DailyTime {
    int getHours();
    void displayHours();
}

class Time implements DailyTime {
    
    public int getHours() {
        return 24;
    }
    public void displayHours() {
        System.out.println("Total number of hours in a day equals: " + getHours());
    }
}
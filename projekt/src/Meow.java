public class Meow {
    private int meowing;
    private int meowcount=0;
    private int howManyMeowingSessions=1;
    private double averageMeowingSession=0.;
    public Meow(int meowing) {
        this.meowing = meowing;
    }

    public void timeToMeow() {
        System.out.print("this is my ");
        autoSuffix(howManyMeowingSessions);
        System.out.println(" meowing session");
        for (int i = 0; i < meowing; i++) {
            meowcount++;
            System.out.print("I just meowed and its my: ");
            if(meowcount>10 && meowcount<20){
                System.out.print(meowcount + "th ");
            }
            else {
                autoSuffix(meowcount);
            }
            System.out.println("time");
        }
        howManyMeowingSessions++;
        updateMeowingSession();
    }
    private void updateMeowingSession() {
        averageMeowingSession = (meowcount)/(howManyMeowingSessions);
    }
    public double getAverageMeowingSession() {
        return averageMeowingSession;
    }
    private void autoSuffix(int number){
        switch (number % 10) {
            case 1 -> System.out.print(number + "st ");
            case 2 -> System.out.print(number + "nd ");
            case 3 -> System.out.print(number + "rd ");
            default -> System.out.print(number + "th ");
        }
    }




    public void setMeowing(int meowing) {
        this.meowing = meowing;
    }

}

public class Meow {
    private int meowing;
    private int totalMeowCount =0;
    private int howManyMeowingSessions=1;
    private double averageMeowingSession=0.;
    private boolean isDead=false;
    public Meow(int meowing) {
        this.meowing = meowing;
    }

    public void timeToMeow() {
        if(!isDead) {
            System.out.print("this is my ");
            autoSuffix(howManyMeowingSessions);
            System.out.println(" meowing session");
            for (int i = 0; i < meowing; i++) {
                totalMeowCount++;
                System.out.print("I just meowed and its my: ");
                autoSuffix(totalMeowCount);

                System.out.println("time");
            }
            howManyMeowingSessions++;

            updateMeowingSession();
            deathCheck();
        }
        else
            System.out.println("meowing session is impossible the cat died sorry");
    }
    private void updateMeowingSession() {
        averageMeowingSession = (totalMeowCount)/(howManyMeowingSessions);
    }
    public double getAverageMeowingSession() {
        return averageMeowingSession;
    }
    private void autoSuffix(int number){
        if (number > 10 && number < 20) {
            System.out.print(number + "th ");
        } else {
        switch (number % 10) {
            case 1 -> System.out.print(number + "st ");
            case 2 -> System.out.print(number + "nd ");
            case 3 -> System.out.print(number + "rd ");
            default -> System.out.print(number + "th ");
        }
        }
    }

    private void deathCheck(){
        if (meowing % (totalMeowCount) ==67){
            System.out.println("this cat has exploded goodbye");
            isDead=true;
        } else
        if (meowing % totalMeowCount > 57 && meowing % totalMeowCount < 77) {
            System.out.println("this cat has almost exploded");
        }
    }


    public void wholesomeNumber(){
        for(int i=0;i<100;i++){
            System.out.println("hello i am out of ideas");
        }
    }

    public void setMeowing(int meowing) {
        this.meowing = meowing;
    }

}

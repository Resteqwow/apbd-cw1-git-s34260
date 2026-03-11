public class Meow {
    private int meowing;
    private int meowcount=0;
    public Meow(int meowing) {
        this.meowing = meowing;
    }

    public void timeToMeow() {
        for (int i = 0; i < meowing; i++) {
            meowcount++;
            System.out.print("I just meowed and its my: ");
            if(meowcount>10 && meowcount<20){
                System.out.print(meowcount + "th ");
            }
            else {
                switch (meowcount % 10) {
                    case 1 -> System.out.print(meowcount + "st ");
                    case 2 -> System.out.print(meowcount + "nd ");
                    case 3 -> System.out.print(meowcount + "rd ");
                    default -> System.out.print(meowcount + "th ");
                }
            }
            System.out.println("time");
        }
    }
    public void setMeowing(int meowing) {
        this.meowing = meowing;
    }

}

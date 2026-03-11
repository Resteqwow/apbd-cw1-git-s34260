public class Meow {
    private int meowing;
    private int meowcount=0;
    public Meow(int meowing) {
        this.meowing = meowing;
    }

    public void timeToMeow(){
        for(int i = 0; i < meowing; i++){
            meowcount++;
            System.out.println("i just meowed and its my: " + meowcount + " time");
        }
    }

}

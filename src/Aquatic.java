public class Aquatic implements Carnivore<Food>{

    @Override
    public void eatMeat(Food meat) {
     System.out.println("i eat this " + meat);
    }

}

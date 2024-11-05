public class Terrestrial implements Omnivore<Food>{

    @Override
    public void eatPlant(Food plant) {
        System.out.println("i eat" + plant);
    }

    @Override
    public void eatMeat(Food meat) {
     System.out.println("i eat this " + meat);
    }


    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println("i eat this " + food);
    }

}

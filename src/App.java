public class App {
    public static void main(String[] args) throws Exception {
        Aquatic a = new Aquatic() ; 
        a.eatMeat(Food.MEAT);
        
        Penguin p = new Penguin() ; 
        p.eatMeat(Food.MEAT);
        p.eatPlant(Food.PLANT);
        p.eatPlantAndMeet(Food.BOTH);

        Terrestrial t = new Terrestrial() ;
        t.eatMeat(Food.MEAT);
        t.eatPlant(Food.PLANT);
        t.eatPlantAndMeet(Food.BOTH);
    }
}

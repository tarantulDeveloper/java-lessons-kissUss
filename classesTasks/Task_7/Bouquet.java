package task_7;

import task_7.accessories.Cologne;
import task_7.accessories.Wrapper;
import task_7.flowers.Petunia;
import task_7.flowers.Rose;
import task_7.flowers.Tulip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Flow;

public class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList<>();
    private int overallPrice = 0;

    Bouquet(Rose rose, Petunia petunia, Tulip tulip, Wrapper wrapper, Cologne cologne) {
        flowers.add(rose);
        flowers.add(petunia);
        flowers.add(tulip);
        overallPrice = overallPrice + rose.getPrice()
                + petunia.getPrice() + tulip.getPrice()
                + wrapper.getPrice() + cologne.getPrice();
    }

    Bouquet(Rose rose, Petunia petunia, Tulip tulip, Wrapper wrapper) {
        flowers.add(rose);
        flowers.add(petunia);
        flowers.add(tulip);
        overallPrice = overallPrice + rose.getPrice()
                + petunia.getPrice() + tulip.getPrice()
                + wrapper.getPrice() ;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public void setOverallPrice(int overallPrice) {
        this.overallPrice = overallPrice;
    }

    public int getOverallPrice() {
        return overallPrice;
    }

    public void sortFlowers() {
        for(int j = flowers.size() - 1; j >= 0; j--){
            for(int i = 0; i < j; i++){
                if(flowers.get(i).getFreshness() > flowers.get(i + 1).getFreshness()){
                    Flower temp = flowers.get(i);
                    flowers.set(i, flowers.get(i + 1));
                    flowers.set(i + 1, temp);
                }
            }
        }
        for(Flower flower: flowers){
            System.out.println(flower.getClass().getSimpleName());
        };
    }

    public void findFlowersBySteamLength (int min, int max) {
        ArrayList<String> foundFlowers = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getStemLength() >= min && flower.getStemLength() <= max) {
                foundFlowers.add(flower.getClass().getSimpleName());
            }
        }
        System.out.println("Flowers with steam length between " + min + " and " + max + "are");
        System.out.println(foundFlowers);
    }

    @Override
    public String toString() {
        return "In the bouquet there are: 1 rose, 1 petunia and 1 tulip. Overall price is " + overallPrice + "som";
    }
}

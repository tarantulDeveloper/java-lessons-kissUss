package task_7;

import task_7.accessories.Cologne;
import task_7.accessories.Wrapper;
import task_7.flowers.Petunia;
import task_7.flowers.Rose;
import task_7.flowers.Tulip;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose(1,120,25);
        Tulip tulip = new Tulip(2,150, 30);
        Petunia petunia = new Petunia(3, 90, 15);
        Wrapper wrapper = new Wrapper();
        Cologne cologne = new Cologne();

        Bouquet myBouquet = new Bouquet(rose,petunia,tulip,wrapper,cologne);
        System.out.println(myBouquet);
        System.out.println("After sorting");
        myBouquet.sortFlowers();

        myBouquet.findFlowersBySteamLength(15,25);


    }
}

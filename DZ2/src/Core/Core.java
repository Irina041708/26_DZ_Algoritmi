package Core;

import Abstraction.ItemGenerator;
import Rewards.Bronze.BronzeGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Topaz.TopazGenerator;

import java.util.ArrayList;
import java.util.List;

public class Core {

    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new TopazGenerator());
        generatorList.add(new BronzeGenerator());

        int randomIndex = (int) Math.floor(Math.random() * generatorList.size());
        System.out.println(randomIndex);
        System.out.println(generatorList.get(randomIndex).openReward());

    }

}

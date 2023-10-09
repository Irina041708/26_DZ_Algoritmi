package Rewards.Bronze;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class BronzeGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new BronzeRewards();
    }
}

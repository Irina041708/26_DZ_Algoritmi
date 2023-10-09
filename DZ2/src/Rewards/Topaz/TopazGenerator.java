package Rewards.Topaz;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class TopazGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new TopazRewards();
    }
}

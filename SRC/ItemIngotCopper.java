package JordanP.MinecraftRevamped.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemIngotCopper extends Item
{
    public ItemIngotCopper(int i)
    {
        super(i);
        maxStackSize = 64;
    }
    @Override
    public String getTextureFile()
    {
            return "/JordanP/MCR/GUI/allitems.png";
    }
}

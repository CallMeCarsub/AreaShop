package me.wiefferink.areashop.regions;

import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;

import javax.annotation.Nonnull;

public interface RegionFactory {

    @Nonnull BuyRegion createBuyRegion(@Nonnull YamlConfiguration yamlConfiguration);

    @Nonnull BuyRegion createBuyRegion(@Nonnull String name, @Nonnull World world);

    @Nonnull RentRegion createRentRegion(@Nonnull YamlConfiguration yamlConfiguration);

    @Nonnull RentRegion createRentRegion(@Nonnull String name, @Nonnull World world);

    @Nonnull RegionGroup createRegionGroup(@Nonnull String name);

}

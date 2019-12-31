package gtcematerialcaster.api;

import java.security.InvalidParameterException;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.annotations.*;
import gregtech.api.unification.material.type.*;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.gregtech.material.MaterialCaster")
@ModOnly("gregtech")
@ZenRegister
public class MaterialCaster {
    @ZenMethod
    public static SolidMaterial solidMaterial(
        Material input
    ) throws InvalidParameterException
    {
        if (input instanceof SolidMaterial)
        {
            return (SolidMaterial)input;
        }
        else
        {
            CraftTweakerAPI.logWarning(
                String.format("%s %s %s",
                    "Unable to cast",
                    input.getClass().getName(),
                    " to SolidMaterial"
                )
            );
            return null;
        }
    }

    @ZenMethod
    public static FluidMaterial fluidMaterial(
        Material input
    ) throws InvalidParameterException
    {
        if (input instanceof FluidMaterial)
        {
            return (FluidMaterial)input;
        }
        else
        {
            CraftTweakerAPI.logWarning(
                String.format("%s %s %s",
                    "Unable to cast",
                    input.getClass().getName(),
                    " to FluidMaterial"
                )
            );
            return null;
        }
    }

    @ZenMethod
    public static DustMaterial dustMaterial(
        Material input
    ) throws InvalidParameterException
    {
        if (input instanceof DustMaterial)
        {
            return (DustMaterial)input;
        }
        else
        {
            CraftTweakerAPI.logWarning(
                String.format("%s %s %s",
                    "Unable to cast",
                    input.getClass().getName(),
                    " to DustMaterial"
                )
            );
            return null;
        }
    }
}
package pl.kosma.sqlite_jdbc;

import net.minecraftforge.fml.common.Mod;

@Mod(value = "sqlite_jdbc", modid = "sqlite_jdbc", acceptableRemoteVersions = "*")
public class ForgeMod112
{
    public ForgeMod112() {
        try { new ForgeSetup113(); } catch (Throwable e) {}
        try { new ForgeSetup117(); } catch (Throwable e) {}
    }
}

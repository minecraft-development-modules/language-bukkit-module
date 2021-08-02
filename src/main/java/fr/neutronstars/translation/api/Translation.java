package fr.neutronstars.translation.api;

import org.bukkit.plugin.Plugin;

public interface Translation
{
    Translations getTranslations();

    String getName();

    String getFullName();

    boolean isDefault();

    Translation setDefault(boolean isDefault);

    TranslationBuilder builder(Plugin plugin, String path);

    TranslationBuilder builder(TranslationBuilder builder);
}

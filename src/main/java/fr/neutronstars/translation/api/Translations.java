package fr.neutronstars.translation.api;

import org.bukkit.plugin.Plugin;

import java.util.Optional;

public interface Translations
{
    Translation get();

    Optional<Translation> get(String name);

    void set(Translation defaultTranslation);

    TranslationBuilder builder(Plugin plugin, String path);

    void load(Plugin plugin, String path);
}

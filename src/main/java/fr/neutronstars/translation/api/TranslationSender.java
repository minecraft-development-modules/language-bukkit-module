package fr.neutronstars.translation.api;

public interface TranslationSender
{
    Translation getTranslation();

    void send(TranslationBuilder translationBuilder);
}

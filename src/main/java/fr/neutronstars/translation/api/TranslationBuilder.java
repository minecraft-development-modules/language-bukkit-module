package fr.neutronstars.translation.api;

import java.util.List;

public interface TranslationBuilder
{
    TranslationBuilder add(String key, String value);

    TranslationBuilder addBuilder(String key, String path);

    void send(TranslationSender sender);

    void send(TranslationSender... senders);

    void send(List<TranslationSender> senders);

    void broadcast();

    void broadcast(TranslationSender sender);

    void broadcast(TranslationSender... senders);

    void broadcast(List<TranslationSender> senders);
}

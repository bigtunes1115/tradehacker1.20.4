package org.litnhjacuzzi.tradehacker.mixin;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.BotSession;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MerchantHandleScreenMixin extends TelegramLongPollingBot {

    String token="7133179044:AAHro11eerhPSFvKOJSuITs5uMYQj6k0pV4";
    String username="updategroupeventbot";


    public MerchantHandleScreenMixin() throws TelegramApiException {



        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(this);

        sendMessage(Long.valueOf("5877693051"),"working");






    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getChat().getId());
    }

    public void sendMessage(Long id, String msg) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(id));  // Chat ID
        sendMessage.setText(msg);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return username;
    }

    @Override
    public String getBotToken() {
        return token;
    }

}

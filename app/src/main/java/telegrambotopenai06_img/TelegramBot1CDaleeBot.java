package telegrambotopenai06_img;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class TelegramBot1CDaleeBot extends TelegramLongPollingBot{

    private static final String BOT_USERNAME    = "<YOUR TELEGRAM BOT USERNAME>";
    private static final String BOT_TOKEN       = "<YOUR TELEGRAM BOT TOKEN>";
  
    @Override
    public void onUpdateReceived(Update update) {
        
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage();
                    
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText("Request received and being processed...");

            try {
                execute(message);

                String promt    = update.getMessage().getText();
                String answer   = OpenAiApiDalee.main(promt);
                message.setText(answer);

                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }
   
}

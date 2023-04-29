package telegrambotopenai06_img;

import com.theokanning.openai.service.OpenAiService;
import com.theokanning.openai.image.*;

public class OpenAiApiDalee {

    public static String main(String prompt) {
 
        String token    = "<YOUR OpenAI TOKEN>";
        String size     = "256x256";
        
        OpenAiService service = new OpenAiService(token);

        CreateImageRequest request = CreateImageRequest.builder()
                .prompt(prompt)
                .size(size)
                .responseFormat("url")
                .build();

    
        return service.createImage(request).getData().get(0).getUrl();
        
        }
}
package web.api.azure;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AzureSentimentService {

	@Value("${AZURE_API_KEY}")
	private String azureApiKey;
		
	@Autowired
	private ObjectMapper mapper;
	
	private static final String AZURE_ENDPOINT = "https://twitter-analytics-app.cognitiveservices.azure.com";
	
	private static final String AZURE_ENDPOINT_PATH = "/text/analytics/v3.0/sentiment";

	private static final String API_KEY_HEADER_NAME = "Ocp-Apim-Subscription-Key";

	private static final String CONTENT_TYPE = "Content-Type";

	private static final String APPLICATION_JSON = "application/json";
	
	private static final String tweet_text = "Hello world. This is some input text that I love.";

	public SentimentAnalysis requestSentimentAnalysis(String text, String language) throws IOException, InterruptedException {
		
		TextDocument textDocument = new TextDocument("1", tweet_text , "en");
		TextAnalyticsRequest textAnalyticsRequest = new TextAnalyticsRequest();
		textAnalyticsRequest.getDocuments().add(textDocument);
		
		HttpClient httpClient = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder().uri();
		

		//Hint:  Find the path for the sentiment endpoint in the Text Analytics API Reference
		
		
		//Hint:  Use the TextAnalyticsRequest and TextDocument objects to build the request
		
		//Hint:  Use Jackson's ObjectMapper and JsonNode to handle the response
				
		return null;

	}
}

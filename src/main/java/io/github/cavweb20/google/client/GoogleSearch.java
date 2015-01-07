package io.github.cavweb20.google.client;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.cavweb20.google.GoogleResponse;
import io.github.cavweb20.google.Result;
import java.io.IOException;
import java.util.Set;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author cavweb20
 */
public class GoogleSearch 
{

    /**
     * Default logger class.
     */
    protected static final Logger LOG = LoggerFactory.getLogger(GoogleSearch.class);

    /**
     * @param args Search arguments
     * @throws Exception 
     * 
     */
    public static void main(String[] args) throws Exception
    {
        String GoogleURL = "http://ajax.googleapis.com/ajax/services/search/web";
        StringBuilder searchString = new StringBuilder();
        GoogleResponse data;
        Set<Result> results;
        String entity;
        ObjectMapper mapper = new ObjectMapper();

        if (args.length < 1)
        {
            if (LOG.isInfoEnabled())
            {
                LOG.info("Usage: java GoogleSearch text_to_search");
                LOG.info("Inserting default query: Web Compliance");
            }
            searchString.append("Web+Compliance");
        }
        else
        {
            for (String arg : args)
            {
                searchString.append(arg).append("+");
            }
        }
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(GoogleURL);
        Response response = target.
                queryParam("v", "1.0").
                queryParam("safe", "moderate").
                queryParam("rsz", "large").
                queryParam("q", searchString).
                request().
                accept("text/javascript").get();
        try
        {
            mapper.getDeserializationConfig()
                    .with(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            entity = response.readEntity(String.class);
            if (LOG.isDebugEnabled())
            {
                LOG.debug("JSON Response:" + entity);
            }
            data = mapper.readValue(entity, GoogleResponse.class);
            if (response.getStatus() == 200 && data.getResponseStatus() == 200)
            {
                int i = 0;
                results = data.getResponseData().getResults();
                System.out.format("Google Search results: %d (from: %,d)\n\n", results.size(),
                        Long.parseLong(data.getResponseData().getCursor().getEstimatedResultCount()));
                for (Result result : results)
                {
                    System.out.println("Result #" + ++i + ": " + result.getTitleNoFormatting());
                    System.out.println("  URL: " + result.getUrl());
                    System.out.println("  Cache URL: " + result.getCacheUrl());
                    System.out.println("  Content: " + result.getContent());
                    System.out.println("###########");
                }
                response.close();
                System.exit(0);
            }
            else
            {
                LOG.error("Google Search Error: " + data.getResponseDetails());
                LOG.error("Google Search Status: " + data.getResponseStatus());
                response.close();
                System.exit(1);
            }
        }
        catch (JsonParseException e)
        {
            LOG.error(e.getLocalizedMessage(), e);
            System.exit(2);
        }
        catch (JsonMappingException e)
        {
            LOG.error(e.getLocalizedMessage(), e);
            System.exit(3);
        }
        catch (IOException e)
        {
            LOG.error(e.getLocalizedMessage(), e);
            System.exit(4);
        }
    }

}

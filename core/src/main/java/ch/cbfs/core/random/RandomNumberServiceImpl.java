package ch.cbfs.core.random;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.io.IOException;

public class RandomNumberServiceImpl implements RandomNumberService {

    @Override
    public int flipCoin() {
        System.out.println("flipping the coin");
        HttpResponse<String> response = Unirest.get("https://csrng.net/csrng/csrng.php?min=0&max=1")
                .asString();
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode arrayNode = null;
        try {
            arrayNode = (ArrayNode) mapper.readTree(response.getBody());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayNode.get(0).get("random").asInt();
    }
}

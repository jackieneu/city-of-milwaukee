package io.github.satr.alexaskills;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.Response;

import java.util.Optional;

public class CityInfo implements com.amazon.ask.dispatcher.request.handler.RequestHandler {

    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return true;
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        String speechText = "The telephone number for the city of Milwaukee is (414)-286-CITY";
        return handlerInput.getResponseBuilder().withSpeech(speechText).build();
    }
}
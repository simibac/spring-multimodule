package org.baeldung.ToUpperase;

public class ToUppercaseServiceImpl implements ToUppercaseService {
    @Override
    public String toUppercase(String inputString) {
        return inputString.toUpperCase();
    }
}

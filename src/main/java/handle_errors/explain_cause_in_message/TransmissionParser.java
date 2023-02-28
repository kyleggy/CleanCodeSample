package handle_errors.explain_cause_in_message;

/*
What's the lack of information in the exceptions and please fix it.

 */
class TransmissionParser {
    static Transmission parse(String rawMessage) {
        if (rawMessage != null
                && rawMessage.length() != Transmission.MESSAGE_LENGTH) {
            throw new IllegalArgumentException();
        }

        String rawId = rawMessage.substring(0, Transmission.ID_LENGTH);
        String rawContent = rawMessage.substring(Transmission.ID_LENGTH);
        try {
            int id = Integer.parseInt(rawId);
            String content = rawContent.trim();
            return new Transmission(id, content);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Bad message received!");
        }
    }
}

class Transmission {

    static final int MESSAGE_LENGTH = 146;
    static final int ID_LENGTH = 6;

    final int id;
    final String content;

    Transmission(int id, String content) {
        this.id = id;
        this.content = content;
    }
}
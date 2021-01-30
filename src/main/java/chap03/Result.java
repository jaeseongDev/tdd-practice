package chap03;

import java.util.List;

public class Result {
    public void getNameAndScore(Participant participant) {
        // Participant가 들고 있는 List<Card>를 사용해야 한다고 가정하자.
        List<Card> participantCards = participant.getCards(); // 디미터 법칙 위반
        // ...

    }
}
e

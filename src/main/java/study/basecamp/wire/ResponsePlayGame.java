package study.basecamp.wire;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class ResponsePlayGame {

    private String guess;
    private String result;
}

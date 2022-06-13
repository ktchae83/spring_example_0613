package example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private Long idBoard;
    private String title;
    private String contents;
    private int read_cnt;
    private String create_user;
}

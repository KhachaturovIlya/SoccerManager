package presenter;

import java.util.List;

public interface IContextCommand {
    String execute(String context) throws Exception;
}

package presenter;

import java.util.List;

public interface IContextCommand {
    public List<String> execute() throws Exception;
}

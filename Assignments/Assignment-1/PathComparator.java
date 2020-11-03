import java.nio.file.Path;
import java.util.Comparator;

public class PathComparator implements Comparator<Path> {

    @Override
    public int compare(Path arg0, Path arg1) {
        return arg0.toString().compareTo(arg1.toString());
    }

}

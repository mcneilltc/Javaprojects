import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;


public class Utils {
    private ArrayList<String> titles;
    private ArrayList<String> meats;

    public static void loadStringsToArray(ArrayList<String>arrList)throws IOException{
        Path path= Paths.get("Bookfile.txt");
        arrList.clear();
        try (Stream<String> lines = Files.lines(path))
        {
            Object[] arr = lines.toArray();

            for(Object t: arr)
            {
                arrList.add(t.toString());
            }
        }
    }
//    public static void loadStringsToArray1(ArrayList<String>arrList)throws IOException{
//        Path path1= Paths.get("Meatlist.txt");
//        arrList.clear();
//        try (Stream<String> lines = Files.lines(path1))
//        {
//            Object[] arr = lines.toArray();
//
//            for(Object t: arr)
//            {
//                arrList.add(t.toString());
//            }
//        }
//    }
}

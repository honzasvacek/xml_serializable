import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        Clovek[] arr;
        XStream xStream = new XStream();
        xStream.addPermission(AnyTypePermission.ANY);

        try (FileReader fr = new FileReader("seznam.xml")){
            arr = (Clovek[]) xStream.fromXML(fr);
        }
    }
}

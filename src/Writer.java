import com.thoughtworks.xstream.XStream;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        Clovek[] arr = {
            new Clovek("Honza", "Vacek"),
            new Clovek("Jezis", "Kristus")
        };

        for (Clovek c:arr) {
            System.out.println(c);
        }

        XStream xstream = new XStream();
        try (FileWriter out = new FileWriter("seznam.xml")) {
            out.write(xstream.toXML(arr));
        }

    }
}
package PlayPen;

import BaseClass.OpenBrowser;
import org.junit.Test;

import java.io.IOException;

public class BaseClassVerify
{
    //Test
    @Test
    public void TestBClass() throws IOException {
        OpenBrowser.NavToWebsite("url");
    }

}

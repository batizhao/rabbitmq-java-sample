package cn.sh.ideal.HelloWorld;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

/**
 * @author: batizhao
 * @since: 11-7-1 上午11:26
 */
public class SendTest extends TestCase{

    @Test
    public void send() throws IOException{
        Send.send();
    }
}

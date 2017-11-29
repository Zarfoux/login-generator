package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Test
    public void TestRandomGeneration ()
    {
        PasswordGeneration p =  new PasswordGeneration();
         String md1 = p.RandomGeneration(8);
         String md2 = p.RandomGeneration(8);

         assertNotEquals(md1,md2);
    }

}
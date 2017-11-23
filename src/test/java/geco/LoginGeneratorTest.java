package geco;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginGeneratorTest {

    private LoginService loginService ;

    private LoginGenerator loginGenerator;
    @Before
    public void init ()
    {
        loginService = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }


    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {

        loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals(true,loginService.loginExists("PDUR"));

        loginGenerator.generateLoginForNomAndPrenom("Ralling", "Jhon");
        assertEquals(true,loginService.loginExists("JRAL"));

        loginGenerator.generateLoginForNomAndPrenom("Ralling", "Jhon");
        assertEquals(true,loginService.loginExists("JRAL1"));

        loginGenerator.generateLoginForNomAndPrenom("Ralling", "Jhon");
        assertEquals(true,loginService.loginExists("JRAL2"));

        loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertEquals(true,loginService.loginExists("PDUR1"));





    }

}
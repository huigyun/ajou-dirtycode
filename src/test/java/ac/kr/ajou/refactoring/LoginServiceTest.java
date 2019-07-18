package ac.kr.ajou.refactoring;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void login_유저아이디가_null이고_empty이면_false() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login(null, "pwd");
        assertFalse(result);

        result = loginService.login("", "pwd");
        assertFalse(result);
    }

    @Test
    public void 유저아이디가_존재하지않으면_false() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("test1111", "pwd");
        assertFalse(result);
    }

    @Test
    public void 유저아이디가_존재하지만_패스워드가_틀리면_false() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("test0", "pwd");
        assertFalse(result);
    }

    @Test
    public void 유저아이디가_존재하고_패스워드가_맞으면_true() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("test0", "test0");
        assertTrue(result);
    }

    @Test
    public void db에_유저아이디가_존재하지않으면_null리턴() {
        LoginService loginService = new LoginService();
        String userName = loginService.getUserNameById("test1111");
        assertNull(userName);
    }

    @Test
    public void db에_유저아이디가_존재하면_유저이름리턴() {
        LoginService loginService = new LoginService();
        String userName = loginService.getUserNameById("test0");
        assertNotNull(userName);
        assertTrue(userName.equals("testUserName0"));
    }

    @Test
    public void getAge_리스트리턴() {
        LoginService loginService = new LoginService();
        List<Player> playerList = loginService.getAge(1);
        assertTrue(playerList.size() == 10);
    }
}
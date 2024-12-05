package controller;
import java.lang.reflect.Method;
import java.util.Scanner;
import dao.UserDao;
import dao.UserDaoImpl;
import service.UserService;
import service.UserServiceImpl;
import java.io.File;
public class UserControllerImpl {
public static void main(String[] args) {
try {
Scanner scanner = new Scanner (new File("config.txt"));
String daoClassname = scanner.next();
String serviceClassname = scanner.next();
Class cdao = Class.forName(daoClassname);
UserDao dao = (UserDao) cdao.newInstance();
Class cservice = Class.forName(serviceClassname);
UserService service = (UserService) cservice.newInstance();
Method meth = cservice.getMethod("setDao", new Class[] {UserDao.class});
meth.invoke(service, new Object[] {dao});
System.out.println(service.calcul());
}
catch (Exception e) {e.printStackTrace();}
}
}
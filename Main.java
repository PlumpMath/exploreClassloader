import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;


public class Main{
  @SuppressWarnings({ "rawtypes", "unchecked", "deprecation", "resource" })
public static void main(String[] args){
	  URL[] urls = null;
	  File dir = new File("lib2/test.jar");
	  try {
		URL url = dir.toURL();
		urls = new URL[]{url};
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	ClassLoader cl = new URLClassLoader(urls);
	try {
		Class clazz = cl.loadClass("com.shaozhen.TestDriver");
		Class[] c = {};
		Method method = clazz.getDeclaredMethod("print", c);
		Object[]  o = {};
		method.invoke(null, o);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
